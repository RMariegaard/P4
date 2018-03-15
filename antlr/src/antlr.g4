grammar antlr;
prog      : predcl* setup gameloop sm* EOF
          ;
sm        : strategy | method
          ;
setup     : 'setup' block
          ;
gameloop  : 'game-loop' block
          ;
method    : 'function' ID '(' (argmnt( ',' argmnt)*)? ')' block
          ;
predcl    : dcl NEWLINE+
          | 'event' '('aoexpr')' '->' ID NEWLINE+
          ;

block     : NEWLINE+ stmt* 'end' NEWLINE+
          ;
stmt      : dcl NEWLINE+                                                                #dclStmt
          | assign NEWLINE+                                                             #assignStmt
          | action NEWLINE+                                                             #actionStmt
          | 'if' '(' first=aoexpr ')' firstBlock=block (elseif)* ('else' secondBlock=block)?  #ifStmt
          | 'do' '(' argmnt',' firstAo=aoexpr ',' secondAo=aoexpr ',' thirdAo=aoexpr ')' block                 #doStmt
          | 'while''(' aoexpr ')' block                                                   #whileStmt
          | 'return' expr NEWLINE+                                                               #returnStmt
          ;

elseif    : 'else' 'if' '(' aoexpr ')' block
          ;

action    : ID ( '.' ID )* '.' fcall
          | fcall
          ;

strategy  : 'strategy' ID NEWLINE+ behavior+ 'end' NEWLINE+
          ;
behavior  : 'behavior' ID block
          ;
fcall     : ID '(' (expr (',' expr)*)? ')'
          ;
dcl       : type assign
          | type ref
          ;
argmnt    : type ref
          ;

type      : ('bool' | 'int' | 'text' | 'char' | 'decimal')
          ;
ref       : ID
          | ID '[' expr ']'
          ;

assign    :ref '=' expr
          |ref('++'|'--')
          ;

aoexpr     : bexpr ( '&&' | '||' ) aoexpr
          | bexpr
          ;
bexpr    : expr ( '==' | '>=' | '<=' | '<' | '>') bexpr               #boolexpr
          |'!' expr                                                   #notexpr
          | expr                                                      #emptyboolexpr
          ;
expr      : term( '+' | '-' ) expr                                    #infixExpr
          | term                                                      #termExpr
          | ID '[' expr ']'                                           #arrayExpr
          | action                                                    #actionExpr
          |factor('++'|'--')                                          #unaryExpr
          ;
term      : factor ('*' | '/') term
          | factor
          ;
factor    : '(' aoexpr ')'
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