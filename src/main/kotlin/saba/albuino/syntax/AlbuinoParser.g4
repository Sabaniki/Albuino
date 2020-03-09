parser grammar AlbuinoParser;
@header{
    package saba.albuino.listener.systax;
}
options {tokenVocab = AlbuinoLexer;}

program
    : statement (NL* statement)*
    ;
statement
    : propertyDeclaration
    ;
propertyDeclaration
    : (VAL | VAR) (Identifier) (COLON) (Identifier) (NL* (ASSIGNMENT) NL* expression)
    ;

expression
    : expression operator expression
    | LPAREN expression RPAREN
    | IntegerLiteral
    | stringLiteral
    | Identifier
    ;

stringLiteral
    : lineStringLiteral
    | multiLineStringLiteral
    ;

lineStringLiteral
    : QUOTE_OPEN (lineStringContent | lineStringExpression)* QUOTE_CLOSE
    ;

multiLineStringLiteral
    : TRIPLE_QUOTE_OPEN (multiLineStringContent | multiLineStringExpression | lineStringLiteral | MultiLineStringQuote)* TRIPLE_QUOTE_CLOSE
    ;

lineStringContent
    : LineStrText
    | LineStrEscapedChar
    | LineStrRef
    ;

lineStringExpression
    : LineStrExprStart expression RCURL
    ;

multiLineStringContent
    : MultiLineStrText
    | MultiLineStrEscapedChar
    | MultiLineStrRef
    ;

multiLineStringExpression
    : MultiLineStrExprStart expression RCURL
    ;

operator
    : MULT
    | MOD
    | DIV
    | ADD
    | SUB
    ;