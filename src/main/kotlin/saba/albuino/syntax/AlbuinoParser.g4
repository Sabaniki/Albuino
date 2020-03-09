parser grammar AlbuinoParser;
@header{
    package saba.albuino.listener.systax;
}
options {tokenVocab = AlbuinoLexer;}

propertyDeclaration
    : (VAL | VAR)
    (NL* (variableDeclaration))
    (NL* (BY | ASSIGNMENT) NL* expression)
    ;

expression
    :
    ;

additiveExpression
    : multiplicativeExpression (additiveOperator NL* multiplicativeExpression)*
    ;

multiplicativeExpression
    : typeRHS (multiplicativeOperation NL* typeRHS)*
    ;
typeRHS
    : prefixUnaryExpression (NL* typeOperation prefixUnaryExpression)*
    ;

prefixUnaryExpression
    : prefixUnaryOperation* postfixUnaryExpression
    ;

postfixUnaryExpression
    : (atomicExpression | callableReference) postfixUnaryOperation*
    ;

additiveOperator
    : ADD | SUB
    ;

multiplicativeOperation
    : MULT
    | DIV
    | MOD
    ;

typeOperation
    : AS
    | AS_SAFE
    | COLON
    ;

variableDeclaration: simpleIdentifier COLON type;

type
    : typeReference
    ;

typeReference
    : LPAREN typeReference RPAREN
    | userType
    ;

userType
    : simpleUserType (NL* DOT NL* simpleUserType)*
    ;

simpleUserType
    : simpleIdentifier
    ;

simpleIdentifier
    : Identifier
    //soft keywords:
    | ABSTRACT
    | ANNOTATION
    | BY
    | CATCH
    | COMPANION
    | CONSTRUCTOR
    | CROSSINLINE
    | DATA
    | DYNAMIC
    | ENUM
    | EXTERNAL
    | FINAL
    | FINALLY
    | GETTER
    | IMPORT
    | INFIX
    | INIT
    | INLINE
    | INNER
    | INTERNAL
    | LATEINIT
    | NOINLINE
    | OPEN
    | OPERATOR
    | OUT
    | OVERRIDE
    | PRIVATE
    | PROTECTED
    | PUBLIC
    | REIFIED
    | SEALED
    | TAILREC
    | SETTER
    | VARARG
    | WHERE
    //strong keywords
    | CONST
    | SUSPEND
    ;