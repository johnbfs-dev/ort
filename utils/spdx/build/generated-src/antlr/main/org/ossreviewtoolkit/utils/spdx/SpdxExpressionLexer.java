// Generated from org/ossreviewtoolkit/utils/spdx/SpdxExpression.g4 by ANTLR 4.9.3

package org.ossreviewtoolkit.utils.spdx;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpdxExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, WITH=3, OPEN=4, CLOSE=5, PLUS=6, DOCUMENTREFERENCE=7, LICENSEREFERENCE=8, 
		IDSTRING=9, WHITESPACE=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALPHA", "DIGIT", "AND", "OR", "WITH", "OPEN", "CLOSE", "PLUS", "DOCUMENTREFERENCE", 
			"LICENSEREFERENCE", "IDSTRING", "WHITESPACE"
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


	public SpdxExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SpdxExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fl\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4&\n\4\3"+
		"\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\66\n\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\5\f_\n\f\3\f\3\f\3\f\7\fd\n\f\f\f\16\fg\13"+
		"\f\3\r\3\r\3\r\3\r\2\2\16\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n"+
		"\27\13\31\f\3\2\4\4\2C\\c|\3\2\62;\2p\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7%\3\2\2\2\t+\3\2\2"+
		"\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25N"+
		"\3\2\2\2\27^\3\2\2\2\31h\3\2\2\2\33\34\t\2\2\2\34\4\3\2\2\2\35\36\t\3"+
		"\2\2\36\6\3\2\2\2\37 \7C\2\2 !\7P\2\2!&\7F\2\2\"#\7c\2\2#$\7p\2\2$&\7"+
		"f\2\2%\37\3\2\2\2%\"\3\2\2\2&\b\3\2\2\2\'(\7Q\2\2(,\7T\2\2)*\7q\2\2*,"+
		"\7t\2\2+\'\3\2\2\2+)\3\2\2\2,\n\3\2\2\2-.\7Y\2\2./\7K\2\2/\60\7V\2\2\60"+
		"\66\7J\2\2\61\62\7y\2\2\62\63\7k\2\2\63\64\7v\2\2\64\66\7j\2\2\65-\3\2"+
		"\2\2\65\61\3\2\2\2\66\f\3\2\2\2\678\7*\2\28\16\3\2\2\29:\7+\2\2:\20\3"+
		"\2\2\2;<\7-\2\2<\22\3\2\2\2=>\7F\2\2>?\7q\2\2?@\7e\2\2@A\7w\2\2AB\7o\2"+
		"\2BC\7g\2\2CD\7p\2\2DE\7v\2\2EF\7T\2\2FG\7g\2\2GH\7h\2\2HI\7/\2\2IJ\3"+
		"\2\2\2JK\5\27\f\2KL\7<\2\2LM\5\25\13\2M\24\3\2\2\2NO\7N\2\2OP\7k\2\2P"+
		"Q\7e\2\2QR\7g\2\2RS\7p\2\2ST\7u\2\2TU\7g\2\2UV\7T\2\2VW\7g\2\2WX\7h\2"+
		"\2XY\7/\2\2YZ\3\2\2\2Z[\5\27\f\2[\26\3\2\2\2\\_\5\3\2\2]_\5\5\3\2^\\\3"+
		"\2\2\2^]\3\2\2\2_e\3\2\2\2`d\5\3\2\2ad\5\5\3\2bd\4/\60\2c`\3\2\2\2ca\3"+
		"\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\30\3\2\2\2ge\3\2\2\2h"+
		"i\7\"\2\2ij\3\2\2\2jk\b\r\2\2k\32\3\2\2\2\t\2%+\65^ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}