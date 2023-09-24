grammar Boom;

file
: code
| EOF
;

code
: statement '!' code
| statement '!'
;

statement
: decl
| assign
| print
;

decl: 'POW' ID;

assign: ID 'ZAP' expr;

print: 'KABOOM' expr;

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

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;