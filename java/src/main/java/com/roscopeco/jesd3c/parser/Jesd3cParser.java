// Generated from Jesd3cParser.g4 by ANTLR 4.13.1
package com.roscopeco.jesd3c.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Jesd3cParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STX=1, ETX=2, TERMINATOR=3, NOTE_ID=4, VAL_FUS_ID=5, VAL_PIN_ID=6, VAL_VEC_ID=7, 
		DEFAULT_ID=8, FUSE_LIST_ID=9, FUSE_CKSUM_ID=10, ELEC_HEX_ID=11, ELEC_BIN_ID=12, 
		USER_ASC_ID=13, USER_HEX_ID=14, USER_BIN_ID=15, DEVICE_ID=16, DEF_TEST_COND_ID=17, 
		TEST_VEC_ID=18, PIN_LIST_ID=19, HEX_DIGIT=20, SPACE=21, BINARY_DIGIT=22, 
		BINARY_NUMBER=23, NUMBER=24, HEX_NUMBER=25, TEST_VEC_NUMBER=26, TEST_COND=27, 
		NOTE=28;
	public static final int
		RULE_jesd3c = 0, RULE_spec_field = 1, RULE_spec = 2, RULE_field = 3, RULE_note_field = 4, 
		RULE_note = 5, RULE_value_field = 6, RULE_value_fuse_limit_field = 7, 
		RULE_fuse_limit = 8, RULE_value_pin_count_field = 9, RULE_pin_count = 10, 
		RULE_value_vec_limit_field = 11, RULE_vec_limit = 12, RULE_fuse_default_field = 13, 
		RULE_fuse_list_field = 14, RULE_fuse_number = 15, RULE_decimal = 16, RULE_fuse_data = 17, 
		RULE_fuse_checksum_field = 18, RULE_fuse_cksum = 19, RULE_electrical_data_field = 20, 
		RULE_electrical_data_field_bin = 21, RULE_electrical_data_field_hex = 22, 
		RULE_hex_fuse_data = 23, RULE_user_data_field = 24, RULE_user_data_field_bin = 25, 
		RULE_user_data_field_hex = 26, RULE_user_data_field_asc = 27, RULE_user_data_bin = 28, 
		RULE_user_data_hex = 29, RULE_user_data_asc = 30, RULE_device_id_field = 31, 
		RULE_arch_code = 32, RULE_pinout_code = 33, RULE_default_test_cond_field = 34, 
		RULE_default_test_cond = 35, RULE_test_vector_field = 36, RULE_vector_number = 37, 
		RULE_test_cond = 38, RULE_pin_list_field = 39, RULE_pin_list = 40, RULE_pin_number = 41, 
		RULE_empty_field = 42, RULE_xmit_cksum = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"jesd3c", "spec_field", "spec", "field", "note_field", "note", "value_field", 
			"value_fuse_limit_field", "fuse_limit", "value_pin_count_field", "pin_count", 
			"value_vec_limit_field", "vec_limit", "fuse_default_field", "fuse_list_field", 
			"fuse_number", "decimal", "fuse_data", "fuse_checksum_field", "fuse_cksum", 
			"electrical_data_field", "electrical_data_field_bin", "electrical_data_field_hex", 
			"hex_fuse_data", "user_data_field", "user_data_field_bin", "user_data_field_hex", 
			"user_data_field_asc", "user_data_bin", "user_data_hex", "user_data_asc", 
			"device_id_field", "arch_code", "pinout_code", "default_test_cond_field", 
			"default_test_cond", "test_vector_field", "vector_number", "test_cond", 
			"pin_list_field", "pin_list", "pin_number", "empty_field", "xmit_cksum"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u0002'", "'\\u0003'", null, null, "'QF'", "'QP'", "'QV'", "'F'", 
			"'L'", "'C'", "'EH'", "'E'", "'UA'", "'UH'", "'U'", "'J'", "'X'", "'V'", 
			"'P'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STX", "ETX", "TERMINATOR", "NOTE_ID", "VAL_FUS_ID", "VAL_PIN_ID", 
			"VAL_VEC_ID", "DEFAULT_ID", "FUSE_LIST_ID", "FUSE_CKSUM_ID", "ELEC_HEX_ID", 
			"ELEC_BIN_ID", "USER_ASC_ID", "USER_HEX_ID", "USER_BIN_ID", "DEVICE_ID", 
			"DEF_TEST_COND_ID", "TEST_VEC_ID", "PIN_LIST_ID", "HEX_DIGIT", "SPACE", 
			"BINARY_DIGIT", "BINARY_NUMBER", "NUMBER", "HEX_NUMBER", "TEST_VEC_NUMBER", 
			"TEST_COND", "NOTE"
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
	public String getGrammarFileName() { return "Jesd3cParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Jesd3cParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jesd3cContext extends ParserRuleContext {
		public TerminalNode STX() { return getToken(Jesd3cParser.STX, 0); }
		public Spec_fieldContext spec_field() {
			return getRuleContext(Spec_fieldContext.class,0);
		}
		public TerminalNode ETX() { return getToken(Jesd3cParser.ETX, 0); }
		public Xmit_cksumContext xmit_cksum() {
			return getRuleContext(Xmit_cksumContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public Jesd3cContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jesd3c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterJesd3c(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitJesd3c(this);
		}
	}

	public final Jesd3cContext jesd3c() throws RecognitionException {
		Jesd3cContext _localctx = new Jesd3cContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jesd3c);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(STX);
			setState(89);
			spec_field();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1048568L) != 0)) {
				{
				{
				setState(90);
				field();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(ETX);
			setState(97);
			xmit_cksum();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Spec_fieldContext extends ParserRuleContext {
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public Spec_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterSpec_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitSpec_field(this);
		}
	}

	public final Spec_fieldContext spec_field() throws RecognitionException {
		Spec_fieldContext _localctx = new Spec_fieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_spec_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOTE) {
				{
				setState(99);
				spec();
				}
			}

			setState(102);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecContext extends ParserRuleContext {
		public List<TerminalNode> NOTE() { return getTokens(Jesd3cParser.NOTE); }
		public TerminalNode NOTE(int i) {
			return getToken(Jesd3cParser.NOTE, i);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitSpec(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(NOTE);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOTE) {
				{
				{
				setState(105);
				match(NOTE);
				}
				}
				setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public Empty_fieldContext empty_field() {
			return getRuleContext(Empty_fieldContext.class,0);
		}
		public Note_fieldContext note_field() {
			return getRuleContext(Note_fieldContext.class,0);
		}
		public Value_fieldContext value_field() {
			return getRuleContext(Value_fieldContext.class,0);
		}
		public Fuse_default_fieldContext fuse_default_field() {
			return getRuleContext(Fuse_default_fieldContext.class,0);
		}
		public Fuse_list_fieldContext fuse_list_field() {
			return getRuleContext(Fuse_list_fieldContext.class,0);
		}
		public Fuse_checksum_fieldContext fuse_checksum_field() {
			return getRuleContext(Fuse_checksum_fieldContext.class,0);
		}
		public Electrical_data_fieldContext electrical_data_field() {
			return getRuleContext(Electrical_data_fieldContext.class,0);
		}
		public User_data_fieldContext user_data_field() {
			return getRuleContext(User_data_fieldContext.class,0);
		}
		public Device_id_fieldContext device_id_field() {
			return getRuleContext(Device_id_fieldContext.class,0);
		}
		public Default_test_cond_fieldContext default_test_cond_field() {
			return getRuleContext(Default_test_cond_fieldContext.class,0);
		}
		public Test_vector_fieldContext test_vector_field() {
			return getRuleContext(Test_vector_fieldContext.class,0);
		}
		public Pin_list_fieldContext pin_list_field() {
			return getRuleContext(Pin_list_fieldContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				empty_field();
				}
				break;
			case NOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				note_field();
				}
				break;
			case VAL_FUS_ID:
			case VAL_PIN_ID:
			case VAL_VEC_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				value_field();
				}
				break;
			case DEFAULT_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				fuse_default_field();
				}
				break;
			case FUSE_LIST_ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				fuse_list_field();
				}
				break;
			case FUSE_CKSUM_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				fuse_checksum_field();
				}
				break;
			case ELEC_HEX_ID:
			case ELEC_BIN_ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				electrical_data_field();
				}
				break;
			case USER_ASC_ID:
			case USER_HEX_ID:
			case USER_BIN_ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				user_data_field();
				}
				break;
			case DEVICE_ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				device_id_field();
				}
				break;
			case DEF_TEST_COND_ID:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				default_test_cond_field();
				}
				break;
			case TEST_VEC_ID:
				enterOuterAlt(_localctx, 11);
				{
				setState(121);
				test_vector_field();
				}
				break;
			case PIN_LIST_ID:
				enterOuterAlt(_localctx, 12);
				{
				setState(122);
				pin_list_field();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Note_fieldContext extends ParserRuleContext {
		public TerminalNode NOTE_ID() { return getToken(Jesd3cParser.NOTE_ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public Note_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterNote_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitNote_field(this);
		}
	}

	public final Note_fieldContext note_field() throws RecognitionException {
		Note_fieldContext _localctx = new Note_fieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_note_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NOTE_ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOTE) {
				{
				setState(126);
				note();
				}
			}

			setState(129);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(Jesd3cParser.NOTE, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(NOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Value_fieldContext extends ParserRuleContext {
		public Value_fuse_limit_fieldContext value_fuse_limit_field() {
			return getRuleContext(Value_fuse_limit_fieldContext.class,0);
		}
		public Value_pin_count_fieldContext value_pin_count_field() {
			return getRuleContext(Value_pin_count_fieldContext.class,0);
		}
		public Value_vec_limit_fieldContext value_vec_limit_field() {
			return getRuleContext(Value_vec_limit_fieldContext.class,0);
		}
		public Value_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterValue_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitValue_field(this);
		}
	}

	public final Value_fieldContext value_field() throws RecognitionException {
		Value_fieldContext _localctx = new Value_fieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value_field);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAL_FUS_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				value_fuse_limit_field();
				}
				break;
			case VAL_PIN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				value_pin_count_field();
				}
				break;
			case VAL_VEC_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				value_vec_limit_field();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Value_fuse_limit_fieldContext extends ParserRuleContext {
		public TerminalNode VAL_FUS_ID() { return getToken(Jesd3cParser.VAL_FUS_ID, 0); }
		public Fuse_limitContext fuse_limit() {
			return getRuleContext(Fuse_limitContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Value_fuse_limit_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_fuse_limit_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterValue_fuse_limit_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitValue_fuse_limit_field(this);
		}
	}

	public final Value_fuse_limit_fieldContext value_fuse_limit_field() throws RecognitionException {
		Value_fuse_limit_fieldContext _localctx = new Value_fuse_limit_fieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value_fuse_limit_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(VAL_FUS_ID);
			setState(139);
			fuse_limit();
			setState(140);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fuse_limitContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Jesd3cParser.NUMBER, 0); }
		public TerminalNode BINARY_NUMBER() { return getToken(Jesd3cParser.BINARY_NUMBER, 0); }
		public Fuse_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuse_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterFuse_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitFuse_limit(this);
		}
	}

	public final Fuse_limitContext fuse_limit() throws RecognitionException {
		Fuse_limitContext _localctx = new Fuse_limitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fuse_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==BINARY_NUMBER || _la==NUMBER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Value_pin_count_fieldContext extends ParserRuleContext {
		public TerminalNode VAL_PIN_ID() { return getToken(Jesd3cParser.VAL_PIN_ID, 0); }
		public Pin_countContext pin_count() {
			return getRuleContext(Pin_countContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Value_pin_count_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_pin_count_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterValue_pin_count_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitValue_pin_count_field(this);
		}
	}

	public final Value_pin_count_fieldContext value_pin_count_field() throws RecognitionException {
		Value_pin_count_fieldContext _localctx = new Value_pin_count_fieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value_pin_count_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(VAL_PIN_ID);
			setState(145);
			pin_count();
			setState(146);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pin_countContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Jesd3cParser.NUMBER, 0); }
		public TerminalNode BINARY_NUMBER() { return getToken(Jesd3cParser.BINARY_NUMBER, 0); }
		public Pin_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pin_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterPin_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitPin_count(this);
		}
	}

	public final Pin_countContext pin_count() throws RecognitionException {
		Pin_countContext _localctx = new Pin_countContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pin_count);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==BINARY_NUMBER || _la==NUMBER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Value_vec_limit_fieldContext extends ParserRuleContext {
		public TerminalNode VAL_VEC_ID() { return getToken(Jesd3cParser.VAL_VEC_ID, 0); }
		public Vec_limitContext vec_limit() {
			return getRuleContext(Vec_limitContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Value_vec_limit_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_vec_limit_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterValue_vec_limit_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitValue_vec_limit_field(this);
		}
	}

	public final Value_vec_limit_fieldContext value_vec_limit_field() throws RecognitionException {
		Value_vec_limit_fieldContext _localctx = new Value_vec_limit_fieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value_vec_limit_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(VAL_VEC_ID);
			setState(151);
			vec_limit();
			setState(152);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Vec_limitContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Jesd3cParser.NUMBER, 0); }
		public TerminalNode BINARY_NUMBER() { return getToken(Jesd3cParser.BINARY_NUMBER, 0); }
		public Vec_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vec_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterVec_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitVec_limit(this);
		}
	}

	public final Vec_limitContext vec_limit() throws RecognitionException {
		Vec_limitContext _localctx = new Vec_limitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vec_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==BINARY_NUMBER || _la==NUMBER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fuse_default_fieldContext extends ParserRuleContext {
		public Token value;
		public TerminalNode DEFAULT_ID() { return getToken(Jesd3cParser.DEFAULT_ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public TerminalNode BINARY_DIGIT() { return getToken(Jesd3cParser.BINARY_DIGIT, 0); }
		public Fuse_default_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuse_default_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterFuse_default_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitFuse_default_field(this);
		}
	}

	public final Fuse_default_fieldContext fuse_default_field() throws RecognitionException {
		Fuse_default_fieldContext _localctx = new Fuse_default_fieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fuse_default_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(DEFAULT_ID);
			setState(157);
			((Fuse_default_fieldContext)_localctx).value = match(BINARY_DIGIT);
			setState(158);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fuse_list_fieldContext extends ParserRuleContext {
		public TerminalNode FUSE_LIST_ID() { return getToken(Jesd3cParser.FUSE_LIST_ID, 0); }
		public Fuse_numberContext fuse_number() {
			return getRuleContext(Fuse_numberContext.class,0);
		}
		public Fuse_dataContext fuse_data() {
			return getRuleContext(Fuse_dataContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Fuse_list_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuse_list_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterFuse_list_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitFuse_list_field(this);
		}
	}

	public final Fuse_list_fieldContext fuse_list_field() throws RecognitionException {
		Fuse_list_fieldContext _localctx = new Fuse_list_fieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fuse_list_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(FUSE_LIST_ID);
			setState(161);
			fuse_number();
			setState(162);
			fuse_data();
			setState(163);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fuse_numberContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Fuse_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuse_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterFuse_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitFuse_number(this);
		}
	}

	public final Fuse_numberContext fuse_number() throws RecognitionException {
		Fuse_numberContext _localctx = new Fuse_numberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fuse_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			decimal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Jesd3cParser.NUMBER, 0); }
		public TerminalNode TEST_VEC_NUMBER() { return getToken(Jesd3cParser.TEST_VEC_NUMBER, 0); }
		public TerminalNode BINARY_NUMBER() { return getToken(Jesd3cParser.BINARY_NUMBER, 0); }
		public TerminalNode BINARY_DIGIT() { return getToken(Jesd3cParser.BINARY_DIGIT, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 96468992L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fuse_dataContext extends ParserRuleContext {
		public List<TerminalNode> BINARY_NUMBER() { return getTokens(Jesd3cParser.BINARY_NUMBER); }
		public TerminalNode BINARY_NUMBER(int i) {
			return getToken(Jesd3cParser.BINARY_NUMBER, i);
		}
		public TerminalNode BINARY_DIGIT() { return getToken(Jesd3cParser.BINARY_DIGIT, 0); }
		public Fuse_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuse_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterFuse_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitFuse_data(this);
		}
	}

	public final Fuse_dataContext fuse_data() throws RecognitionException {
		Fuse_dataContext _localctx = new Fuse_dataContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fuse_data);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(BINARY_NUMBER);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BINARY_NUMBER) {
					{
					{
					setState(170);
					match(BINARY_NUMBER);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BINARY_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(BINARY_DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fuse_checksum_fieldContext extends ParserRuleContext {
		public TerminalNode FUSE_CKSUM_ID() { return getToken(Jesd3cParser.FUSE_CKSUM_ID, 0); }
		public Fuse_cksumContext fuse_cksum() {
			return getRuleContext(Fuse_cksumContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Fuse_checksum_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuse_checksum_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterFuse_checksum_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitFuse_checksum_field(this);
		}
	}

	public final Fuse_checksum_fieldContext fuse_checksum_field() throws RecognitionException {
		Fuse_checksum_fieldContext _localctx = new Fuse_checksum_fieldContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fuse_checksum_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(FUSE_CKSUM_ID);
			setState(180);
			fuse_cksum();
			setState(181);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fuse_cksumContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(Jesd3cParser.HEX_NUMBER, 0); }
		public TerminalNode NUMBER() { return getToken(Jesd3cParser.NUMBER, 0); }
		public TerminalNode BINARY_NUMBER() { return getToken(Jesd3cParser.BINARY_NUMBER, 0); }
		public Fuse_cksumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuse_cksum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterFuse_cksum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitFuse_cksum(this);
		}
	}

	public final Fuse_cksumContext fuse_cksum() throws RecognitionException {
		Fuse_cksumContext _localctx = new Fuse_cksumContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fuse_cksum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Electrical_data_fieldContext extends ParserRuleContext {
		public Electrical_data_field_binContext electrical_data_field_bin() {
			return getRuleContext(Electrical_data_field_binContext.class,0);
		}
		public Electrical_data_field_hexContext electrical_data_field_hex() {
			return getRuleContext(Electrical_data_field_hexContext.class,0);
		}
		public Electrical_data_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_electrical_data_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterElectrical_data_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitElectrical_data_field(this);
		}
	}

	public final Electrical_data_fieldContext electrical_data_field() throws RecognitionException {
		Electrical_data_fieldContext _localctx = new Electrical_data_fieldContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_electrical_data_field);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELEC_BIN_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				electrical_data_field_bin();
				}
				break;
			case ELEC_HEX_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				electrical_data_field_hex();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Electrical_data_field_binContext extends ParserRuleContext {
		public Fuse_dataContext data;
		public TerminalNode ELEC_BIN_ID() { return getToken(Jesd3cParser.ELEC_BIN_ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Fuse_dataContext fuse_data() {
			return getRuleContext(Fuse_dataContext.class,0);
		}
		public Electrical_data_field_binContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_electrical_data_field_bin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterElectrical_data_field_bin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitElectrical_data_field_bin(this);
		}
	}

	public final Electrical_data_field_binContext electrical_data_field_bin() throws RecognitionException {
		Electrical_data_field_binContext _localctx = new Electrical_data_field_binContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_electrical_data_field_bin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ELEC_BIN_ID);
			setState(190);
			((Electrical_data_field_binContext)_localctx).data = fuse_data();
			setState(191);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Electrical_data_field_hexContext extends ParserRuleContext {
		public Hex_fuse_dataContext data;
		public TerminalNode ELEC_HEX_ID() { return getToken(Jesd3cParser.ELEC_HEX_ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Hex_fuse_dataContext hex_fuse_data() {
			return getRuleContext(Hex_fuse_dataContext.class,0);
		}
		public Electrical_data_field_hexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_electrical_data_field_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterElectrical_data_field_hex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitElectrical_data_field_hex(this);
		}
	}

	public final Electrical_data_field_hexContext electrical_data_field_hex() throws RecognitionException {
		Electrical_data_field_hexContext _localctx = new Electrical_data_field_hexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_electrical_data_field_hex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ELEC_HEX_ID);
			setState(194);
			((Electrical_data_field_hexContext)_localctx).data = hex_fuse_data();
			setState(195);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Hex_fuse_dataContext extends ParserRuleContext {
		public List<TerminalNode> HEX_NUMBER() { return getTokens(Jesd3cParser.HEX_NUMBER); }
		public TerminalNode HEX_NUMBER(int i) {
			return getToken(Jesd3cParser.HEX_NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(Jesd3cParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Jesd3cParser.NUMBER, i);
		}
		public List<TerminalNode> BINARY_NUMBER() { return getTokens(Jesd3cParser.BINARY_NUMBER); }
		public TerminalNode BINARY_NUMBER(int i) {
			return getToken(Jesd3cParser.BINARY_NUMBER, i);
		}
		public TerminalNode HEX_DIGIT() { return getToken(Jesd3cParser.HEX_DIGIT, 0); }
		public TerminalNode BINARY_DIGIT() { return getToken(Jesd3cParser.BINARY_DIGIT, 0); }
		public Hex_fuse_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_fuse_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterHex_fuse_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitHex_fuse_data(this);
		}
	}

	public final Hex_fuse_dataContext hex_fuse_data() throws RecognitionException {
		Hex_fuse_dataContext _localctx = new Hex_fuse_dataContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_hex_fuse_data);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_NUMBER:
			case NUMBER:
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
					{
					{
					setState(198);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case HEX_DIGIT:
			case BINARY_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==HEX_DIGIT || _la==BINARY_DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class User_data_fieldContext extends ParserRuleContext {
		public User_data_field_binContext user_data_field_bin() {
			return getRuleContext(User_data_field_binContext.class,0);
		}
		public User_data_field_hexContext user_data_field_hex() {
			return getRuleContext(User_data_field_hexContext.class,0);
		}
		public User_data_field_ascContext user_data_field_asc() {
			return getRuleContext(User_data_field_ascContext.class,0);
		}
		public User_data_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_data_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterUser_data_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitUser_data_field(this);
		}
	}

	public final User_data_fieldContext user_data_field() throws RecognitionException {
		User_data_fieldContext _localctx = new User_data_fieldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_user_data_field);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER_BIN_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				user_data_field_bin();
				}
				break;
			case USER_HEX_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				user_data_field_hex();
				}
				break;
			case USER_ASC_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				user_data_field_asc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class User_data_field_binContext extends ParserRuleContext {
		public User_data_binContext data;
		public TerminalNode USER_BIN_ID() { return getToken(Jesd3cParser.USER_BIN_ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public User_data_binContext user_data_bin() {
			return getRuleContext(User_data_binContext.class,0);
		}
		public User_data_field_binContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_data_field_bin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterUser_data_field_bin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitUser_data_field_bin(this);
		}
	}

	public final User_data_field_binContext user_data_field_bin() throws RecognitionException {
		User_data_field_binContext _localctx = new User_data_field_binContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_user_data_field_bin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(USER_BIN_ID);
			setState(213);
			((User_data_field_binContext)_localctx).data = user_data_bin();
			setState(214);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class User_data_field_hexContext extends ParserRuleContext {
		public User_data_hexContext data;
		public TerminalNode USER_HEX_ID() { return getToken(Jesd3cParser.USER_HEX_ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public User_data_hexContext user_data_hex() {
			return getRuleContext(User_data_hexContext.class,0);
		}
		public User_data_field_hexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_data_field_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterUser_data_field_hex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitUser_data_field_hex(this);
		}
	}

	public final User_data_field_hexContext user_data_field_hex() throws RecognitionException {
		User_data_field_hexContext _localctx = new User_data_field_hexContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_user_data_field_hex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(USER_HEX_ID);
			setState(217);
			((User_data_field_hexContext)_localctx).data = user_data_hex();
			setState(218);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class User_data_field_ascContext extends ParserRuleContext {
		public User_data_ascContext data;
		public TerminalNode USER_ASC_ID() { return getToken(Jesd3cParser.USER_ASC_ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public User_data_ascContext user_data_asc() {
			return getRuleContext(User_data_ascContext.class,0);
		}
		public User_data_field_ascContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_data_field_asc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterUser_data_field_asc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitUser_data_field_asc(this);
		}
	}

	public final User_data_field_ascContext user_data_field_asc() throws RecognitionException {
		User_data_field_ascContext _localctx = new User_data_field_ascContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_user_data_field_asc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(USER_ASC_ID);
			setState(221);
			((User_data_field_ascContext)_localctx).data = user_data_asc();
			setState(222);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class User_data_binContext extends ParserRuleContext {
		public List<TerminalNode> BINARY_NUMBER() { return getTokens(Jesd3cParser.BINARY_NUMBER); }
		public TerminalNode BINARY_NUMBER(int i) {
			return getToken(Jesd3cParser.BINARY_NUMBER, i);
		}
		public TerminalNode BINARY_DIGIT() { return getToken(Jesd3cParser.BINARY_DIGIT, 0); }
		public User_data_binContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_data_bin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterUser_data_bin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitUser_data_bin(this);
		}
	}

	public final User_data_binContext user_data_bin() throws RecognitionException {
		User_data_binContext _localctx = new User_data_binContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_user_data_bin);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(BINARY_NUMBER);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BINARY_NUMBER) {
					{
					{
					setState(225);
					match(BINARY_NUMBER);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BINARY_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(BINARY_DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class User_data_hexContext extends ParserRuleContext {
		public List<TerminalNode> HEX_NUMBER() { return getTokens(Jesd3cParser.HEX_NUMBER); }
		public TerminalNode HEX_NUMBER(int i) {
			return getToken(Jesd3cParser.HEX_NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(Jesd3cParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Jesd3cParser.NUMBER, i);
		}
		public List<TerminalNode> BINARY_NUMBER() { return getTokens(Jesd3cParser.BINARY_NUMBER); }
		public TerminalNode BINARY_NUMBER(int i) {
			return getToken(Jesd3cParser.BINARY_NUMBER, i);
		}
		public TerminalNode HEX_DIGIT() { return getToken(Jesd3cParser.HEX_DIGIT, 0); }
		public TerminalNode BINARY_DIGIT() { return getToken(Jesd3cParser.BINARY_DIGIT, 0); }
		public User_data_hexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_data_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterUser_data_hex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitUser_data_hex(this);
		}
	}

	public final User_data_hexContext user_data_hex() throws RecognitionException {
		User_data_hexContext _localctx = new User_data_hexContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_user_data_hex);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_NUMBER:
			case NUMBER:
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
					{
					{
					setState(235);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case HEX_DIGIT:
			case BINARY_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==HEX_DIGIT || _la==BINARY_DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class User_data_ascContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(Jesd3cParser.NOTE, 0); }
		public User_data_ascContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_data_asc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterUser_data_asc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitUser_data_asc(this);
		}
	}

	public final User_data_ascContext user_data_asc() throws RecognitionException {
		User_data_ascContext _localctx = new User_data_ascContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_user_data_asc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(NOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Device_id_fieldContext extends ParserRuleContext {
		public TerminalNode DEVICE_ID() { return getToken(Jesd3cParser.DEVICE_ID, 0); }
		public Arch_codeContext arch_code() {
			return getRuleContext(Arch_codeContext.class,0);
		}
		public Pinout_codeContext pinout_code() {
			return getRuleContext(Pinout_codeContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Device_id_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_device_id_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterDevice_id_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitDevice_id_field(this);
		}
	}

	public final Device_id_fieldContext device_id_field() throws RecognitionException {
		Device_id_fieldContext _localctx = new Device_id_fieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_device_id_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(DEVICE_ID);
			setState(247);
			arch_code();
			setState(248);
			pinout_code();
			setState(249);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arch_codeContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Arch_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arch_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterArch_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitArch_code(this);
		}
	}

	public final Arch_codeContext arch_code() throws RecognitionException {
		Arch_codeContext _localctx = new Arch_codeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arch_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			decimal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pinout_codeContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Pinout_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinout_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterPinout_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitPinout_code(this);
		}
	}

	public final Pinout_codeContext pinout_code() throws RecognitionException {
		Pinout_codeContext _localctx = new Pinout_codeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pinout_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			decimal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Default_test_cond_fieldContext extends ParserRuleContext {
		public TerminalNode DEF_TEST_COND_ID() { return getToken(Jesd3cParser.DEF_TEST_COND_ID, 0); }
		public Default_test_condContext default_test_cond() {
			return getRuleContext(Default_test_condContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Default_test_cond_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_test_cond_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterDefault_test_cond_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitDefault_test_cond_field(this);
		}
	}

	public final Default_test_cond_fieldContext default_test_cond_field() throws RecognitionException {
		Default_test_cond_fieldContext _localctx = new Default_test_cond_fieldContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_default_test_cond_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DEF_TEST_COND_ID);
			setState(256);
			default_test_cond();
			setState(257);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Default_test_condContext extends ParserRuleContext {
		public TerminalNode BINARY_DIGIT() { return getToken(Jesd3cParser.BINARY_DIGIT, 0); }
		public Default_test_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_test_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterDefault_test_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitDefault_test_cond(this);
		}
	}

	public final Default_test_condContext default_test_cond() throws RecognitionException {
		Default_test_condContext _localctx = new Default_test_condContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_default_test_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(BINARY_DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Test_vector_fieldContext extends ParserRuleContext {
		public TerminalNode TEST_VEC_ID() { return getToken(Jesd3cParser.TEST_VEC_ID, 0); }
		public Vector_numberContext vector_number() {
			return getRuleContext(Vector_numberContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public List<Value_fieldContext> value_field() {
			return getRuleContexts(Value_fieldContext.class);
		}
		public Value_fieldContext value_field(int i) {
			return getRuleContext(Value_fieldContext.class,i);
		}
		public Test_condContext test_cond() {
			return getRuleContext(Test_condContext.class,0);
		}
		public Test_vector_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_vector_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterTest_vector_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitTest_vector_field(this);
		}
	}

	public final Test_vector_fieldContext test_vector_field() throws RecognitionException {
		Test_vector_fieldContext _localctx = new Test_vector_fieldContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_test_vector_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(TEST_VEC_ID);
			setState(262);
			vector_number();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
				{
				{
				setState(263);
				value_field();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEST_VEC_NUMBER || _la==TEST_COND) {
				{
				setState(269);
				test_cond();
				}
			}

			setState(272);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Vector_numberContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Vector_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterVector_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitVector_number(this);
		}
	}

	public final Vector_numberContext vector_number() throws RecognitionException {
		Vector_numberContext _localctx = new Vector_numberContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_vector_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			decimal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Test_condContext extends ParserRuleContext {
		public List<TerminalNode> TEST_COND() { return getTokens(Jesd3cParser.TEST_COND); }
		public TerminalNode TEST_COND(int i) {
			return getToken(Jesd3cParser.TEST_COND, i);
		}
		public List<TerminalNode> TEST_VEC_NUMBER() { return getTokens(Jesd3cParser.TEST_VEC_NUMBER); }
		public TerminalNode TEST_VEC_NUMBER(int i) {
			return getToken(Jesd3cParser.TEST_VEC_NUMBER, i);
		}
		public Test_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterTest_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitTest_cond(this);
		}
	}

	public final Test_condContext test_cond() throws RecognitionException {
		Test_condContext _localctx = new Test_condContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_test_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(_la==TEST_VEC_NUMBER || _la==TEST_COND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEST_VEC_NUMBER || _la==TEST_COND) {
				{
				{
				setState(277);
				_la = _input.LA(1);
				if ( !(_la==TEST_VEC_NUMBER || _la==TEST_COND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(282);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pin_list_fieldContext extends ParserRuleContext {
		public TerminalNode PIN_LIST_ID() { return getToken(Jesd3cParser.PIN_LIST_ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Pin_listContext pin_list() {
			return getRuleContext(Pin_listContext.class,0);
		}
		public Pin_list_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pin_list_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterPin_list_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitPin_list_field(this);
		}
	}

	public final Pin_list_fieldContext pin_list_field() throws RecognitionException {
		Pin_list_fieldContext _localctx = new Pin_list_fieldContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pin_list_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(PIN_LIST_ID);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96468992L) != 0)) {
				{
				setState(284);
				pin_list();
				}
			}

			setState(287);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pin_listContext extends ParserRuleContext {
		public List<Pin_numberContext> pin_number() {
			return getRuleContexts(Pin_numberContext.class);
		}
		public Pin_numberContext pin_number(int i) {
			return getRuleContext(Pin_numberContext.class,i);
		}
		public Pin_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pin_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterPin_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitPin_list(this);
		}
	}

	public final Pin_listContext pin_list() throws RecognitionException {
		Pin_listContext _localctx = new Pin_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_pin_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				pin_number();
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 96468992L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pin_numberContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Pin_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pin_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterPin_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitPin_number(this);
		}
	}

	public final Pin_numberContext pin_number() throws RecognitionException {
		Pin_numberContext _localctx = new Pin_numberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pin_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			decimal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Empty_fieldContext extends ParserRuleContext {
		public TerminalNode TERMINATOR() { return getToken(Jesd3cParser.TERMINATOR, 0); }
		public Empty_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterEmpty_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitEmpty_field(this);
		}
	}

	public final Empty_fieldContext empty_field() throws RecognitionException {
		Empty_fieldContext _localctx = new Empty_fieldContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_empty_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(TERMINATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Xmit_cksumContext extends ParserRuleContext {
		public List<TerminalNode> HEX_DIGIT() { return getTokens(Jesd3cParser.HEX_DIGIT); }
		public TerminalNode HEX_DIGIT(int i) {
			return getToken(Jesd3cParser.HEX_DIGIT, i);
		}
		public Xmit_cksumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmit_cksum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).enterXmit_cksum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jesd3cParserListener ) ((Jesd3cParserListener)listener).exitXmit_cksum(this);
		}
	}

	public final Xmit_cksumContext xmit_cksum() throws RecognitionException {
		Xmit_cksumContext _localctx = new Xmit_cksumContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_xmit_cksum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(HEX_DIGIT);
			setState(299);
			match(HEX_DIGIT);
			setState(300);
			match(HEX_DIGIT);
			setState(301);
			match(HEX_DIGIT);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0130\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000_\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001e\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002k\b\u0002"+
		"\n\u0002\f\u0002n\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003|\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0080\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0089\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00ac\b\u0011\n\u0011"+
		"\f\u0011\u00af\t\u0011\u0001\u0011\u0003\u0011\u00b2\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00bc\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00c8\b\u0017\n\u0017\f\u0017\u00cb\t\u0017\u0001"+
		"\u0017\u0003\u0017\u00ce\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00d3\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u00e3\b\u001c\n"+
		"\u001c\f\u001c\u00e6\t\u001c\u0001\u001c\u0003\u001c\u00e9\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u00ed\b\u001d\n\u001d\f\u001d\u00f0\t\u001d"+
		"\u0001\u001d\u0003\u001d\u00f3\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0005$\u0109\b$\n$\f$\u010c\t$\u0001$\u0003$\u010f\b$\u0001$\u0001$"+
		"\u0001%\u0001%\u0001&\u0001&\u0005&\u0117\b&\n&\f&\u011a\t&\u0001\'\u0001"+
		"\'\u0003\'\u011e\b\'\u0001\'\u0001\'\u0001(\u0004(\u0123\b(\u000b(\f("+
		"\u0124\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+"+
		"\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0005"+
		"\u0001\u0000\u0017\u0018\u0002\u0000\u0016\u0018\u001a\u001a\u0001\u0000"+
		"\u0017\u0019\u0002\u0000\u0014\u0014\u0016\u0016\u0001\u0000\u001a\u001b"+
		"\u0124\u0000X\u0001\u0000\u0000\u0000\u0002d\u0001\u0000\u0000\u0000\u0004"+
		"h\u0001\u0000\u0000\u0000\u0006{\u0001\u0000\u0000\u0000\b}\u0001\u0000"+
		"\u0000\u0000\n\u0083\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000\u0000"+
		"\u0000\u000e\u008a\u0001\u0000\u0000\u0000\u0010\u008e\u0001\u0000\u0000"+
		"\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u0094\u0001\u0000\u0000"+
		"\u0000\u0016\u0096\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000"+
		"\u0000\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000"+
		"\u0000\u001e\u00a5\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000\u0000"+
		"\"\u00b1\u0001\u0000\u0000\u0000$\u00b3\u0001\u0000\u0000\u0000&\u00b7"+
		"\u0001\u0000\u0000\u0000(\u00bb\u0001\u0000\u0000\u0000*\u00bd\u0001\u0000"+
		"\u0000\u0000,\u00c1\u0001\u0000\u0000\u0000.\u00cd\u0001\u0000\u0000\u0000"+
		"0\u00d2\u0001\u0000\u0000\u00002\u00d4\u0001\u0000\u0000\u00004\u00d8"+
		"\u0001\u0000\u0000\u00006\u00dc\u0001\u0000\u0000\u00008\u00e8\u0001\u0000"+
		"\u0000\u0000:\u00f2\u0001\u0000\u0000\u0000<\u00f4\u0001\u0000\u0000\u0000"+
		">\u00f6\u0001\u0000\u0000\u0000@\u00fb\u0001\u0000\u0000\u0000B\u00fd"+
		"\u0001\u0000\u0000\u0000D\u00ff\u0001\u0000\u0000\u0000F\u0103\u0001\u0000"+
		"\u0000\u0000H\u0105\u0001\u0000\u0000\u0000J\u0112\u0001\u0000\u0000\u0000"+
		"L\u0114\u0001\u0000\u0000\u0000N\u011b\u0001\u0000\u0000\u0000P\u0122"+
		"\u0001\u0000\u0000\u0000R\u0126\u0001\u0000\u0000\u0000T\u0128\u0001\u0000"+
		"\u0000\u0000V\u012a\u0001\u0000\u0000\u0000XY\u0005\u0001\u0000\u0000"+
		"Y]\u0003\u0002\u0001\u0000Z\\\u0003\u0006\u0003\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0002\u0000\u0000ab\u0003V+\u0000b\u0001\u0001\u0000\u0000\u0000ce\u0003"+
		"\u0004\u0002\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fg\u0005\u0003\u0000\u0000g\u0003\u0001\u0000"+
		"\u0000\u0000hl\u0005\u001c\u0000\u0000ik\u0005\u001c\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000m\u0005\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000o|\u0003T*\u0000p|\u0003\b\u0004\u0000q|\u0003\f\u0006\u0000"+
		"r|\u0003\u001a\r\u0000s|\u0003\u001c\u000e\u0000t|\u0003$\u0012\u0000"+
		"u|\u0003(\u0014\u0000v|\u00030\u0018\u0000w|\u0003>\u001f\u0000x|\u0003"+
		"D\"\u0000y|\u0003H$\u0000z|\u0003N\'\u0000{o\u0001\u0000\u0000\u0000{"+
		"p\u0001\u0000\u0000\u0000{q\u0001\u0000\u0000\u0000{r\u0001\u0000\u0000"+
		"\u0000{s\u0001\u0000\u0000\u0000{t\u0001\u0000\u0000\u0000{u\u0001\u0000"+
		"\u0000\u0000{v\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000{x\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u0007\u0001\u0000\u0000\u0000}\u007f\u0005\u0004\u0000\u0000~\u0080"+
		"\u0003\n\u0005\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\u0003\u0000\u0000\u0082\t\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u001c"+
		"\u0000\u0000\u0084\u000b\u0001\u0000\u0000\u0000\u0085\u0089\u0003\u000e"+
		"\u0007\u0000\u0086\u0089\u0003\u0012\t\u0000\u0087\u0089\u0003\u0016\u000b"+
		"\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\r\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008c\u0003\u0010\b\u0000\u008c"+
		"\u008d\u0005\u0003\u0000\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0007\u0000\u0000\u0000\u008f\u0011\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\u0006\u0000\u0000\u0091\u0092\u0003\u0014\n\u0000\u0092\u0093"+
		"\u0005\u0003\u0000\u0000\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0007\u0000\u0000\u0000\u0095\u0015\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005\u0007\u0000\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098\u0099\u0005"+
		"\u0003\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u009b\u0007"+
		"\u0000\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\b\u0000\u0000\u009d\u009e\u0005\u0016\u0000\u0000\u009e\u009f\u0005\u0003"+
		"\u0000\u0000\u009f\u001b\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\t\u0000"+
		"\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3\u0003\"\u0011\u0000"+
		"\u00a3\u00a4\u0005\u0003\u0000\u0000\u00a4\u001d\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0003 \u0010\u0000\u00a6\u001f\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0007\u0001\u0000\u0000\u00a8!\u0001\u0000\u0000\u0000\u00a9\u00ad"+
		"\u0005\u0017\u0000\u0000\u00aa\u00ac\u0005\u0017\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b2"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0005\u0016\u0000\u0000\u00b1\u00a9\u0001\u0000\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\n\u0000\u0000\u00b4\u00b5\u0003&\u0013\u0000\u00b5\u00b6\u0005\u0003"+
		"\u0000\u0000\u00b6%\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0002\u0000"+
		"\u0000\u00b8\'\u0001\u0000\u0000\u0000\u00b9\u00bc\u0003*\u0015\u0000"+
		"\u00ba\u00bc\u0003,\u0016\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc)\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0005\f\u0000\u0000\u00be\u00bf\u0003\"\u0011\u0000\u00bf\u00c0\u0005"+
		"\u0003\u0000\u0000\u00c0+\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u000b"+
		"\u0000\u0000\u00c2\u00c3\u0003.\u0017\u0000\u00c3\u00c4\u0005\u0003\u0000"+
		"\u0000\u00c4-\u0001\u0000\u0000\u0000\u00c5\u00c9\u0007\u0002\u0000\u0000"+
		"\u00c6\u00c8\u0007\u0002\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ce\u0007\u0003\u0000\u0000"+
		"\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce/\u0001\u0000\u0000\u0000\u00cf\u00d3\u00032\u0019\u0000\u00d0\u00d3"+
		"\u00034\u001a\u0000\u00d1\u00d3\u00036\u001b\u0000\u00d2\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d31\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u000f\u0000"+
		"\u0000\u00d5\u00d6\u00038\u001c\u0000\u00d6\u00d7\u0005\u0003\u0000\u0000"+
		"\u00d73\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u000e\u0000\u0000\u00d9"+
		"\u00da\u0003:\u001d\u0000\u00da\u00db\u0005\u0003\u0000\u0000\u00db5\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005\r\u0000\u0000\u00dd\u00de\u0003<"+
		"\u001e\u0000\u00de\u00df\u0005\u0003\u0000\u0000\u00df7\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e4\u0005\u0017\u0000\u0000\u00e1\u00e3\u0005\u0017\u0000"+
		"\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e9\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e9\u0005\u0016\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e99\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ee\u0007\u0002\u0000\u0000\u00eb\u00ed\u0007\u0002\u0000\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f3\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0007\u0003\u0000\u0000\u00f2\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3;\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005\u001c\u0000\u0000\u00f5=\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0010\u0000\u0000\u00f7\u00f8\u0003@ \u0000\u00f8\u00f9\u0003B"+
		"!\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa?\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0003 \u0010\u0000\u00fcA\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0003 \u0010\u0000\u00feC\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0011"+
		"\u0000\u0000\u0100\u0101\u0003F#\u0000\u0101\u0102\u0005\u0003\u0000\u0000"+
		"\u0102E\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0016\u0000\u0000\u0104"+
		"G\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u0012\u0000\u0000\u0106\u010a"+
		"\u0003J%\u0000\u0107\u0109\u0003\f\u0006\u0000\u0108\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010f\u0003L&\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0003\u0000\u0000"+
		"\u0111I\u0001\u0000\u0000\u0000\u0112\u0113\u0003 \u0010\u0000\u0113K"+
		"\u0001\u0000\u0000\u0000\u0114\u0118\u0007\u0004\u0000\u0000\u0115\u0117"+
		"\u0007\u0004\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119M\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011b\u011d\u0005\u0013\u0000\u0000\u011c\u011e\u0003"+
		"P(\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u0003\u0000"+
		"\u0000\u0120O\u0001\u0000\u0000\u0000\u0121\u0123\u0003R)\u0000\u0122"+
		"\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"Q\u0001\u0000\u0000\u0000\u0126\u0127\u0003 \u0010\u0000\u0127S\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000\u0129U\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0005\u0014\u0000\u0000\u012b\u012c\u0005\u0014"+
		"\u0000\u0000\u012c\u012d\u0005\u0014\u0000\u0000\u012d\u012e\u0005\u0014"+
		"\u0000\u0000\u012eW\u0001\u0000\u0000\u0000\u0015]dl{\u007f\u0088\u00ad"+
		"\u00b1\u00bb\u00c9\u00cd\u00d2\u00e4\u00e8\u00ee\u00f2\u010a\u010e\u0118"+
		"\u011d\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}