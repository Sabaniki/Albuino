// Generated from /Users/sabac/MyPrograms/source/Kotlin/Albuino/src/main/kotlin/saba/albuino/syntax/AlbuinoParser.g4 by ANTLR 4.8
package saba.albuino.syntax;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlbuinoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlbuinoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AlbuinoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AlbuinoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(AlbuinoParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AlbuinoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AlbuinoParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringLiteral(AlbuinoParser.LineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringLiteral(AlbuinoParser.MultiLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#lineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringContent(AlbuinoParser.LineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#lineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringExpression(AlbuinoParser.LineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringContent(AlbuinoParser.MultiLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringExpression(AlbuinoParser.MultiLineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlbuinoParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AlbuinoParser.OperatorContext ctx);
}