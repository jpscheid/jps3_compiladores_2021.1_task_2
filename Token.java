/* *******************************************************************
 * Copyright (c) 2021 Universidade Federal de Pernambuco (UFPE).
 * 
 * This file is part of the Compilers course at UFPE.
 * 
 * During the 1970s and 1980s, Hewlett-Packard used RPN in all 
 * of their desktop and hand-held calculators, and continued to 
 * use it in some models into the 2020s. In computer science, 
 * reverse Polish notation is used in stack-oriented programming languages 
 * such as Forth, STOIC, PostScript, RPL and Joy.
 *  
 * Contributors: 
 *     Henrique Rebelo      initial design and implementation 
 *     http://www.cin.ufpe.br/~hemr/
 * ******************************************************************/

//package stacker.rpn.lexer;
/**
 * @author Henrique Rebelo
 */

package calculadora.rpn;

public class Token {

	//Variáveis globais modificadas.
	private TokenType type; // token type
	private String lexeme; // token value
	
	//Construtor vazio adicionado.
	public Token() {
		
	}
	
	public Token (TokenType type, String value) {
		this.type = type;
		this.lexeme = value;
	}
	
	//SETTER adicionado.
	public void set_Token(TokenType type, String value) {
		this.type = type;
		this.lexeme = value;
	}
	
	//GETTER adicionado.
	public TokenType get_Type() {
		return this.type;
	}
	
	//GETTER adicionado.
	public String get_Lexeme() {
		return this.lexeme;
	}

	@Override
	public String toString() {
		return "Token [type=" + this.type + ", lexeme=" + this.lexeme + "]";
	}
}
