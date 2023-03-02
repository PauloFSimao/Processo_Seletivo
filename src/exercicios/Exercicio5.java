package exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Insira uma palavra:");
		
		palavra.charAt(0);
		
		JOptionPane.showMessageDialog(null, embaralha(palavra));

	}
	
	public static StringBuilder embaralha(String word) {	
		StringBuilder resultado = new StringBuilder();
		for(int i = word.length() - 1; i >= 0 ; i--) {
			resultado.append(word.charAt(i));
		}
		return resultado;
	}
}
