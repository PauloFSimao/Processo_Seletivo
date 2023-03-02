package exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		// declaração de variáveis
		double maior = 0;
		double menor = 0;
		double media = 0;
		double soma = 0;
		int cont = 0;
		
		// criando uma matriz para armazenar os valores do json/XML e popolando
		double vector[][] = new double [30][2];
		vector[0][0] = 1;
		vector[0][1] = 22174.1664;
		vector[1][0] = 2;
		vector[1][1] = 24537.6698;
		vector[2][0] = 3;
		vector[2][1] = 26139.6134;
		vector[3][0] = 4;
		vector[3][1] = 0.0;
		vector[4][0] = 5;
		vector[4][1] = 0.0;
		vector[5][0] = 6;
		vector[5][1] = 26742.6612;
		vector[6][0] = 7;
		vector[6][1] = 0.0;
		vector[7][0] = 8;
		vector[7][1] = 42889.2258;
		vector[8][0] = 9;
		vector[8][1] = 46251.174;
		vector[9][0] = 10;
		vector[9][1] = 11191.4722;
		vector[10][0] = 11;
		vector[10][1] = 0.0;
		vector[11][0] = 12;
		vector[11][1] = 0.0;
		vector[12][0] = 13;
		vector[12][1] = 3847.4823;
		vector[13][0] = 14;
		vector[13][1] = 373.7838;
		vector[14][0] = 15;
		vector[14][1] = 2659.7563;
		vector[15][0] = 16;
		vector[15][1] = 48924.2448;
		vector[16][0] = 17;
		vector[16][1] = 18419.2614;
		vector[17][0] = 18;
		vector[17][1] = 0.0;
		vector[18][0] = 19;
		vector[18][1] = 0.0;
		vector[19][0] = 20;
		vector[19][1] = 35240.1826;
		vector[20][0] = 21;
		vector[20][1] = 43829.1667;
		vector[21][0] = 22;
		vector[21][1] = 18235.6852;
		vector[22][0] = 23;
		vector[22][1] = 4355.0662;
		vector[23][0] = 24;
		vector[23][1] = 13327.1025;
		vector[24][0] = 25;
		vector[24][1] = 0.0;
		vector[25][0] = 26;
		vector[25][1] = 0.0;
		vector[26][0] = 27;
		vector[26][1] = 25681.8318;
		vector[27][0] = 28;
		vector[27][1] = 1718.1221;
		vector[28][0] = 29;
		vector[28][1] = 13220.495;
		vector[29][0] = 30;
		vector[29][1] = 8414.61;
		
		// descobrindo o valor total mensal para calcular a média mensal
		for(int j = 0; j < 30; j++) {
			for(int i = 0; i < 2; i++) {
				soma += vector[j][i];
			}
		}
		media = soma/21;
		
		maior = vector[0][0];
		menor = vector[0][0];
		
		for(int j = 0; j < 30; j++) {
			for(int i = 0; i < 2; i++) {
				if(vector[j][i] > maior) {
					maior = vector[j][i];
				}else if(vector[j][i] < menor) {
					menor = vector[j][i];
				}
				
				if(vector[j][i] > media) {
					cont++;
				}
			}
		}
		// exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "O menor valor de faturamento foi: "+ menor +"\nO maior valor de faturamento foi: "+ maior +"\nE"+ cont +" dias no mês superaram a média mensal!");
		
	}
}
