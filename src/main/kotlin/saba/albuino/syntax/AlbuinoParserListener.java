// Generated from /Users/sabac/MyPrograms/source/Kotlin/Albuino/src/main/kotlin/saba/albuino/syntax/AlbuinoParser.g4 by ANTLR 4.8
package saba.albuino.syntax;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlbuinoParser}.
 */
public interface AlbuinoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AlbuinoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AlbuinoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AlbuinoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AlbuinoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(AlbuinoParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(AlbuinoParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AlbuinoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AlbuinoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AlbuinoParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AlbuinoParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(AlbuinoParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(AlbuinoParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(AlbuinoParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(AlbuinoParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(AlbuinoParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(AlbuinoParser.LineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterLineStringExpression(AlbuinoParser.LineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitLineStringExpression(AlbuinoParser.LineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(AlbuinoParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(AlbuinoParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringExpression(AlbuinoParser.MultiLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringExpression(AlbuinoParser.MultiLineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlbuinoParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(AlbuinoParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlbuinoParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(AlbuinoParser.OperatorContext ctx);
}