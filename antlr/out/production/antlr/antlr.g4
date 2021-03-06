grammar antlr;
prog      : NEWLINE* predcl* setup gameloop (strategy | method)* EOF
          ;
setup     : 'setup' block
          ;
gameloop  : 'game-loop' block
          ;
method    : 'function' rtype ID '(' (argmnt( ',' argmnt)*)? ')' block
          ;
predcl    : dcl NEWLINE+                                                                #pdcl
          | 'event' '('aoexpr')' '->' ID NEWLINE+                                       #eventDcl
          ;

block     : NEWLINE+ stmt* 'end' NEWLINE+
          ;
stmt      : dcl NEWLINE+                                                                         #dclStmt
          | assign NEWLINE+                                                                      #assignStmt
          | action NEWLINE+                                                                      #actionStmt
          | 'if' '(' first=aoexpr ')' firstBlock=block (elseif)* ('else' secondBlock=block)?     #ifStmt
          | 'do' '(' argmnt',' firstAo=aoexpr ',' secondAo=aoexpr ',' thirdAo=aoexpr ')' block   #doStmt
          | 'while''(' aoexpr ')' block                                                          #whileStmt
          | 'return' expr NEWLINE+                                                               #returnStmt
          | ref op=('++'|'--') NEWLINE+                                                          #incrStmt
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

type      : ('bool' | 'int' | 'text' | 'decimal')
          ;

rtype     : 'void' | type
          ;

ref       : ID
          | ID '[' expr ']'
          ;

assign    :ref '=' aoexpr
          ;

aoexpr     : bexpr op=( '&&' | '||' ) aoexpr
          | bexpr
          ;
bexpr    : expr op=( '==' | '>=' | '<=' | '<' | '>') bexpr               #boolexpr
          |'!' expr                                                   #notexpr
          | expr                                                      #emptyboolexpr
          ;
expr      : term op=( '+' | '-' ) expr                                #infixExpr
          | term                                                      #termExpr
          ;
term      : factor op=('*' | '/') term
          | factor
          ;
factor    : '(' aoexpr ')'                                          #parenFactor
          | value=( INT_NUM |BOOL_VALUE | DECIMAL_NUM | TEXT)       #valueFactor
          | '-'factor                                               #negativeFactor
          | action                                                  #actionFactor
          | ref                                                     #refFactor
          | ref op=('++'|'--')                                      #unaryExpr
          ;

OP_ADD : '+';
OP_SUB : '-';
OP_UADD : '++';
OP_USUB : '--';
OP_MUL : '*';
OP_DIV : '/';
OP_AND : '&&';
OP_OR : '||';
OP_GREATER : '>';
OP_LESS : '<';
OP_EQUAL : '==';
OP_GREATEREQUAL : '>=';
OP_LESSEQUAL: '<=';

NEWLINE: '\n';
BOOL_VALUE: 'true' | 'false';
ID: [a-zA-Z]+ ([a-zA-Z0-9])*;
INT_NUM: [0-9]+ ;
DECIMAL_NUM: [0-9]+ ('.' [0-9]+)? ;

ESC: '\\' [btnr"\\];
TEXT: '"'(ESC| ~[\n])*?'"';


WS: [ \t\r] ->skip;
COMMENTS: '//' ~('\r' | '\n')* -> skip;

