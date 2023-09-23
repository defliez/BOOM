grammar Boom;

file
: code
;

code
: statement '!' code
|
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
: ID
| INT
;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;