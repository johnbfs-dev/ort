// Generated from org/ossreviewtoolkit/utils/spdx/SpdxExpression.g4 by ANTLR 4.9.3

package org.ossreviewtoolkit.utils.spdx;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpdxExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, WITH=3, OPEN=4, CLOSE=5, PLUS=6, DOCUMENTREFERENCE=7, LICENSEREFERENCE=8, 
		IDSTRING=9, WHITESPACE=10;
	public static final int
		RULE_licenseReferenceExpression = 0, RULE_licenseIdExpression = 1, RULE_simpleExpression = 2, 
		RULE_compoundExpression = 3, RULE_licenseExpression = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"licenseReferenceExpression", "licenseIdExpression", "simpleExpression", 
			"compoundExpression", "licenseExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'+'", null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "WITH", "OPEN", "CLOSE", "PLUS", "DOCUMENTREFERENCE", 
			"LICENSEREFERENCE", "IDSTRING", "WHITESPACE"
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
	public String getGrammarFileName() { return "SpdxExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpdxExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LicenseReferenceExpressionContext extends ParserRuleContext {
		public TerminalNode DOCUMENTREFERENCE() { return getToken(SpdxExpressionParser.DOCUMENTREFERENCE, 0); }
		public TerminalNode LICENSEREFERENCE() { return getToken(SpdxExpressionParser.LICENSEREFERENCE, 0); }
		public LicenseReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licenseReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterLicenseReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitLicenseReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitLicenseReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LicenseReferenceExpressionContext licenseReferenceExpression() throws RecognitionException {
		LicenseReferenceExpressionContext _localctx = new LicenseReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_licenseReferenceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_la = _input.LA(1);
			if ( !(_la==DOCUMENTREFERENCE || _la==LICENSEREFERENCE) ) {
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

	public static class LicenseIdExpressionContext extends ParserRuleContext {
		public TerminalNode IDSTRING() { return getToken(SpdxExpressionParser.IDSTRING, 0); }
		public TerminalNode PLUS() { return getToken(SpdxExpressionParser.PLUS, 0); }
		public LicenseIdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licenseIdExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterLicenseIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitLicenseIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitLicenseIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LicenseIdExpressionContext licenseIdExpression() throws RecognitionException {
		LicenseIdExpressionContext _localctx = new LicenseIdExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_licenseIdExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(IDSTRING);
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(13);
				match(PLUS);
				}
				break;
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public LicenseReferenceExpressionContext licenseReferenceExpression() {
			return getRuleContext(LicenseReferenceExpressionContext.class,0);
		}
		public LicenseIdExpressionContext licenseIdExpression() {
			return getRuleContext(LicenseIdExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleExpression);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOCUMENTREFERENCE:
			case LICENSEREFERENCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				licenseReferenceExpression();
				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				licenseIdExpression();
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

	public static class CompoundExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SpdxExpressionParser.WITH, 0); }
		public TerminalNode IDSTRING() { return getToken(SpdxExpressionParser.IDSTRING, 0); }
		public TerminalNode LICENSEREFERENCE() { return getToken(SpdxExpressionParser.LICENSEREFERENCE, 0); }
		public TerminalNode OPEN() { return getToken(SpdxExpressionParser.OPEN, 0); }
		public List<CompoundExpressionContext> compoundExpression() {
			return getRuleContexts(CompoundExpressionContext.class);
		}
		public CompoundExpressionContext compoundExpression(int i) {
			return getRuleContext(CompoundExpressionContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(SpdxExpressionParser.CLOSE, 0); }
		public TerminalNode AND() { return getToken(SpdxExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(SpdxExpressionParser.OR, 0); }
		public CompoundExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterCompoundExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitCompoundExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitCompoundExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundExpressionContext compoundExpression() throws RecognitionException {
		return compoundExpression(0);
	}

	private CompoundExpressionContext compoundExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompoundExpressionContext _localctx = new CompoundExpressionContext(_ctx, _parentState);
		CompoundExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_compoundExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(21);
				simpleExpression();
				}
				break;
			case 2:
				{
				setState(22);
				simpleExpression();
				setState(23);
				match(WITH);
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==LICENSEREFERENCE || _la==IDSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(26);
				match(OPEN);
				setState(27);
				compoundExpression(0);
				setState(28);
				match(CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CompoundExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compoundExpression);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
						match(AND);
						setState(34);
						compoundExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new CompoundExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compoundExpression);
						setState(35);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(36);
						match(OR);
						setState(37);
						compoundExpression(3);
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class LicenseExpressionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SpdxExpressionParser.EOF, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public CompoundExpressionContext compoundExpression() {
			return getRuleContext(CompoundExpressionContext.class,0);
		}
		public LicenseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licenseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterLicenseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitLicenseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitLicenseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LicenseExpressionContext licenseExpression() throws RecognitionException {
		LicenseExpressionContext _localctx = new LicenseExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_licenseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(43);
				simpleExpression();
				}
				break;
			case 2:
				{
				setState(44);
				compoundExpression(0);
				}
				break;
			}
			setState(47);
			match(EOF);
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
			return compoundExpression_sempred((CompoundExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean compoundExpression_sempred(CompoundExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\5\3\21\n\3\3\4\3\4\5\4\25"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5!\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\6\3\6\5\6\60\n\6\3\6\3\6\3\6\2\3\b"+
		"\7\2\4\6\b\n\2\4\3\2\t\n\3\2\n\13\2\65\2\f\3\2\2\2\4\16\3\2\2\2\6\24\3"+
		"\2\2\2\b \3\2\2\2\n/\3\2\2\2\f\r\t\2\2\2\r\3\3\2\2\2\16\20\7\13\2\2\17"+
		"\21\7\b\2\2\20\17\3\2\2\2\20\21\3\2\2\2\21\5\3\2\2\2\22\25\5\2\2\2\23"+
		"\25\5\4\3\2\24\22\3\2\2\2\24\23\3\2\2\2\25\7\3\2\2\2\26\27\b\5\1\2\27"+
		"!\5\6\4\2\30\31\5\6\4\2\31\32\7\5\2\2\32\33\t\3\2\2\33!\3\2\2\2\34\35"+
		"\7\6\2\2\35\36\5\b\5\2\36\37\7\7\2\2\37!\3\2\2\2 \26\3\2\2\2 \30\3\2\2"+
		"\2 \34\3\2\2\2!*\3\2\2\2\"#\f\5\2\2#$\7\3\2\2$)\5\b\5\6%&\f\4\2\2&\'\7"+
		"\4\2\2\')\5\b\5\5(\"\3\2\2\2(%\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+"+
		"\t\3\2\2\2,*\3\2\2\2-\60\5\6\4\2.\60\5\b\5\2/-\3\2\2\2/.\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\7\2\2\3\62\13\3\2\2\2\b\20\24 (*/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}