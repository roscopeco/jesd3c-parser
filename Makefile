ANTLR_JAR=~/Downloads/antlr-4.13.1-complete.jar
ANTLR_CMD=java -jar $(ANTLR_JAR) 

JAVA_PACKAGE=com.roscopeco.jesd3c.parser

GRAMMAR_SRC_DIR=.
PYTHON_SRC_DIR=python/src/jesd3c/parser
JAVA_SRC_DIR=java/src/main/java/$(subst .,/,$(JAVA_PACKAGE))


LEXER_NAME=Jesd3cLexer
PARSER_NAME=Jesd3cParser

ALL_LEXERS=$(PYTHON_SRC_DIR)/$(LEXER_NAME).py $(JAVA_SRC_DIR)/$(LEXER_NAME).java
ALL_PARSERS=$(PYTHON_SRC_DIR)/$(PARSER_NAME).py $(JAVA_SRC_DIR)/$(PARSER_NAME).java
ALL_TOKENS=$(PYTHON_SRC_DIR)/*.tokens $(JAVA_SRC_DIR)/*.tokens
ALL_INTERP=$(PYTHON_SRC_DIR)/*.interp $(JAVA_SRC_DIR)/*.interp
ALL_LISTENERS=$(PYTHON_SRC_DIR)/$(PARSER_NAME)BaseListener.py $(JAVA_SRC_DIR)/$(PARSER_NAME)BaseListener.java \
			  $(PYTHON_SRC_DIR)/$(PARSER_NAME)Listener.py $(JAVA_SRC_DIR)/$(PARSER_NAME)Listener.java
ALL_OUTPUTS=$(ALL_LEXERS) $(ALL_PARSERS) $(ALL_TOKENS) $(ALL_INTERP) $(ALL_LISTENERS)

.PHONY: all-code python java clean

nothing:
	@echo ""
	@echo "\033[1;31mNOTE:\033[0m Not generating code by default"
	@echo "      You only need to run make here if you change the grammars!"
	@echo "      See the README.md for details"
	@echo ""

all-code: python java

python: $(PYTHON_SRC_DIR)/$(PARSER_NAME).py
java: $(JAVA_SRC_DIR)/$(PARSER_NAME).java


clean: 
	rm -f $(ALL_OUTPUTS)

$(PYTHON_SRC_DIR)/$(LEXER_NAME).py: $(GRAMMAR_SRC_DIR)/$(LEXER_NAME).g4
	$(ANTLR_CMD) -Dlanguage=Python3 -o $(PYTHON_SRC_DIR) $<

$(PYTHON_SRC_DIR)/$(PARSER_NAME).py: $(GRAMMAR_SRC_DIR)/$(PARSER_NAME).g4 $(PYTHON_SRC_DIR)/$(LEXER_NAME).py
	$(ANTLR_CMD) -Dlanguage=Python3 -o $(PYTHON_SRC_DIR) -lib $(PYTHON_SRC_DIR) $<

$(JAVA_SRC_DIR)/$(LEXER_NAME).java: $(GRAMMAR_SRC_DIR)/$(LEXER_NAME).g4
	$(ANTLR_CMD) -Dlanguage=Java -o $(JAVA_SRC_DIR) -package $(JAVA_PACKAGE) $<

$(JAVA_SRC_DIR)/$(PARSER_NAME).java: $(GRAMMAR_SRC_DIR)/$(PARSER_NAME).g4 $(JAVA_SRC_DIR)/$(LEXER_NAME).java
	$(ANTLR_CMD) -Dlanguage=Java -o $(JAVA_SRC_DIR) -package $(JAVA_PACKAGE) -lib $(JAVA_SRC_DIR) $<

