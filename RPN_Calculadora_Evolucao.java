package calculadora.rpn;

import java.io.*;
import java.util.*;

public class RPN_Calculadora_Evolucao {
	
	public static void main (String args[]) throws Exception {
		
		//File f = new File("\\Calc1.txt"); Modificar o caminho do arquivo exemplo para testar o código. 			
		BufferedReader br = new BufferedReader(new FileReader(f));
		Stack<Token> st = new Stack<Token>();
		String linha = "";	
		String mensagem1 = "";
		String mensagem2 = "";
		String mensagem3 = ""; 
		
		Token t_input = new Token();
		Token t_numero1 = new Token();
		Token t_numero2 = new Token();
		Token t_resultado = new Token();
		Token t_operador = new Token();
		
		double numero = 0.0, numero_1 = 0.0, numero_2 = 0.0, resultado = 0.0;
		
		while((linha = br.readLine()) != null) {
			System.out.println(linha);
			if(linha.equals("+")) {
				t_numero1 = st.pop();
				t_numero2 = st.pop();
				if(t_numero1.get_Type() == TokenType.TXT) {
					System.out.println();
					System.out.println("Error: Unexpected character: " + t_numero1.get_Lexeme());
					break;
				}
				else if (t_numero2.get_Type() == TokenType.TXT) {
					System.out.println();
					System.out.println("Error: Unexpected character: " + t_numero2.get_Lexeme());
					break;
				}
				else {
					t_operador.set_Token(TokenType.PLUS, "+");
					numero_1 = Double.parseDouble(t_numero1.get_Lexeme());
					numero_2 = Double.parseDouble(t_numero2.get_Lexeme());
					resultado = numero_1 + numero_2;
					t_resultado.set_Token(TokenType.NUM, Double.toString(resultado));
					st.push(t_resultado);
					mensagem1 = t_numero1.toString();
					mensagem2 = t_numero2.toString();
					mensagem3 = t_operador.toString();
					System.out.println();
					System.out.println(mensagem1);
					System.out.println(mensagem2);
					System.out.println(mensagem3);
					System.out.println();
					System.out.println("Saida: " + resultado);
				}				
			}
			else if(linha.equals("-")) {
				t_numero1 = st.pop();
				t_numero2 = st.pop();
				if(t_numero1.get_Type() == TokenType.TXT) {
					System.out.println();
					System.out.println("Error: Unexpected character: " + t_numero1.get_Lexeme());
					break;
				}
				else if (t_numero2.get_Type() == TokenType.TXT) {
					System.out.println();
					System.out.println("Error: Unexpected character: " + t_numero2.get_Lexeme());
					break;
				}
				else {
					t_operador.set_Token(TokenType.MINUS, "-");
					numero_1 = Double.parseDouble(t_numero1.get_Lexeme());
					numero_2 = Double.parseDouble(t_numero2.get_Lexeme());
					resultado = numero_1 - numero_2;
					t_resultado.set_Token(TokenType.NUM, Double.toString(resultado));
					st.push(t_resultado);
					mensagem1 = t_numero1.toString();
					mensagem2 = t_numero2.toString();
					mensagem3 = t_operador.toString();
					System.out.println();
					System.out.println(mensagem1);
					System.out.println(mensagem2);
					System.out.println(mensagem3);
					System.out.println();
					System.out.println("Saida: " + resultado);
				}		
			}
			else if(linha.equals("*")) {
				t_numero1 = st.pop();
				t_numero2 = st.pop();
				if(t_numero1.get_Type() == TokenType.TXT) {
					System.out.println();
					System.out.println("Error: Unexpected character: " + t_numero1.get_Lexeme());
					break;
				}
				else if (t_numero2.get_Type() == TokenType.TXT) {
					System.out.println();
					System.out.println("Error: Unexpected character: " + t_numero2.get_Lexeme());
					break;
				}
				else {
					t_operador.set_Token(TokenType.STAR, "*");
					numero_1 = Double.parseDouble(t_numero1.get_Lexeme());
					numero_2 = Double.parseDouble(t_numero2.get_Lexeme());
					resultado = numero_1 * numero_2;
					t_resultado.set_Token(TokenType.NUM, Double.toString(resultado));
					st.push(t_resultado);
					mensagem1 = t_numero1.toString();
					mensagem2 = t_numero2.toString();
					mensagem3 = t_operador.toString();
					System.out.println();
					System.out.println(mensagem1);
					System.out.println(mensagem2);
					System.out.println(mensagem3);
					System.out.println();
					System.out.println("Saida: " + resultado);
				}		
			}
			else if(linha.equals("/")) {
				t_numero1 = st.pop();
				t_numero2 = st.pop();
				if(t_numero1.get_Type() == TokenType.TXT) {
					System.out.println();
					System.out.println("Error: Unexpected character: " + t_numero1.get_Lexeme());
					break;
				}
				else if (t_numero2.get_Type() == TokenType.TXT) {
					System.out.println();
					System.out.println("Error: Unexpected character: " + t_numero2.get_Lexeme());
					break;
				}
				else {
					t_operador.set_Token(TokenType.SLASH, "/");
					numero_1 = Double.parseDouble(t_numero1.get_Lexeme());
					numero_2 = Double.parseDouble(t_numero2.get_Lexeme());
					resultado = numero_1 / numero_2;
					t_resultado.set_Token(TokenType.NUM, Double.toString(resultado));
					st.push(t_resultado);
					mensagem1 = t_numero1.toString();
					mensagem2 = t_numero2.toString();
					mensagem3 = t_operador.toString();
					System.out.println();
					System.out.println(mensagem1);
					System.out.println(mensagem2);
					System.out.println(mensagem3);
					System.out.println();
					System.out.println("Saida: " + resultado);
				}		
			}
			else {
				try {
					numero = Double.parseDouble(linha);
					t_input.set_Token(TokenType.NUM, linha);
					st.push(t_input);
				}
				catch (NumberFormatException e) {
					t_input.set_Token(TokenType.TXT, linha);
					st.push(t_input);
				}
			}
		}
		br.close();
	}
}
