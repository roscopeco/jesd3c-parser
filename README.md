# JESD3-C Parser Library

## Standard Data Transfer Format Between Data Preparation System And Programmable Logic Device Programmer
## ANTLR4 Adaptive LL(\*) Lexer / Parser for use with various languages

### What

This is a clean-room open-source lexer and parser for the JESD3-C format, 
implemented as an ANTLR4 LL(\*) grammar, with build for various programming
languages.

The JESD3-C standard covers the `.jed` files that are commonly used to 
program and test PLD and CPLD chips, particularly those produced by 
ATMEL (now Microchip Technologies).

The grammar and resulting parser / lexer were built directly to the JESD3-C 
spec, with various quirks implemented based on output files from various
manufacturer tooling seen "in the wild".

The aim is to seamlessly support `.jed` files output by commonly-available
proprietary tooling.

### Copyright

Copyright ©2024 [The Really Old-School Company Limited](https://rosco_m68k.com).

JEDEC, JESD3-C and other marks are property of their respective owners.

The code herein is licensed under the MIT license. See LICENSE.md.

