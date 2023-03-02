package exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		// declaração de variáveis
		int number = 0;
		int i = 0;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		
		if(number == 1 || number == 0) {
			JOptionPane.showMessageDialog(null, "O número "+ number +" pertence a sequência de Fibonacci!");
		}else {
			
			ArrayList<Integer> sequence = new ArrayList<Integer>();
			sequence.add(0);
			sequence.add(1);
			sequence.add(1);
			
			while(i < number) {
				
				i = sequence.get(sequence.size() - 2) + sequence.get(sequence.size() - 1);
				sequence.add(i);
			}
			
			if(number == sequence.get(sequence.size() - 1)) {
				JOptionPane.showMessageDialog(null, "O número "+ number +" pertence a sequência de Fibonacci!");
			}else {
				JOptionPane.showMessageDialog(null, "O número "+ number +" não pertence a sequência de Fibonacci!");
			}
			
		}
		
		
	}
}
