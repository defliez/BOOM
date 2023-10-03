grammar Boom;

file
: code
| EOF
;

code                    // code can consist of:
: statement '!'         // a statement followed by a '!'
| statement '!' code    // a statement followed by a '!' followed by more code
| while                 // a while loop
| while code            // a while loop followed by more code
| code while            // more code followed by a while loop
;

statement               // a statement can be:
: decl                  // a declaration of a variable
| assign                // an assignment of a variable
| print                 // a print statement
;

decl: 'POW' ID;         // a declaration is the keyword POW followed by an ID

assign: ID 'ZAP' expr;  // an assignment is an ID followed by the keyword ZAP followed by an expression

print: 'KABOOM' ID;     // a print statement is the keyword KABOOM followed by an ID

expr                    // an expression can be:
: unaryExpr             // a unary expression (ID or INT)
| addExpr               // an addition expression
;

unaryExpr               // a unary expression can be:
: ID                    // an ID
| INT                   // an INT
;


addExpr                 // an addition expression:
: unaryExpr 'BAM' expr  // a unary expression followed by the keyword BAM followed by an expression
;

lesser                          // a less than condition:
: unaryExpr 'GULP' unaryExpr    // a unary expression followed by the keyword GULP followed by an expression
;

greater                         // a greater than condition:
: unaryExpr 'HMPH' unaryExpr    // a unary expression followed by the keyword HMPH followed by an expression
;

cond                    // a condition can be:
: lesser                // a less than condition
| greater               // a greater than condition
;


while: 'ZOINKS' '(' cond ')' '?'    // while loop syntax
        code
        '?!'
;


ID: ('a'..'z')+ ;           // an ID is a sequence of lowercase letters
INT: ('0'..'9')+ ;          // an INT is a sequence of digits
WS: [ \n\t\r]+ -> skip;     // ignore whitespace
COMMENT: '#!' .*? '!#' -> channel(HIDDEN); // ignore comments
