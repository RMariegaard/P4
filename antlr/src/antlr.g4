grammar antlr;
prog      : predcl* setup gameloop (strategy | method)*
          ;
setup     : 'setup' block
          ;
gameloop  : 'game-loop' block
          ;
method    : 'function' ID '(' (dcl( ',' dcl)*)? ')' block
          ;
predcl    : dcl NEWLINE+ | 'event' '('expr')' '->' ID NEWLINE+
          ;

block     : NEWLINE+ stmt* 'end' NEWLINE+
          ;
stmt      : dcl NEWLINE+                                                                #dclStmt
          | assign NEWLINE+                                                             #assignStmt
          | action NEWLINE+                                                             #actionStmt
          | 'if' '(' expr ')' block ('else' 'if' '(' expr ')' block )* ('else' block)?  #ifStmt
          | 'do' '(' dcl ',' expr ',' expr ',' expr ')' block                           #doStmt
          | 'while''(' expr ')' block                                                   #whileStmt
          | 'return' expr                                                               #returnStmt
          ;

action    : ID ( '.' ID )* '.' fcall
          | fcall
          ;

strategy  : 'strategy' ID NEWLINE+ behavior+
          ;
behavior  : 'behavior' ID block
          ;
fcall     : ID '(' (expr (',' expr)*)? ')'
          ;
dcl       : type assign
          | type ref
          ;
type      : ('bool' | 'int' | 'text' | 'char' | 'decimal')
          ;
ref       : ID
          | ID '[' expr ']'
          ;
assign    :ref '=' expr
          ;
expr      : term( '+' | '-' ) expr                                    #infixExpr
          | term                                                      #termExpr
          | ID '[' expr ']'                                           #arrayExpr
          | (term | action) ( '==' | '>=' | '<=' | '<' | '>') expr    #boolExpr
          | action                                                    #actionExpr
          | term ( '&&' | '||' ) expr                                 #andOrExpr
          |'!'expr                                                    #notExpr
          |factor('++'|'--')                                          #unaryExpr
          ;
term      : factor ('*' | '/') term
          | factor
          ;
factor    : '(' expr ')'
          | (ID | INT_NUM |BOOL_VALUE | DECIMAL_NUM | CHAR_VALUE)
          ;

NEWLINE: '\n';
ID: [a-zA-Z]+ ([a-zA-Z0-9])*;
BOOL_VALUE: 'true' | 'false';
INT_NUM: [0-9]+ ;
DECIMAL_NUM: [0-9]+ ('.' [0-9]+)? ;
CHAR_VALUE: '"'.'"';


WS: [ \t\r] ->skip;
COMMENTS: '//' ~('\r' | '\n')* -> skip;