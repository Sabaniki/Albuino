// Generated from /Users/sabac/MyPrograms/source/Kotlin/Albuino/src/main/kotlin/saba/albuino/syntax/AlbuinoParser.g4 by ANTLR 4.8

    package saba.albuino.listener.systax;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlbuinoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ShebangLine=1, DelimitedComment=2, LineComment=3, WS=4, NL=5, RESERVED=6, 
		DOT=7, COMMA=8, LPAREN=9, RPAREN=10, LSQUARE=11, RSQUARE=12, LCURL=13, 
		RCURL=14, MULT=15, MOD=16, DIV=17, ADD=18, SUB=19, INCR=20, DECR=21, CONJ=22, 
		DISJ=23, EXCL=24, COLON=25, SEMICOLON=26, ASSIGNMENT=27, ADD_ASSIGNMENT=28, 
		SUB_ASSIGNMENT=29, MULT_ASSIGNMENT=30, DIV_ASSIGNMENT=31, MOD_ASSIGNMENT=32, 
		ARROW=33, DOUBLE_ARROW=34, RANGE=35, COLONCOLON=36, Q_COLONCOLON=37, DOUBLE_SEMICOLON=38, 
		HASH=39, AT=40, QUEST=41, ELVIS=42, LANGLE=43, RANGLE=44, LE=45, GE=46, 
		EXCL_EQ=47, EXCL_EQEQ=48, AS_SAFE=49, EQEQ=50, EQEQEQ=51, SINGLE_QUOTE=52, 
		RETURN_AT=53, CONTINUE_AT=54, BREAK_AT=55, FILE=56, PACKAGE=57, IMPORT=58, 
		CLASS=59, INTERFACE=60, FUN=61, OBJECT=62, VAL=63, VAR=64, TYPE_ALIAS=65, 
		CONSTRUCTOR=66, BY=67, COMPANION=68, INIT=69, THIS=70, SUPER=71, TYPEOF=72, 
		WHERE=73, IF=74, ELSE=75, WHEN=76, TRY=77, CATCH=78, FINALLY=79, FOR=80, 
		DO=81, WHILE=82, THROW=83, RETURN=84, CONTINUE=85, BREAK=86, AS=87, IS=88, 
		IN=89, NOT_IS=90, NOT_IN=91, OUT=92, FIELD=93, PROPERTY=94, GET=95, SET=96, 
		GETTER=97, SETTER=98, RECEIVER=99, PARAM=100, SETPARAM=101, DELEGATE=102, 
		DYNAMIC=103, PUBLIC=104, PRIVATE=105, PROTECTED=106, INTERNAL=107, ENUM=108, 
		SEALED=109, ANNOTATION=110, DATA=111, INNER=112, TAILREC=113, OPERATOR=114, 
		INLINE=115, INFIX=116, EXTERNAL=117, SUSPEND=118, OVERRIDE=119, ABSTRACT=120, 
		FINAL=121, OPEN=122, CONST=123, LATEINIT=124, VARARG=125, NOINLINE=126, 
		CROSSINLINE=127, REIFIED=128, QUOTE_OPEN=129, TRIPLE_QUOTE_OPEN=130, RealLiteral=131, 
		FloatLiteral=132, DoubleLiteral=133, LongLiteral=134, IntegerLiteral=135, 
		HexLiteral=136, BinLiteral=137, BooleanLiteral=138, NullLiteral=139, Identifier=140, 
		LabelReference=141, LabelDefinition=142, FieldIdentifier=143, CharacterLiteral=144, 
		UNICODE_CLASS_LL=145, UNICODE_CLASS_LM=146, UNICODE_CLASS_LO=147, UNICODE_CLASS_LT=148, 
		UNICODE_CLASS_LU=149, UNICODE_CLASS_ND=150, UNICODE_CLASS_NL=151, Inside_Comment=152, 
		Inside_WS=153, Inside_NL=154, QUOTE_CLOSE=155, LineStrRef=156, LineStrText=157, 
		LineStrEscapedChar=158, LineStrExprStart=159, TRIPLE_QUOTE_CLOSE=160, 
		MultiLineStringQuote=161, MultiLineStrRef=162, MultiLineStrText=163, MultiLineStrEscapedChar=164, 
		MultiLineStrExprStart=165, MultiLineNL=166, StrExpr_IN=167, StrExpr_Comment=168, 
		StrExpr_WS=169, StrExpr_NL=170;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_propertyDeclaration = 2, RULE_expression = 3, 
		RULE_stringLiteral = 4, RULE_lineStringLiteral = 5, RULE_multiLineStringLiteral = 6, 
		RULE_lineStringContent = 7, RULE_lineStringExpression = 8, RULE_multiLineStringContent = 9, 
		RULE_multiLineStringExpression = 10, RULE_operator = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "propertyDeclaration", "expression", "stringLiteral", 
			"lineStringLiteral", "multiLineStringLiteral", "lineStringContent", "lineStringExpression", 
			"multiLineStringContent", "multiLineStringExpression", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'...'", "'.'", "','", "'('", null, 
			"'['", null, "'{'", "'}'", "'*'", "'%'", "'/'", "'+'", "'-'", "'++'", 
			"'--'", "'&&'", "'||'", "'!'", "':'", "';'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'->'", "'=>'", "'..'", "'::'", "'?::'", "';;'", "'#'", 
			"'@'", "'?'", "'?:'", "'<'", "'>'", "'<='", "'>='", "'!='", "'!=='", 
			"'as?'", "'=='", "'==='", "'''", null, null, null, "'@file'", "'package'", 
			"'import'", "'class'", "'interface'", "'fun'", "'object'", "'val'", "'var'", 
			"'typealias'", "'constructor'", "'by'", "'companion'", "'init'", "'this'", 
			"'super'", "'typeof'", "'where'", "'if'", "'else'", "'when'", "'try'", 
			"'catch'", "'finally'", "'for'", "'do'", "'while'", "'throw'", "'return'", 
			"'continue'", "'break'", "'as'", "'is'", "'in'", null, null, "'out'", 
			"'@field'", "'@property'", "'@get'", "'@set'", "'get'", "'set'", "'@receiver'", 
			"'@param'", "'@setparam'", "'@delegate'", "'dynamic'", "'public'", "'private'", 
			"'protected'", "'internal'", "'enum'", "'sealed'", "'annotation'", "'data'", 
			"'inner'", "'tailrec'", "'operator'", "'inline'", "'infix'", "'external'", 
			"'suspend'", "'override'", "'abstract'", "'final'", "'open'", "'const'", 
			"'lateinit'", "'vararg'", "'noinline'", "'crossinline'", "'reified'", 
			null, "'\"\"\"'", null, null, null, null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ShebangLine", "DelimitedComment", "LineComment", "WS", "NL", "RESERVED", 
			"DOT", "COMMA", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", 
			"MULT", "MOD", "DIV", "ADD", "SUB", "INCR", "DECR", "CONJ", "DISJ", "EXCL", 
			"COLON", "SEMICOLON", "ASSIGNMENT", "ADD_ASSIGNMENT", "SUB_ASSIGNMENT", 
			"MULT_ASSIGNMENT", "DIV_ASSIGNMENT", "MOD_ASSIGNMENT", "ARROW", "DOUBLE_ARROW", 
			"RANGE", "COLONCOLON", "Q_COLONCOLON", "DOUBLE_SEMICOLON", "HASH", "AT", 
			"QUEST", "ELVIS", "LANGLE", "RANGLE", "LE", "GE", "EXCL_EQ", "EXCL_EQEQ", 
			"AS_SAFE", "EQEQ", "EQEQEQ", "SINGLE_QUOTE", "RETURN_AT", "CONTINUE_AT", 
			"BREAK_AT", "FILE", "PACKAGE", "IMPORT", "CLASS", "INTERFACE", "FUN", 
			"OBJECT", "VAL", "VAR", "TYPE_ALIAS", "CONSTRUCTOR", "BY", "COMPANION", 
			"INIT", "THIS", "SUPER", "TYPEOF", "WHERE", "IF", "ELSE", "WHEN", "TRY", 
			"CATCH", "FINALLY", "FOR", "DO", "WHILE", "THROW", "RETURN", "CONTINUE", 
			"BREAK", "AS", "IS", "IN", "NOT_IS", "NOT_IN", "OUT", "FIELD", "PROPERTY", 
			"GET", "SET", "GETTER", "SETTER", "RECEIVER", "PARAM", "SETPARAM", "DELEGATE", 
			"DYNAMIC", "PUBLIC", "PRIVATE", "PROTECTED", "INTERNAL", "ENUM", "SEALED", 
			"ANNOTATION", "DATA", "INNER", "TAILREC", "OPERATOR", "INLINE", "INFIX", 
			"EXTERNAL", "SUSPEND", "OVERRIDE", "ABSTRACT", "FINAL", "OPEN", "CONST", 
			"LATEINIT", "VARARG", "NOINLINE", "CROSSINLINE", "REIFIED", "QUOTE_OPEN", 
			"TRIPLE_QUOTE_OPEN", "RealLiteral", "FloatLiteral", "DoubleLiteral", 
			"LongLiteral", "IntegerLiteral", "HexLiteral", "BinLiteral", "BooleanLiteral", 
			"NullLiteral", "Identifier", "LabelReference", "LabelDefinition", "FieldIdentifier", 
			"CharacterLiteral", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", 
			"UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", 
			"Inside_Comment", "Inside_WS", "Inside_NL", "QUOTE_CLOSE", "LineStrRef", 
			"LineStrText", "LineStrEscapedChar", "LineStrExprStart", "TRIPLE_QUOTE_CLOSE", 
			"MultiLineStringQuote", "MultiLineStrRef", "MultiLineStrText", "MultiLineStrEscapedChar", 
			"MultiLineStrExprStart", "MultiLineNL", "StrExpr_IN", "StrExpr_Comment", 
			"StrExpr_WS", "StrExpr_NL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AlbuinoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlbuinoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AlbuinoParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AlbuinoParser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			statement();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (NL - 5)) | (1L << (VAL - 5)) | (1L << (VAR - 5)))) != 0)) {
				{
				{
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(25);
					match(NL);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(31);
				statement();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			propertyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(AlbuinoParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(AlbuinoParser.VAR, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AlbuinoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AlbuinoParser.Identifier, i);
		}
		public TerminalNode COLON() { return getToken(AlbuinoParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(AlbuinoParser.ASSIGNMENT, 0); }
		public List<TerminalNode> NL() { return getTokens(AlbuinoParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AlbuinoParser.NL, i);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(40);
			match(Identifier);
			}
			{
			setState(41);
			match(COLON);
			}
			{
			setState(42);
			match(Identifier);
			}
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(43);
				match(NL);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(49);
			match(ASSIGNMENT);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(50);
				match(NL);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			expression(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AlbuinoParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AlbuinoParser.RPAREN, 0); }
		public TerminalNode IntegerLiteral() { return getToken(AlbuinoParser.IntegerLiteral, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AlbuinoParser.Identifier, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(59);
				match(LPAREN);
				setState(60);
				expression(0);
				setState(61);
				match(RPAREN);
				}
				break;
			case IntegerLiteral:
				{
				setState(63);
				match(IntegerLiteral);
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
				{
				setState(64);
				stringLiteral();
				}
				break;
			case Identifier:
				{
				setState(65);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(68);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(69);
					operator();
					setState(70);
					expression(6);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public MultiLineStringLiteralContext multiLineStringLiteral() {
			return getRuleContext(MultiLineStringLiteralContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stringLiteral);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				multiLineStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineStringLiteralContext extends ParserRuleContext {
		public TerminalNode QUOTE_OPEN() { return getToken(AlbuinoParser.QUOTE_OPEN, 0); }
		public TerminalNode QUOTE_CLOSE() { return getToken(AlbuinoParser.QUOTE_CLOSE, 0); }
		public List<LineStringContentContext> lineStringContent() {
			return getRuleContexts(LineStringContentContext.class);
		}
		public LineStringContentContext lineStringContent(int i) {
			return getRuleContext(LineStringContentContext.class,i);
		}
		public List<LineStringExpressionContext> lineStringExpression() {
			return getRuleContexts(LineStringExpressionContext.class);
		}
		public LineStringExpressionContext lineStringExpression(int i) {
			return getRuleContext(LineStringExpressionContext.class,i);
		}
		public LineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringLiteralContext lineStringLiteral() throws RecognitionException {
		LineStringLiteralContext _localctx = new LineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(QUOTE_OPEN);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (LineStrRef - 156)) | (1L << (LineStrText - 156)) | (1L << (LineStrEscapedChar - 156)) | (1L << (LineStrExprStart - 156)))) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(82);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(83);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(QUOTE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineStringLiteralContext extends ParserRuleContext {
		public TerminalNode TRIPLE_QUOTE_OPEN() { return getToken(AlbuinoParser.TRIPLE_QUOTE_OPEN, 0); }
		public TerminalNode TRIPLE_QUOTE_CLOSE() { return getToken(AlbuinoParser.TRIPLE_QUOTE_CLOSE, 0); }
		public List<MultiLineStringContentContext> multiLineStringContent() {
			return getRuleContexts(MultiLineStringContentContext.class);
		}
		public MultiLineStringContentContext multiLineStringContent(int i) {
			return getRuleContext(MultiLineStringContentContext.class,i);
		}
		public List<MultiLineStringExpressionContext> multiLineStringExpression() {
			return getRuleContexts(MultiLineStringExpressionContext.class);
		}
		public MultiLineStringExpressionContext multiLineStringExpression(int i) {
			return getRuleContext(MultiLineStringExpressionContext.class,i);
		}
		public List<LineStringLiteralContext> lineStringLiteral() {
			return getRuleContexts(LineStringLiteralContext.class);
		}
		public LineStringLiteralContext lineStringLiteral(int i) {
			return getRuleContext(LineStringLiteralContext.class,i);
		}
		public List<TerminalNode> MultiLineStringQuote() { return getTokens(AlbuinoParser.MultiLineStringQuote); }
		public TerminalNode MultiLineStringQuote(int i) {
			return getToken(AlbuinoParser.MultiLineStringQuote, i);
		}
		public MultiLineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterMultiLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitMultiLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitMultiLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringLiteralContext multiLineStringLiteral() throws RecognitionException {
		MultiLineStringLiteralContext _localctx = new MultiLineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(TRIPLE_QUOTE_OPEN);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (QUOTE_OPEN - 129)) | (1L << (MultiLineStringQuote - 129)) | (1L << (MultiLineStrRef - 129)) | (1L << (MultiLineStrText - 129)) | (1L << (MultiLineStrEscapedChar - 129)) | (1L << (MultiLineStrExprStart - 129)))) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(92);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(93);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(94);
					lineStringLiteral();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(95);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(TRIPLE_QUOTE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineStringContentContext extends ParserRuleContext {
		public TerminalNode LineStrText() { return getToken(AlbuinoParser.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(AlbuinoParser.LineStrEscapedChar, 0); }
		public TerminalNode LineStrRef() { return getToken(AlbuinoParser.LineStrRef, 0); }
		public LineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringContentContext lineStringContent() throws RecognitionException {
		LineStringContentContext _localctx = new LineStringContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (LineStrRef - 156)) | (1L << (LineStrText - 156)) | (1L << (LineStrEscapedChar - 156)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineStringExpressionContext extends ParserRuleContext {
		public TerminalNode LineStrExprStart() { return getToken(AlbuinoParser.LineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(AlbuinoParser.RCURL, 0); }
		public LineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitLineStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitLineStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringExpressionContext lineStringExpression() throws RecognitionException {
		LineStringExpressionContext _localctx = new LineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LineStrExprStart);
			setState(106);
			expression(0);
			setState(107);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineStringContentContext extends ParserRuleContext {
		public TerminalNode MultiLineStrText() { return getToken(AlbuinoParser.MultiLineStrText, 0); }
		public TerminalNode MultiLineStrEscapedChar() { return getToken(AlbuinoParser.MultiLineStrEscapedChar, 0); }
		public TerminalNode MultiLineStrRef() { return getToken(AlbuinoParser.MultiLineStrRef, 0); }
		public MultiLineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterMultiLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitMultiLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitMultiLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringContentContext multiLineStringContent() throws RecognitionException {
		MultiLineStringContentContext _localctx = new MultiLineStringContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (MultiLineStrRef - 162)) | (1L << (MultiLineStrText - 162)) | (1L << (MultiLineStrEscapedChar - 162)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineStringExpressionContext extends ParserRuleContext {
		public TerminalNode MultiLineStrExprStart() { return getToken(AlbuinoParser.MultiLineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(AlbuinoParser.RCURL, 0); }
		public MultiLineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterMultiLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitMultiLineStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitMultiLineStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringExpressionContext multiLineStringExpression() throws RecognitionException {
		MultiLineStringExpressionContext _localctx = new MultiLineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(MultiLineStrExprStart);
			setState(112);
			expression(0);
			setState(113);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(AlbuinoParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(AlbuinoParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(AlbuinoParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(AlbuinoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AlbuinoParser.SUB, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlbuinoParserListener ) ((AlbuinoParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlbuinoParserVisitor ) return ((AlbuinoParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << MOD) | (1L << DIV) | (1L << ADD) | (1L << SUB))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00acx\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4"+
		"\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5E\n\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\5\6R\n\6\3\7"+
		"\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bc\n\b"+
		"\f\b\16\bf\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\2\3\b\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2AB\3\2"+
		"\u009e\u00a0\3\2\u00a4\u00a6\3\2\21\25\2z\2\32\3\2\2\2\4\'\3\2\2\2\6)"+
		"\3\2\2\2\bD\3\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16]\3\2\2\2\20i\3\2\2\2\22k"+
		"\3\2\2\2\24o\3\2\2\2\26q\3\2\2\2\30u\3\2\2\2\32$\5\4\3\2\33\35\7\7\2\2"+
		"\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36"+
		"\3\2\2\2!#\5\4\3\2\"\36\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2"+
		"\2\2&$\3\2\2\2\'(\5\6\4\2(\5\3\2\2\2)*\t\2\2\2*+\7\u008e\2\2+,\7\33\2"+
		"\2,\60\7\u008e\2\2-/\7\7\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3"+
		"\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\67\7\35\2\2\64\66\7\7\2\2\65\64"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:"+
		";\5\b\5\2;\7\3\2\2\2<=\b\5\1\2=>\7\13\2\2>?\5\b\5\2?@\7\f\2\2@E\3\2\2"+
		"\2AE\7\u0089\2\2BE\5\n\6\2CE\7\u008e\2\2D<\3\2\2\2DA\3\2\2\2DB\3\2\2\2"+
		"DC\3\2\2\2EL\3\2\2\2FG\f\7\2\2GH\5\30\r\2HI\5\b\5\bIK\3\2\2\2JF\3\2\2"+
		"\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2\2OR\5\f\7\2PR\5\16"+
		"\b\2QO\3\2\2\2QP\3\2\2\2R\13\3\2\2\2SX\7\u0083\2\2TW\5\20\t\2UW\5\22\n"+
		"\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2"+
		"\2[\\\7\u009d\2\2\\\r\3\2\2\2]d\7\u0084\2\2^c\5\24\13\2_c\5\26\f\2`c\5"+
		"\f\7\2ac\7\u00a3\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\u00a2\2\2h\17\3\2\2\2ij\t"+
		"\3\2\2j\21\3\2\2\2kl\7\u00a1\2\2lm\5\b\5\2mn\7\20\2\2n\23\3\2\2\2op\t"+
		"\4\2\2p\25\3\2\2\2qr\7\u00a7\2\2rs\5\b\5\2st\7\20\2\2t\27\3\2\2\2uv\t"+
		"\5\2\2v\31\3\2\2\2\r\36$\60\67DLQVXbd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}