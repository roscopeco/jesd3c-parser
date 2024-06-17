package com.roscopeco.jesd3c.parser;

import org.antlr.v4.runtime.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Jesd3cParserTests {

    @Test
    public void testParseEmptyField() {
        Jesd3cParser.Empty_fieldContext result = _testEmptyField("*").result();
    }

    @Test
    public void testParseNoteFieldBasicEmpty() {
        Jesd3cParser.Note_fieldContext result = _testNoteField("N*").result();
        assertThat(result.note()).isNull();
    }

    @Test
    public void testParseNoteFieldBasicEmptyWithSpace() {
        Jesd3cParser.Note_fieldContext result = _testNoteField("N *").result();
        assertThat(result.note().getText()).isEqualTo(" ");
    }

    @Test
    public void testParseNoteFieldBasicNotEmpty() {
        Jesd3cParser.Note_fieldContext result = _testNoteField("N some note *").result();
        assertThat(result.note().getText()).isEqualTo(" some note ");
    }

    @Test
    public void testParseNoteFieldBasicNotEmptyMultiline() {
        Jesd3cParser.Note_fieldContext result = _testNoteField("N some note\n some more note *").result();
        assertThat(result.note().getText()).isEqualTo(" some note\n some more note ");
    }

    @Test
    public void testParseNoteFieldLongIdEmpty() {
        Jesd3cParser.Note_fieldContext result = _testNoteField("NOTE*").result();
        assertThat(result.note()).isNull();
    }

    @Test
    public void testParseNoteFieldLongIdEmptyWithSpace() {
        Jesd3cParser.Note_fieldContext result = _testNoteField("NOTE *").result();
        assertThat(result.note().getText()).isEqualTo(" ");
    }

    @Test
    public void testParseNoteFieldLongIdNotEmpty() {
        Jesd3cParser.Note_fieldContext result = _testNoteField("NOTE some note *").result();
        assertThat(result.note().getText()).isEqualTo(" some note ");
    }

    @Test
    public void testParseValueFuseLimitField() {
        Jesd3cParser.Value_fuse_limit_fieldContext result = _testValueFuseLimitField("QF1024*").result();
        assertThat(result.fuse_limit().getText()).isEqualTo("1024");
    }

    @Test
    public void testParseValuePinCountField() {
        Jesd3cParser.Value_pin_count_fieldContext result = _testValuePinCountField("QP44*").result();
        assertThat(result.pin_count().getText()).isEqualTo("44");
    }

    @Test
    public void testParseValueVecLimitField() {
        Jesd3cParser.Value_vec_limit_fieldContext result = _testValueVecLimitField("QV9001*").result();
        assertThat(result.vec_limit().getText()).isEqualTo("9001");
    }

    @Test
    public void testParseFuseDefaultField0() {
        Jesd3cParser.Fuse_default_fieldContext result = _testFuseDefaultField("F0*").result();
        assertThat(result.BINARY_DIGIT()).isNotNull();
        assertThat(result.BINARY_DIGIT().getText()).isEqualTo("0");
    }

    @Test
    public void testParseFuseDefaultField1() {
        Jesd3cParser.Fuse_default_fieldContext result = _testFuseDefaultField("F1*").result();
        assertThat(result.BINARY_DIGIT().getText()).isEqualTo("1");
    }

    @Test
    public void testParseFuseFieldSimple() {
        Jesd3cParser.Fuse_list_fieldContext result = _testFuseListField("L0000 01010101*").result();
        assertThat(result.fuse_number().decimal().NUMBER()).isNull();
        assertThat(result.fuse_number().decimal().BINARY_NUMBER()).isNotNull();
        assertThat(result.fuse_number().getText()).isEqualTo("0000");
        assertThat(result.fuse_data().getText()).isEqualTo("01010101");
    }

    @Test
    public void testParseFuseFieldMultilineSpaces() {
        Jesd3cParser.Fuse_list_fieldContext result = _testFuseListField("L0001 01010101\n    11111111\n00000000\n*").result();
        assertThat(result.fuse_number().decimal().NUMBER()).isNull();
        assertThat(result.fuse_number().decimal().BINARY_NUMBER()).isNotNull();
        assertThat(result.fuse_number().getText()).isEqualTo("0001");
        assertThat(result.fuse_data().getText()).isEqualTo("010101011111111100000000");
    }

    @Test
    public void testParseFuseChecksumFieldZeroes() {
        Jesd3cParser.Fuse_checksum_fieldContext result = _testFuseChecksumField("C0000*").result();
        assertThat(result.fuse_cksum()).isNotNull();
        assertThat(result.fuse_cksum().getText()).isEqualTo("0000");
    }

    @Test
    public void testParseFuseChecksumFieldFFFF() {
        Jesd3cParser.Fuse_checksum_fieldContext result = _testFuseChecksumField("CFFFF*").result();
        assertThat(result.fuse_cksum()).isNotNull();
        assertThat(result.fuse_cksum().getText()).isEqualTo("FFFF");
    }

    @Test
    public void testParseElectrical_data_field_Bin1() {
        Jesd3cParser.Electrical_data_field_binContext result = _testElectrical_data_field_Bin("E1*").result();
        assertThat(result.fuse_data()).isNotNull();
        assertThat(result.fuse_data().getText()).isEqualTo("1");
    }

    @Test
    public void testParseElectrical_data_field_Bin2() {
        Jesd3cParser.Electrical_data_field_binContext result = _testElectrical_data_field_Bin("E10*").result();
        assertThat(result.fuse_data()).isNotNull();
        assertThat(result.fuse_data().getText()).isEqualTo("10");
    }

    @Test
    public void testParseElectrical_data_field_Bin4Split() {
        Jesd3cParser.Electrical_data_field_binContext result = _testElectrical_data_field_Bin("E10 01*").result();
        assertThat(result.fuse_data()).isNotNull();
        assertThat(result.fuse_data().getText()).isEqualTo("1001");
    }

    @Test
    public void testParseElectrical_data_field_Bin4SplitNewline() {
        Jesd3cParser.Electrical_data_field_binContext result = _testElectrical_data_field_Bin("E10\n01*").result();
        assertThat(result.fuse_data()).isNotNull();
        assertThat(result.fuse_data().getText()).isEqualTo("1001");
    }

    @Test
    public void testParseElectrical_data_field_Hex1() {
        Jesd3cParser.Electrical_data_field_hexContext result = _testElectrical_data_field_Hex("EH1*").result();
        assertThat(result.hex_fuse_data()).isNotNull();
        assertThat(result.hex_fuse_data().getText()).isEqualTo("1");
    }

    @Test
    public void testParseElectrical_data_field_Hex2() {
        Jesd3cParser.Electrical_data_field_hexContext result = _testElectrical_data_field_Hex("EH2*").result();
        assertThat(result.hex_fuse_data()).isNotNull();
        assertThat(result.hex_fuse_data().getText()).isEqualTo("2");
    }

    @Test
    public void testParseElectrical_data_field_HexF() {
        Jesd3cParser.Electrical_data_field_hexContext result = _testElectrical_data_field_Hex("EHF*").result();
        assertThat(result.hex_fuse_data()).isNotNull();
        assertThat(result.hex_fuse_data().getText()).isEqualTo("F");
    }

    @Test
    public void testParseElectrical_data_field_Hex2Again() {
        Jesd3cParser.Electrical_data_field_hexContext result = _testElectrical_data_field_Hex("EH13*").result();
        assertThat(result.hex_fuse_data()).isNotNull();
        assertThat(result.hex_fuse_data().getText()).isEqualTo("13");
    }

    @Test
    public void testParseElectrical_data_field_Hex4Split() {
        Jesd3cParser.Electrical_data_field_hexContext result = _testElectrical_data_field_Hex("EH1D 2F*").result();
        assertThat(result.hex_fuse_data()).isNotNull();
        assertThat(result.hex_fuse_data().getText()).isEqualTo("1D2F");
    }

    @Test
    public void testParseElectrical_data_field_Hex4SplitNewline() {
        Jesd3cParser.Electrical_data_field_hexContext result = _testElectrical_data_field_Hex("EH12\n34*").result();
        assertThat(result.hex_fuse_data()).isNotNull();
        assertThat(result.hex_fuse_data().getText()).isEqualTo("1234");
    }

    @Test
    public void testParseUser_data_field_Bin1_0() {
        Jesd3cParser.User_data_field_binContext result = _testUser_data_field_Bin("U0*").result();
        assertThat(result.user_data_bin()).isNotNull();
        assertThat(result.user_data_bin().getText()).isEqualTo("0");
    }

    @Test
    public void testParseUser_data_field_Bin1_1() {
        Jesd3cParser.User_data_field_binContext result = _testUser_data_field_Bin("U1*").result();
        assertThat(result.user_data_bin()).isNotNull();
        assertThat(result.user_data_bin().getText()).isEqualTo("1");
    }

    @Test
    public void testParseUser_data_field_Bin2() {
        Jesd3cParser.User_data_field_binContext result = _testUser_data_field_Bin("U10*").result();
        assertThat(result.user_data_bin()).isNotNull();
        assertThat(result.user_data_bin().getText()).isEqualTo("10");
    }

    @Test
    public void testParseUser_data_field_Bin4Split() {
        Jesd3cParser.User_data_field_binContext result = _testUser_data_field_Bin("U10\n01*").result();
        assertThat(result.user_data_bin()).isNotNull();
        assertThat(result.user_data_bin().getText()).isEqualTo("1001");
    }

    @Test
    public void testParseUser_data_field_Hex1_0() {
        Jesd3cParser.User_data_field_hexContext result = _testUser_data_field_Hex("UH0*").result();
        assertThat(result.user_data_hex()).isNotNull();
        assertThat(result.user_data_hex().getText()).isEqualTo("0");
    }

    @Test
    public void testParseUser_data_field_Hex1_1() {
        Jesd3cParser.User_data_field_hexContext result = _testUser_data_field_Hex("UH1*").result();
        assertThat(result.user_data_hex()).isNotNull();
        assertThat(result.user_data_hex().getText()).isEqualTo("1");
    }

    @Test
    public void testParseUser_data_field_Hex1_2() {
        Jesd3cParser.User_data_field_hexContext result = _testUser_data_field_Hex("UH2*").result();
        assertThat(result.user_data_hex()).isNotNull();
        assertThat(result.user_data_hex().getText()).isEqualTo("2");
    }

    @Test
    public void testParseUser_data_field_Hex1_F() {
        Jesd3cParser.User_data_field_hexContext result = _testUser_data_field_Hex("UHF*").result();
        assertThat(result.user_data_hex()).isNotNull();
        assertThat(result.user_data_hex().getText()).isEqualTo("F");
    }

    @Test
    public void testParseUser_data_field_Hex2_0() {
        Jesd3cParser.User_data_field_hexContext result = _testUser_data_field_Hex("UH00*").result();
        assertThat(result.user_data_hex()).isNotNull();
        assertThat(result.user_data_hex().getText()).isEqualTo("00");
    }

    @Test
    public void testParseUser_data_field_Hex2Dec() {
        Jesd3cParser.User_data_field_hexContext result = _testUser_data_field_Hex("UH12*").result();
        assertThat(result.user_data_hex()).isNotNull();
        assertThat(result.user_data_hex().getText()).isEqualTo("12");
    }

    @Test
    public void testParseUser_data_field_Hex2Hex() {
        Jesd3cParser.User_data_field_hexContext result = _testUser_data_field_Hex("UHCA*").result();
        assertThat(result.user_data_hex()).isNotNull();
        assertThat(result.user_data_hex().getText()).isEqualTo("CA");
    }

    @Test
    public void testParseUser_data_field_Hex2Split() {
        Jesd3cParser.User_data_field_hexContext result = _testUser_data_field_Hex("UH10\n33\nFC*").result();
        assertThat(result.user_data_hex()).isNotNull();
        assertThat(result.user_data_hex().getText()).isEqualTo("1033FC");
    }

    @Test
    public void testParseUser_data_field_AscSimpleNospace() {
        Jesd3cParser.User_data_field_ascContext result = _testUser_data_field_Asc("UAsimple*").result();
        assertThat(result.user_data_asc()).isNotNull();
        assertThat(result.user_data_asc().getText()).isEqualTo("simple");
    }

    @Test
    public void testParseUser_data_field_AscSimpleSpace() {
        Jesd3cParser.User_data_field_ascContext result = _testUser_data_field_Asc("UA simple *").result();
        assertThat(result.user_data_asc()).isNotNull();
        assertThat(result.user_data_asc().getText()).isEqualTo(" simple ");
    }

    @Test
    public void testParseUser_data_field_AscSplit() {
        Jesd3cParser.User_data_field_ascContext result = _testUser_data_field_Asc("UA\n simple two\n   three *").result();
        assertThat(result.user_data_asc()).isNotNull();
        assertThat(result.user_data_asc().getText()).isEqualTo("\n simple two\n   three ");
    }

    @Test
    public void testParseDeviceIdFieldBoth1_0() {
        Jesd3cParser.Device_id_fieldContext result = _testDeviceIdField("J 0 0*").result();
        assertThat(result.arch_code()).isNotNull();
        assertThat(result.arch_code().getText()).isEqualTo("0");
        assertThat(result.pinout_code()).isNotNull();
        assertThat(result.pinout_code().getText()).isEqualTo("0");
    }

    @Test
    public void testParseDeviceIdFieldBoth1_1() {
        Jesd3cParser.Device_id_fieldContext result = _testDeviceIdField("J 1 1*").result();
        assertThat(result.arch_code()).isNotNull();
        assertThat(result.arch_code().getText()).isEqualTo("1");
        assertThat(result.pinout_code()).isNotNull();
        assertThat(result.pinout_code().getText()).isEqualTo("1");
    }

    @Test
    public void testParseDeviceIdFieldBoth1_2() {
        Jesd3cParser.Device_id_fieldContext result = _testDeviceIdField("J 2 2*").result();
        assertThat(result.arch_code()).isNotNull();
        assertThat(result.arch_code().getText()).isEqualTo("2");
        assertThat(result.pinout_code()).isNotNull();
        assertThat(result.pinout_code().getText()).isEqualTo("2");
    }

    @Test
    public void testParseDeviceIdField1_2() {
        Jesd3cParser.Device_id_fieldContext result = _testDeviceIdField("J 1 23*").result();
        assertThat(result.arch_code()).isNotNull();
        assertThat(result.arch_code().getText()).isEqualTo("1");
        assertThat(result.pinout_code()).isNotNull();
        assertThat(result.pinout_code().getText()).isEqualTo("23");
    }

    @Test
    public void testParseDeviceIdField2_2() {
        Jesd3cParser.Device_id_fieldContext result = _testDeviceIdField("J 12 34*").result();
        assertThat(result.arch_code()).isNotNull();
        assertThat(result.arch_code().getText()).isEqualTo("12");
        assertThat(result.pinout_code()).isNotNull();
        assertThat(result.pinout_code().getText()).isEqualTo("34");
    }

    @Test
    public void testParseDeviceIdField2_2Split() {
        Jesd3cParser.Device_id_fieldContext result = _testDeviceIdField("J\n 12\n 34\n*").result();
        assertThat(result.arch_code()).isNotNull();
        assertThat(result.arch_code().getText()).isEqualTo("12");
        assertThat(result.pinout_code()).isNotNull();
        assertThat(result.pinout_code().getText()).isEqualTo("34");
    }

    private ParserAndField<Jesd3cParser.Empty_fieldContext> _testEmptyField(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNotNull();
        assertThat(result.note_field()).isNull();
        assertThat(result.value_field()).isNull();
        assertThat(result.fuse_default_field()).isNull();
        assertThat(result.fuse_list_field()).isNull();
        assertThat(result.fuse_checksum_field()).isNull();
        assertThat(result.electrical_data_field()).isNull();
        assertThat(result.user_data_field()).isNull();
        assertThat(result.device_id_field()).isNull();

        return new ParserAndField<>(parser, result.empty_field());
    }

    private ParserAndField<Jesd3cParser.Note_fieldContext> _testNoteField(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNull();
        assertThat(result.note_field()).isNotNull();
        assertThat(result.value_field()).isNull();
        assertThat(result.fuse_default_field()).isNull();
        assertThat(result.fuse_list_field()).isNull();
        assertThat(result.fuse_checksum_field()).isNull();
        assertThat(result.electrical_data_field()).isNull();
        assertThat(result.user_data_field()).isNull();
        assertThat(result.device_id_field()).isNull();

        return new ParserAndField<>(parser, result.note_field());
    }

    private ParserAndField<Jesd3cParser.Value_fieldContext> _testValueField(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNull();
        assertThat(result.note_field()).isNull();
        assertThat(result.value_field()).isNotNull();
        assertThat(result.fuse_default_field()).isNull();
        assertThat(result.fuse_list_field()).isNull();
        assertThat(result.fuse_checksum_field()).isNull();
        assertThat(result.electrical_data_field()).isNull();
        assertThat(result.user_data_field()).isNull();
        assertThat(result.device_id_field()).isNull();

        return new ParserAndField<>(parser, result.value_field());
    }

    private ParserAndField<Jesd3cParser.Value_fuse_limit_fieldContext> _testValueFuseLimitField(String s) {
        ParserAndField<Jesd3cParser.Value_fieldContext> result = _testValueField(s);
        assertThat(result.result().value_fuse_limit_field()).isNotNull();
        assertThat(result.result().value_pin_count_field()).isNull();
        assertThat(result.result().value_vec_limit_field()).isNull();

        return new ParserAndField<>(result.parser(), result.result().value_fuse_limit_field());
    }

    private ParserAndField<Jesd3cParser.Value_pin_count_fieldContext> _testValuePinCountField(String s) {
        ParserAndField<Jesd3cParser.Value_fieldContext> result = _testValueField(s);
        assertThat(result.result().value_fuse_limit_field()).isNull();
        assertThat(result.result().value_pin_count_field()).isNotNull();
        assertThat(result.result().value_vec_limit_field()).isNull();

        return new ParserAndField<>(result.parser(), result.result().value_pin_count_field());
    }

    private ParserAndField<Jesd3cParser.Value_vec_limit_fieldContext> _testValueVecLimitField(String s) {
        ParserAndField<Jesd3cParser.Value_fieldContext> result = _testValueField(s);
        assertThat(result.result().value_fuse_limit_field()).isNull();
        assertThat(result.result().value_pin_count_field()).isNull();
        assertThat(result.result().value_vec_limit_field()).isNotNull();

        return new ParserAndField<>(result.parser(), result.result().value_vec_limit_field());
    }

    private ParserAndField<Jesd3cParser.Fuse_default_fieldContext> _testFuseDefaultField(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNull();
        assertThat(result.note_field()).isNull();
        assertThat(result.value_field()).isNull();
        assertThat(result.fuse_default_field()).isNotNull();
        assertThat(result.fuse_list_field()).isNull();
        assertThat(result.fuse_checksum_field()).isNull();
        assertThat(result.electrical_data_field()).isNull();
        assertThat(result.user_data_field()).isNull();
        assertThat(result.device_id_field()).isNull();

        return new ParserAndField<>(parser, result.fuse_default_field());
    }

    private ParserAndField<Jesd3cParser.Fuse_list_fieldContext> _testFuseListField(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNull();
        assertThat(result.note_field()).isNull();
        assertThat(result.value_field()).isNull();
        assertThat(result.fuse_default_field()).isNull();
        assertThat(result.fuse_list_field()).isNotNull();
        assertThat(result.fuse_checksum_field()).isNull();
        assertThat(result.electrical_data_field()).isNull();
        assertThat(result.user_data_field()).isNull();
        assertThat(result.device_id_field()).isNull();

        return new ParserAndField<>(parser, result.fuse_list_field());
    }

    private ParserAndField<Jesd3cParser.Fuse_checksum_fieldContext> _testFuseChecksumField(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNull();
        assertThat(result.note_field()).isNull();
        assertThat(result.value_field()).isNull();
        assertThat(result.fuse_default_field()).isNull();
        assertThat(result.fuse_list_field()).isNull();
        assertThat(result.fuse_checksum_field()).isNotNull();
        assertThat(result.electrical_data_field()).isNull();
        assertThat(result.user_data_field()).isNull();
        assertThat(result.device_id_field()).isNull();

        return new ParserAndField<>(parser, result.fuse_checksum_field());
    }

    private ParserAndField<Jesd3cParser.Electrical_data_fieldContext> _testElectrical_data_field_(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNull();
        assertThat(result.note_field()).isNull();
        assertThat(result.value_field()).isNull();
        assertThat(result.fuse_default_field()).isNull();
        assertThat(result.fuse_list_field()).isNull();
        assertThat(result.fuse_checksum_field()).isNull();
        assertThat(result.electrical_data_field()).isNotNull();
        assertThat(result.user_data_field()).isNull();
        assertThat(result.device_id_field()).isNull();

        return new ParserAndField<>(parser, result.electrical_data_field());
    }

    private ParserAndField<Jesd3cParser.Electrical_data_field_binContext> _testElectrical_data_field_Bin(String s) {
        ParserAndField<Jesd3cParser.Electrical_data_fieldContext> result = _testElectrical_data_field_(s);
        assertThat(result.result().electrical_data_field_bin()).isNotNull();
        assertThat(result.result().electrical_data_field_hex()).isNull();

        return new ParserAndField<>(result.parser(), result.result().electrical_data_field_bin());
    }

    private ParserAndField<Jesd3cParser.Electrical_data_field_hexContext> _testElectrical_data_field_Hex(String s) {
        ParserAndField<Jesd3cParser.Electrical_data_fieldContext> result = _testElectrical_data_field_(s);
        assertThat(result.result().electrical_data_field_bin()).isNull();
        assertThat(result.result().electrical_data_field_hex()).isNotNull();

        return new ParserAndField<>(result.parser(), result.result().electrical_data_field_hex());
    }

    private ParserAndField<Jesd3cParser.User_data_fieldContext> _testUser_data_field_(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNull();
        assertThat(result.note_field()).isNull();
        assertThat(result.value_field()).isNull();
        assertThat(result.fuse_default_field()).isNull();
        assertThat(result.fuse_list_field()).isNull();
        assertThat(result.fuse_checksum_field()).isNull();
        assertThat(result.electrical_data_field()).isNull();
        assertThat(result.user_data_field()).isNotNull();
        assertThat(result.device_id_field()).isNull();

        return new ParserAndField<>(parser, result.user_data_field());
    }

    private ParserAndField<Jesd3cParser.User_data_field_binContext> _testUser_data_field_Bin(String s) {
        ParserAndField<Jesd3cParser.User_data_fieldContext> result = _testUser_data_field_(s);
        assertThat(result.result().user_data_field_bin()).isNotNull();
        assertThat(result.result().user_data_field_hex()).isNull();
        assertThat(result.result().user_data_field_asc()).isNull();

        return new ParserAndField<>(result.parser(), result.result().user_data_field_bin());
    }

    private ParserAndField<Jesd3cParser.User_data_field_hexContext> _testUser_data_field_Hex(String s) {
        ParserAndField<Jesd3cParser.User_data_fieldContext> result = _testUser_data_field_(s);
        assertThat(result.result().user_data_field_bin()).isNull();
        assertThat(result.result().user_data_field_hex()).isNotNull();
        assertThat(result.result().user_data_field_asc()).isNull();

        return new ParserAndField<>(result.parser(), result.result().user_data_field_hex());
    }

    private ParserAndField<Jesd3cParser.User_data_field_ascContext> _testUser_data_field_Asc(String s) {
        ParserAndField<Jesd3cParser.User_data_fieldContext> result = _testUser_data_field_(s);
        assertThat(result.result().user_data_field_bin()).isNull();
        assertThat(result.result().user_data_field_hex()).isNull();
        assertThat(result.result().user_data_field_asc()).isNotNull();

        return new ParserAndField<>(result.parser(), result.result().user_data_field_asc());
    }

    private ParserAndField<Jesd3cParser.Device_id_fieldContext> _testDeviceIdField(String s) {
        Jesd3cParser parser = _stringParser(s);
        Jesd3cParser.FieldContext result = parser.field();

        // Common tests
        assertThat(result.empty_field()).isNull();
        assertThat(result.note_field()).isNull();
        assertThat(result.value_field()).isNull();
        assertThat(result.fuse_default_field()).isNull();
        assertThat(result.fuse_list_field()).isNull();
        assertThat(result.fuse_checksum_field()).isNull();
        assertThat(result.electrical_data_field()).isNull();
        assertThat(result.user_data_field()).isNull();
        assertThat(result.device_id_field()).isNotNull();

        return new ParserAndField<>(parser, result.device_id_field());
    }

    private Jesd3cLexer _stringLexer(String s) {
        return new Jesd3cLexer(CharStreams.fromString(s));
    }

    private Jesd3cParser _stringParser(String s) {
        return new Jesd3cParser(new CommonTokenStream(_stringLexer(s)));
    }

    private static class ParserAndField<T> {
        private final Jesd3cParser parser;
        private final T result;

        private ParserAndField(Jesd3cParser parser, T result) {
            this.parser = parser;
            this.result = result;
        }

        public Jesd3cParser parser() {
            return parser;
        }

        public T result() {
            return result;
        }
    }
}
