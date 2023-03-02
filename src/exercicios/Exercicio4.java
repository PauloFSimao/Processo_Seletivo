package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		// declaração de variáveis
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double soma = sp + rj + mg + es + outros;
		
		// calculando e formatando a porcentagem dos estados
		DecimalFormat dfp = new DecimalFormat("0.00");
		String spP = dfp.format((sp/soma) * 100);
		String rjP = dfp.format((rj/soma) * 100);
		String mgP = dfp.format((mg/soma) * 100);
		String esP = dfp.format((es/soma) * 100);
		String outroP = dfp.format((outros/soma) * 100);
		
		// exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "SP: R$"+ (sp) +" - "+ spP +"%\n"
				+ "RJ: R$"+ (rj) +" - "+ rjP +"%\n"
				+ "MG: R$"+ (mg) +" - "+ mgP +"%\n"
				+ "ES: R$"+ (es) +" - "+ esP +"%\n"
				+ "Outros: R$"+ (outros) +" - "+ outroP +"%\n");
		
	}
}
