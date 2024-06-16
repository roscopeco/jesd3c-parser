import antlr4

import sure

from jesd3c.parser.Jesd3cParser import Jesd3cParser
from jesd3c.parser.Jesd3cLexer import Jesd3cLexer


def test_parse_empty_field():
    _, result = _test_empty_field("*")


def test_parse_note_field_basic_empty():
    _, result = _test_note_field("N*")

    result.note().should.be.none


def test_parse_note_field_basic_empty_with_space():
    _, result = _test_note_field("N *")

    result.note().getText().should.be.equal_to(" ")


def test_parse_note_field_basic_not_empty():
    _, result = _test_note_field("N some note *")

    result.note().getText().should.be.equal_to(" some note ")


def test_parse_note_field_basic_not_empty_multiline():
    _, result = _test_note_field("N some note\n some more note *")

    result.note().getText().should.be.equal_to(" some note\n some more note ")


def test_parse_note_field_long_id_empty():
    _, result = _test_note_field("NOTE*")

    result.note().should.be.none


def test_parse_note_field_long_id_empty_with_space():
    _, result = _test_note_field("NOTE *")

    result.note().getText().should.be.equal_to(" ")


def test_parse_note_field_long_id_not_empty():
    _, result = _test_note_field("NOTE some note *")

    result.note().getText().should.be.equal_to(" some note ")


def test_parse_value_fuse_limit_field():
    _, result = _test_value_fuse_limit_field("QF1024*")

    result.fuse_limit().getText().should.be.equal_to("1024")


def test_parse_value_pin_count_field():
    _, result = _test_value_pin_count_field("QP44*")

    result.pin_count().getText().should.be.equal_to("44")


def test_parse_value_vec_limit_field():
    _, result = _test_value_vec_limit_field("QV9001*")

    result.vec_limit().getText().should.be.equal_to("9001")


def test_parse_fuse_default_field_0():
    _, result = _test_fuse_default_field("F0*")

    result.BINARY_DIGIT().should_not.be.none
    result.BINARY_DIGIT().getText().should.be.equal_to("0")


def test_parse_fuse_default_field_1():
    _, result = _test_fuse_default_field("F1*")

    result.BINARY_DIGIT().getText().should.be.equal_to("1")


def test_parse_fuse_field_simple():
    _, result = _test_fuse_list_field("L0000 01010101*")

    result.fuse_number().decimal().NUMBER().should.be.none
    result.fuse_number().decimal().BINARY_NUMBER().should_not.be.none

    result.fuse_number().getText().should.be.equal_to("0000")
    result.fuse_data().getText().should.be.equal_to("01010101")


def test_parse_fuse_field_multiline_spaces():
    _, result = _test_fuse_list_field("L0001 01010101\n    11111111\n00000000\n*")

    result.fuse_number().decimal().NUMBER().should.be.none
    result.fuse_number().decimal().BINARY_NUMBER().should_not.be.none

    result.fuse_number().getText().should.be.equal_to("0001")
    result.fuse_data().getText().should.be.equal_to("010101011111111100000000")


def test_parse_fuse_checksum_field_zeroes():
    _, result = _test_fuse_checksum_field("C0000n*")

    result.fuse_cksum().should_not.be.none
    result.fuse_cksum().getText().should.be.equal_to("0000")


def test_parse_fuse_checksum_field_ffff():
    _, result = _test_fuse_checksum_field("CFFFFn*")

    result.fuse_cksum().should_not.be.none
    result.fuse_cksum().getText().should.be.equal_to("FFFF")


def test_parse_electrical_data_field_bin_1():
    _, result = _test_electrical_data_field_bin("E1*")

    result.fuse_data().should_not.be.none
    result.fuse_data().getText().should.be.equal_to("1")


def test_parse_electrical_data_field_bin_2():
    _, result = _test_electrical_data_field_bin("E10*")

    result.fuse_data().should_not.be.none
    result.fuse_data().getText().should.be.equal_to("10")


def test_parse_electrical_data_field_bin_4_split():
    _, result = _test_electrical_data_field_bin("E10 01*")

    result.fuse_data().should_not.be.none
    result.fuse_data().getText().should.be.equal_to("1001")


def test_parse_electrical_data_field_bin_4_split_newline():
    _, result = _test_electrical_data_field_bin("E10\n01*")

    result.fuse_data().should_not.be.none
    result.fuse_data().getText().should.be.equal_to("1001")


def test_parse_electrical_data_field_hex_1():
    _, result = _test_electrical_data_field_hex("EH1*")

    result.hex_fuse_data().should_not.be.none
    result.hex_fuse_data().getText().should.be.equal_to("1")


def test_parse_electrical_data_field_hex_2():
    _, result = _test_electrical_data_field_hex("EH2*")

    result.hex_fuse_data().should_not.be.none
    result.hex_fuse_data().getText().should.be.equal_to("2")


def test_parse_electrical_data_field_hex_f():
    _, result = _test_electrical_data_field_hex("EHF*")

    result.hex_fuse_data().should_not.be.none
    result.hex_fuse_data().getText().should.be.equal_to("F")


def test_parse_electrical_data_field_hex_2():
    _, result = _test_electrical_data_field_hex("EH13*")

    result.hex_fuse_data().should_not.be.none
    result.hex_fuse_data().getText().should.be.equal_to("13")


def test_parse_electrical_data_field_hex_4_split():
    _, result = _test_electrical_data_field_hex("EH1D 2F*")

    result.hex_fuse_data().should_not.be.none
    result.hex_fuse_data().getText().should.be.equal_to("1D2F")


def test_parse_electrical_data_field_bin_4_split_newline():
    _, result = _test_electrical_data_field_hex("EH12\n34*")

    result.hex_fuse_data().should_not.be.none
    result.hex_fuse_data().getText().should.be.equal_to("1234")


def test_parse_user_data_field_bin_1_0():
    _, result = _test_user_data_field_bin("U0*")

    result.user_data_bin().should_not.be.none
    result.user_data_bin().getText().should.be.equal_to("0")


def test_parse_user_data_field_bin_1_1():
    _, result = _test_user_data_field_bin("U1*")

    result.user_data_bin().should_not.be.none
    result.user_data_bin().getText().should.be.equal_to("1")


def test_parse_user_data_field_bin_2():
    _, result = _test_user_data_field_bin("U10*")

    result.user_data_bin().should_not.be.none
    result.user_data_bin().getText().should.be.equal_to("10")


def test_parse_user_data_field_bin_4_split():
    _, result = _test_user_data_field_bin("U10\n01*")

    result.user_data_bin().should_not.be.none
    result.user_data_bin().getText().should.be.equal_to("1001")


def test_parse_user_data_field_hex_1_0():
    _, result = _test_user_data_field_hex("UH0*")

    result.user_data_hex().should_not.be.none
    result.user_data_hex().getText().should.be.equal_to("0")


def test_parse_user_data_field_hex_1_1():
    _, result = _test_user_data_field_hex("UH1*")

    result.user_data_hex().should_not.be.none
    result.user_data_hex().getText().should.be.equal_to("1")


def test_parse_user_data_field_hex_1_2():
    _, result = _test_user_data_field_hex("UH2*")

    result.user_data_hex().should_not.be.none
    result.user_data_hex().getText().should.be.equal_to("2")


def test_parse_user_data_field_hex_1_f():
    _, result = _test_user_data_field_hex("UHF*")

    result.user_data_hex().should_not.be.none
    result.user_data_hex().getText().should.be.equal_to("F")


def test_parse_user_data_field_hex_2_0():
    _, result = _test_user_data_field_hex("UH00*")

    result.user_data_hex().should_not.be.none
    result.user_data_hex().getText().should.be.equal_to("00")


def test_parse_user_data_field_hex_2_dec():
    _, result = _test_user_data_field_hex("UH12*")

    result.user_data_hex().should_not.be.none
    result.user_data_hex().getText().should.be.equal_to("12")


def test_parse_user_data_field_hex_2_hex():
    _, result = _test_user_data_field_hex("UHCA*")

    result.user_data_hex().should_not.be.none
    result.user_data_hex().getText().should.be.equal_to("CA")


def test_parse_user_data_field_hex_2_split():
    _, result = _test_user_data_field_hex("UH10\n33\nFC*")

    result.user_data_hex().should_not.be.none
    result.user_data_hex().getText().should.be.equal_to("1033FC")


def test_parse_user_data_field_asc_simple_nospace():
    _, result = _test_user_data_field_asc("UAsimple*")

    result.user_data_asc().should_not.be.none
    result.user_data_asc().getText().should.be.equal_to("simple")


def test_parse_user_data_field_asc_simple_space():
    _, result = _test_user_data_field_asc("UA simple *")

    result.user_data_asc().should_not.be.none
    result.user_data_asc().getText().should.be.equal_to(" simple ")


def test_parse_user_data_field_asc_split():
    _, result = _test_user_data_field_asc("UA\n simple two\n   three *")

    result.user_data_asc().should_not.be.none
    result.user_data_asc().getText().should.be.equal_to("\n simple two\n   three ")


def test_parse_device_id_field_both_1_0():
    _, result = _test_device_id_field("J 0 0*")

    result.arch_code().should_not.be.none
    result.arch_code().getText().should.be.equal_to("0")

    result.pinout_code().should_not.be.none
    result.pinout_code().getText().should.be.equal_to("0")


def test_parse_device_id_field_both_1_1():
    _, result = _test_device_id_field("J 1 1*")

    result.arch_code().should_not.be.none
    result.arch_code().getText().should.be.equal_to("1")

    result.pinout_code().should_not.be.none
    result.pinout_code().getText().should.be.equal_to("1")


def test_parse_device_id_field_both_1_2():
    _, result = _test_device_id_field("J 2 2*")

    result.arch_code().should_not.be.none
    result.arch_code().getText().should.be.equal_to("2")

    result.pinout_code().should_not.be.none
    result.pinout_code().getText().should.be.equal_to("2")


def test_parse_device_id_field_1_2():
    _, result = _test_device_id_field("J 1 23*")

    result.arch_code().should_not.be.none
    result.arch_code().getText().should.be.equal_to("1")

    result.pinout_code().should_not.be.none
    result.pinout_code().getText().should.be.equal_to("23")


def test_parse_device_id_field_2_2():
    _, result = _test_device_id_field("J 12 34*")

    result.arch_code().should_not.be.none
    result.arch_code().getText().should.be.equal_to("12")

    result.pinout_code().should_not.be.none
    result.pinout_code().getText().should.be.equal_to("34")


def test_parse_device_id_field_2_2_split():
    _, result = _test_device_id_field("J\n 12\n 34\n*")

    result.arch_code().should_not.be.none
    result.arch_code().getText().should.be.equal_to("12")

    result.pinout_code().should_not.be.none
    result.pinout_code().getText().should.be.equal_to("34")


def test_default_test_cond_field_0():
    _, result = _test_default_test_cond_field("X0*")

    result.default_test_cond().should_not.be.none
    result.default_test_cond().getText().should.be.equal_to("0")


def test_default_test_cond_field_1():
    _, result = _test_default_test_cond_field("X1*")

    result.default_test_cond().should_not.be.none
    result.default_test_cond().getText().should.be.equal_to("1")


def test_default_test_cond_field_0_split():
    _, result = _test_default_test_cond_field("X\n0*")

    result.default_test_cond().should_not.be.none
    result.default_test_cond().getText().should.be.equal_to("0")


def test_default_test_cond_field_1_split():
    _, result = _test_default_test_cond_field("X\n1*")

    result.default_test_cond().should_not.be.none
    result.default_test_cond().getText().should.be.equal_to("1")


def test_test_vector_field_empty():
    _, result = _test_test_vector_field("V0001*")

    result.vector_number().getText().should.be.equal_to("0001")
    result.test_cond().should.be.none


def test_test_vector_field_zero():
    _, result = _test_test_vector_field("V0001 0*")

    result.test_cond().should_not.be.none
    result.vector_number().getText().should.be.equal_to("0001")
    result.test_cond().getText().should.be.equal_to("0")


def test_test_vector_field_all():
    _, result = _test_test_vector_field(
        "V0001 0123456789BCDFHKLNPRTUXZ0123456789BCDFHKLNPRTUXZ0123456789BCDFHKLNPRTUXZ*"
    )

    result.test_cond().should_not.be.none
    result.vector_number().getText().should.be.equal_to("0001")
    result.test_cond().getText().should.be.equal_to(
        "0123456789BCDFHKLNPRTUXZ0123456789BCDFHKLNPRTUXZ0123456789BCDFHKLNPRTUXZ"
    )


def test_test_vector_field_one_digit_number():
    _, result = _test_test_vector_field("V1 0*")

    result.test_cond().should_not.be.none
    result.vector_number().getText().should.be.equal_to("1")
    result.test_cond().getText().should.be.equal_to("0")


def test_test_vector_field_two_digit_number():
    _, result = _test_test_vector_field("V42 0*")

    result.test_cond().should_not.be.none
    result.vector_number().getText().should.be.equal_to("42")
    result.test_cond().getText().should.be.equal_to("0")


def test_test_vector_field_ten_digit_number():
    _, result = _test_test_vector_field("V1234567890 0*")

    result.test_cond().should_not.be.none
    result.vector_number().getText().should.be.equal_to("1234567890")
    result.test_cond().getText().should.be.equal_to("0")


def test_pin_list_field_empty():
    _, result = _test_pin_list_field("P*")

    result.pin_list().should.be.none


def test_pin_list_field_empty_space():
    _, result = _test_pin_list_field("P *")

    result.pin_list().should.be.none


def test_pin_list_field_one_single_pin():
    _, result = _test_pin_list_field("P 1*")

    result.pin_list().should_not.be.none
    result.pin_list().pin_number().should_not.be.none
    [pin.getText() for pin in result.pin_list().pin_number()].should.equal(["1"])


def test_pin_list_field_one_single_pin_space():
    _, result = _test_pin_list_field("P 1 *")

    result.pin_list().should_not.be.none
    result.pin_list().pin_number().should_not.be.none
    [pin.getText() for pin in result.pin_list().pin_number()].should.equal(["1"])


def test_pin_list_field_one_double_pin():
    _, result = _test_pin_list_field("P 12*")

    result.pin_list().should_not.be.none
    result.pin_list().pin_number().should_not.be.none
    [pin.getText() for pin in result.pin_list().pin_number()].should.equal(["12"])


def test_pin_list_field_one_double_pin_space():
    _, result = _test_pin_list_field("P 12 *")

    result.pin_list().should_not.be.none
    result.pin_list().pin_number().should_not.be.none
    [pin.getText() for pin in result.pin_list().pin_number()].should.equal(["12"])


def test_pin_list_field_multiple_pin():
    _, result = _test_pin_list_field(
        "P 12 3 13 44 99999999 220202 101010101 1111111 0000 0 00 1 0 42 *"
    )

    result.pin_list().should_not.be.none
    result.pin_list().pin_number().should_not.be.none
    [pin.getText() for pin in result.pin_list().pin_number()].should.equal(
        [
            "12",
            "3",
            "13",
            "44",
            "99999999",
            "220202",
            "101010101",
            "1111111",
            "0000",
            "0",
            "00",
            "1",
            "0",
            "42",
        ]
    )


def _test_empty_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should_not.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.empty_field()


def _test_note_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should_not.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.note_field()


def _test_value_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should_not.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.value_field()


def _test_value_fuse_limit_field(s: str):
    parser, result = _test_value_field(s)

    result.value_fuse_limit_field().should_not.be.none
    result.value_pin_count_field().should.be.none
    result.value_vec_limit_field().should.be.none

    return parser, result.value_fuse_limit_field()


def _test_value_pin_count_field(s: str):
    parser, result = _test_value_field(s)

    result.value_fuse_limit_field().should.be.none
    result.value_pin_count_field().should_not.be.none
    result.value_vec_limit_field().should.be.none

    return parser, result.value_pin_count_field()


def _test_value_vec_limit_field(s: str):
    parser, result = _test_value_field(s)

    result.value_fuse_limit_field().should.be.none
    result.value_pin_count_field().should.be.none
    result.value_vec_limit_field().should_not.be.none

    return parser, result.value_vec_limit_field()


def _test_fuse_default_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should_not.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.fuse_default_field()


def _test_fuse_list_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should_not.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.fuse_list_field()


def _test_fuse_checksum_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should_not.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.fuse_checksum_field()


def _test_electrical_data_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should_not.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.electrical_data_field()


def _test_electrical_data_field_bin(s: str):
    parser, result = _test_electrical_data_field(s)

    result.electrical_data_field_bin().should_not.be.none
    result.electrical_data_field_hex().should.be.none

    return parser, result.electrical_data_field_bin()


def _test_electrical_data_field_hex(s: str):
    parser, result = _test_electrical_data_field(s)

    result.electrical_data_field_bin().should.be.none
    result.electrical_data_field_hex().should_not.be.none

    return parser, result.electrical_data_field_hex()


def _test_user_data_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should_not.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.user_data_field()


def _test_user_data_field_bin(s: str):
    parser, result = _test_user_data_field(s)

    result.user_data_field_bin().should_not.be.none
    result.user_data_field_hex().should.be.none
    result.user_data_field_asc().should.be.none

    return parser, result.user_data_field_bin()


def _test_user_data_field_hex(s: str):
    parser, result = _test_user_data_field(s)

    result.user_data_field_bin().should.be.none
    result.user_data_field_hex().should_not.be.none
    result.user_data_field_asc().should.be.none

    return parser, result.user_data_field_hex()


def _test_user_data_field_asc(s: str):
    parser, result = _test_user_data_field(s)

    result.user_data_field_bin().should.be.none
    result.user_data_field_hex().should.be.none
    result.user_data_field_asc().should_not.be.none

    return parser, result.user_data_field_asc()


def _test_device_id_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should_not.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.device_id_field()


def _test_default_test_cond_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should_not.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should.be.none

    return parser, result.default_test_cond_field()


def _test_test_vector_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should_not.be.none
    result.pin_list_field().should.be.none

    return parser, result.test_vector_field()


def _test_pin_list_field(s: str):
    parser = _string_parser(s)

    result = parser.field()

    # Common tests
    result.empty_field().should.be.none
    result.note_field().should.be.none
    result.value_field().should.be.none
    result.fuse_default_field().should.be.none
    result.fuse_list_field().should.be.none
    result.fuse_checksum_field().should.be.none
    result.electrical_data_field().should.be.none
    result.user_data_field().should.be.none
    result.device_id_field().should.be.none
    result.default_test_cond_field().should.be.none
    result.test_vector_field().should.be.none
    result.pin_list_field().should_not.be.none

    return parser, result.pin_list_field()


def _string_lexer(s: str):
    return Jesd3cLexer(antlr4.InputStream(s))


def _string_parser(s: str):
    return Jesd3cParser(antlr4.CommonTokenStream(_string_lexer(s)))
