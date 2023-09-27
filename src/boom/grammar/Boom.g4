grammar Boom;

file
: code
| EOF
;

code
: statement '!' code
| statement '!'
| while
;

statement
: decl
| assign
| print
;

decl: 'POW' ID;

assign: ID 'ZAP' expr;

print: 'KABOOM' ID;

expr
: unaryExpr
| addExpr
;

unaryExpr
: ID
| INT
;


addExpr
: unaryExpr 'BAM' expr
;

lesser
: unaryExpr 'GULP' unaryExpr
;

greater
: unaryExpr 'HMPH' unaryExpr
;

cond
: lesser
| greater
;


while: 'ZOINKS' '(' cond ')' '?'
        code
        '?!'
;


ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;