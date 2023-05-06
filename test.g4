grammar test;

start       : statement* EOF;

statement   : declaration
            | assignment
            | print
            | ifStatement
            | whileStatement
            | forStatement
            | functionDeclaration
            | functionCall
            ;

declaration : 'var' ID ('=' expression)? ';';
declarationWithOptionalAssignment : 'var' ID ('=' expression)?;
assignment  : ID '=' expression ';';
print       : ('print' | 'println') '(' (STRING | expression) ')' ';';

ifStatement     : 'if' '(' expression ')' block ('else' block)?;
whileStatement  : 'while' '(' expression ')' block;
forStatement    : 'for' '(' (declarationWithOptionalAssignment | assignment | ';')? expression? ';' expression? ')' block;

block           : '{' statement* '}';
expressionList  : expression (',' expression)*;

functionDeclaration : 'function' ID '(' (declaration (',' declaration)*)? ')' block;
functionCall        : ID '(' (expressionList)? ')' ';';

expression  : expression ('*' | '/') expression                              #MulDiv
            | expression ('+' | '-') expression                              #AddSub
            | expression '^' expression                                      #Exponent
            | expression '%' expression                                      #Modulus
            | expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression  #Comparison
            | expression ('&&' | '||') expression                            #Logical
            | '(' expression ')'                                             #Parens
            | NUMBER                                                         #Number
            | ID                                                             #Variable
            ;

ID          : [a-zA-Z]+;
NUMBER      : INT ('.' [0-9]+)?;
INT         : [0-9]+;
STRING      : '"' ~["\n]* '"';
WS          : [ \t\r\n]+ -> skip;
COMMENT     : '//' ~[\r\n]* ('\r'? '\n') -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
