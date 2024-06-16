// Generated from Jesd3cParser.g4 by ANTLR 4.13.1
package com.roscopeco.jesd3c.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Jesd3cParser}.
 */
public interface Jesd3cParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#jesd3c}.
	 * @param ctx the parse tree
	 */
	void enterJesd3c(Jesd3cParser.Jesd3cContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#jesd3c}.
	 * @param ctx the parse tree
	 */
	void exitJesd3c(Jesd3cParser.Jesd3cContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#spec_field}.
	 * @param ctx the parse tree
	 */
	void enterSpec_field(Jesd3cParser.Spec_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#spec_field}.
	 * @param ctx the parse tree
	 */
	void exitSpec_field(Jesd3cParser.Spec_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(Jesd3cParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(Jesd3cParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(Jesd3cParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(Jesd3cParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#note_field}.
	 * @param ctx the parse tree
	 */
	void enterNote_field(Jesd3cParser.Note_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#note_field}.
	 * @param ctx the parse tree
	 */
	void exitNote_field(Jesd3cParser.Note_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(Jesd3cParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(Jesd3cParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#value_field}.
	 * @param ctx the parse tree
	 */
	void enterValue_field(Jesd3cParser.Value_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#value_field}.
	 * @param ctx the parse tree
	 */
	void exitValue_field(Jesd3cParser.Value_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#value_fuse_limit_field}.
	 * @param ctx the parse tree
	 */
	void enterValue_fuse_limit_field(Jesd3cParser.Value_fuse_limit_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#value_fuse_limit_field}.
	 * @param ctx the parse tree
	 */
	void exitValue_fuse_limit_field(Jesd3cParser.Value_fuse_limit_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#fuse_limit}.
	 * @param ctx the parse tree
	 */
	void enterFuse_limit(Jesd3cParser.Fuse_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#fuse_limit}.
	 * @param ctx the parse tree
	 */
	void exitFuse_limit(Jesd3cParser.Fuse_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#value_pin_count_field}.
	 * @param ctx the parse tree
	 */
	void enterValue_pin_count_field(Jesd3cParser.Value_pin_count_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#value_pin_count_field}.
	 * @param ctx the parse tree
	 */
	void exitValue_pin_count_field(Jesd3cParser.Value_pin_count_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#pin_count}.
	 * @param ctx the parse tree
	 */
	void enterPin_count(Jesd3cParser.Pin_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#pin_count}.
	 * @param ctx the parse tree
	 */
	void exitPin_count(Jesd3cParser.Pin_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#value_vec_limit_field}.
	 * @param ctx the parse tree
	 */
	void enterValue_vec_limit_field(Jesd3cParser.Value_vec_limit_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#value_vec_limit_field}.
	 * @param ctx the parse tree
	 */
	void exitValue_vec_limit_field(Jesd3cParser.Value_vec_limit_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#vec_limit}.
	 * @param ctx the parse tree
	 */
	void enterVec_limit(Jesd3cParser.Vec_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#vec_limit}.
	 * @param ctx the parse tree
	 */
	void exitVec_limit(Jesd3cParser.Vec_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#fuse_default_field}.
	 * @param ctx the parse tree
	 */
	void enterFuse_default_field(Jesd3cParser.Fuse_default_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#fuse_default_field}.
	 * @param ctx the parse tree
	 */
	void exitFuse_default_field(Jesd3cParser.Fuse_default_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#fuse_list_field}.
	 * @param ctx the parse tree
	 */
	void enterFuse_list_field(Jesd3cParser.Fuse_list_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#fuse_list_field}.
	 * @param ctx the parse tree
	 */
	void exitFuse_list_field(Jesd3cParser.Fuse_list_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#fuse_number}.
	 * @param ctx the parse tree
	 */
	void enterFuse_number(Jesd3cParser.Fuse_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#fuse_number}.
	 * @param ctx the parse tree
	 */
	void exitFuse_number(Jesd3cParser.Fuse_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(Jesd3cParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(Jesd3cParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#fuse_data}.
	 * @param ctx the parse tree
	 */
	void enterFuse_data(Jesd3cParser.Fuse_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#fuse_data}.
	 * @param ctx the parse tree
	 */
	void exitFuse_data(Jesd3cParser.Fuse_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#fuse_checksum_field}.
	 * @param ctx the parse tree
	 */
	void enterFuse_checksum_field(Jesd3cParser.Fuse_checksum_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#fuse_checksum_field}.
	 * @param ctx the parse tree
	 */
	void exitFuse_checksum_field(Jesd3cParser.Fuse_checksum_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#fuse_cksum}.
	 * @param ctx the parse tree
	 */
	void enterFuse_cksum(Jesd3cParser.Fuse_cksumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#fuse_cksum}.
	 * @param ctx the parse tree
	 */
	void exitFuse_cksum(Jesd3cParser.Fuse_cksumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#electrical_data_field}.
	 * @param ctx the parse tree
	 */
	void enterElectrical_data_field(Jesd3cParser.Electrical_data_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#electrical_data_field}.
	 * @param ctx the parse tree
	 */
	void exitElectrical_data_field(Jesd3cParser.Electrical_data_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#electrical_data_field_bin}.
	 * @param ctx the parse tree
	 */
	void enterElectrical_data_field_bin(Jesd3cParser.Electrical_data_field_binContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#electrical_data_field_bin}.
	 * @param ctx the parse tree
	 */
	void exitElectrical_data_field_bin(Jesd3cParser.Electrical_data_field_binContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#electrical_data_field_hex}.
	 * @param ctx the parse tree
	 */
	void enterElectrical_data_field_hex(Jesd3cParser.Electrical_data_field_hexContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#electrical_data_field_hex}.
	 * @param ctx the parse tree
	 */
	void exitElectrical_data_field_hex(Jesd3cParser.Electrical_data_field_hexContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#hex_fuse_data}.
	 * @param ctx the parse tree
	 */
	void enterHex_fuse_data(Jesd3cParser.Hex_fuse_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#hex_fuse_data}.
	 * @param ctx the parse tree
	 */
	void exitHex_fuse_data(Jesd3cParser.Hex_fuse_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#user_data_field}.
	 * @param ctx the parse tree
	 */
	void enterUser_data_field(Jesd3cParser.User_data_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#user_data_field}.
	 * @param ctx the parse tree
	 */
	void exitUser_data_field(Jesd3cParser.User_data_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#user_data_field_bin}.
	 * @param ctx the parse tree
	 */
	void enterUser_data_field_bin(Jesd3cParser.User_data_field_binContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#user_data_field_bin}.
	 * @param ctx the parse tree
	 */
	void exitUser_data_field_bin(Jesd3cParser.User_data_field_binContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#user_data_field_hex}.
	 * @param ctx the parse tree
	 */
	void enterUser_data_field_hex(Jesd3cParser.User_data_field_hexContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#user_data_field_hex}.
	 * @param ctx the parse tree
	 */
	void exitUser_data_field_hex(Jesd3cParser.User_data_field_hexContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#user_data_field_asc}.
	 * @param ctx the parse tree
	 */
	void enterUser_data_field_asc(Jesd3cParser.User_data_field_ascContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#user_data_field_asc}.
	 * @param ctx the parse tree
	 */
	void exitUser_data_field_asc(Jesd3cParser.User_data_field_ascContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#user_data_bin}.
	 * @param ctx the parse tree
	 */
	void enterUser_data_bin(Jesd3cParser.User_data_binContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#user_data_bin}.
	 * @param ctx the parse tree
	 */
	void exitUser_data_bin(Jesd3cParser.User_data_binContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#user_data_hex}.
	 * @param ctx the parse tree
	 */
	void enterUser_data_hex(Jesd3cParser.User_data_hexContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#user_data_hex}.
	 * @param ctx the parse tree
	 */
	void exitUser_data_hex(Jesd3cParser.User_data_hexContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#user_data_asc}.
	 * @param ctx the parse tree
	 */
	void enterUser_data_asc(Jesd3cParser.User_data_ascContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#user_data_asc}.
	 * @param ctx the parse tree
	 */
	void exitUser_data_asc(Jesd3cParser.User_data_ascContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#device_id_field}.
	 * @param ctx the parse tree
	 */
	void enterDevice_id_field(Jesd3cParser.Device_id_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#device_id_field}.
	 * @param ctx the parse tree
	 */
	void exitDevice_id_field(Jesd3cParser.Device_id_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#arch_code}.
	 * @param ctx the parse tree
	 */
	void enterArch_code(Jesd3cParser.Arch_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#arch_code}.
	 * @param ctx the parse tree
	 */
	void exitArch_code(Jesd3cParser.Arch_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#pinout_code}.
	 * @param ctx the parse tree
	 */
	void enterPinout_code(Jesd3cParser.Pinout_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#pinout_code}.
	 * @param ctx the parse tree
	 */
	void exitPinout_code(Jesd3cParser.Pinout_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#default_test_cond_field}.
	 * @param ctx the parse tree
	 */
	void enterDefault_test_cond_field(Jesd3cParser.Default_test_cond_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#default_test_cond_field}.
	 * @param ctx the parse tree
	 */
	void exitDefault_test_cond_field(Jesd3cParser.Default_test_cond_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#default_test_cond}.
	 * @param ctx the parse tree
	 */
	void enterDefault_test_cond(Jesd3cParser.Default_test_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#default_test_cond}.
	 * @param ctx the parse tree
	 */
	void exitDefault_test_cond(Jesd3cParser.Default_test_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#test_vector_field}.
	 * @param ctx the parse tree
	 */
	void enterTest_vector_field(Jesd3cParser.Test_vector_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#test_vector_field}.
	 * @param ctx the parse tree
	 */
	void exitTest_vector_field(Jesd3cParser.Test_vector_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#vector_number}.
	 * @param ctx the parse tree
	 */
	void enterVector_number(Jesd3cParser.Vector_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#vector_number}.
	 * @param ctx the parse tree
	 */
	void exitVector_number(Jesd3cParser.Vector_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#test_cond}.
	 * @param ctx the parse tree
	 */
	void enterTest_cond(Jesd3cParser.Test_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#test_cond}.
	 * @param ctx the parse tree
	 */
	void exitTest_cond(Jesd3cParser.Test_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#pin_list_field}.
	 * @param ctx the parse tree
	 */
	void enterPin_list_field(Jesd3cParser.Pin_list_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#pin_list_field}.
	 * @param ctx the parse tree
	 */
	void exitPin_list_field(Jesd3cParser.Pin_list_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#pin_list}.
	 * @param ctx the parse tree
	 */
	void enterPin_list(Jesd3cParser.Pin_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#pin_list}.
	 * @param ctx the parse tree
	 */
	void exitPin_list(Jesd3cParser.Pin_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#pin_number}.
	 * @param ctx the parse tree
	 */
	void enterPin_number(Jesd3cParser.Pin_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#pin_number}.
	 * @param ctx the parse tree
	 */
	void exitPin_number(Jesd3cParser.Pin_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#empty_field}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_field(Jesd3cParser.Empty_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#empty_field}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_field(Jesd3cParser.Empty_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jesd3cParser#xmit_cksum}.
	 * @param ctx the parse tree
	 */
	void enterXmit_cksum(Jesd3cParser.Xmit_cksumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jesd3cParser#xmit_cksum}.
	 * @param ctx the parse tree
	 */
	void exitXmit_cksum(Jesd3cParser.Xmit_cksumContext ctx);
}