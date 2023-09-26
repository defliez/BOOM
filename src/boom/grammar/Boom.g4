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

compareExpr
: greaterExpr
| lesserExpr
;

greaterExpr
: expr 'HMPH' expr
;

lesserExpr
: expr 'GULP' expr
;

while: 'ZOINKS' compareExpr '?!' code '!?';


ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;