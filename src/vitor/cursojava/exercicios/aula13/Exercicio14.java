package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio14 {

	public static void main(String[] args) {
		// 18.Faça um programa que peça o tamanho de um arquivo para download
		// (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
		// informe o tempo aproximado de download do arquivo usando este link
		// (em minutos).

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o tamanho do arquivo em MB: ");
		double tamanhoMB = scan.nextDouble();
		
		System.out.println("Digite a velocidade da rede de internet em Mbps: ");
		double velocidadeMbps = scan.nextDouble();
		
		double tamanhoMbps = tamanhoMB * 8;
		
		double tempoParaDownload = ((tamanhoMbps / velocidadeMbps) / 60);
		
		System.out.println("O tempo gasto para download do arquivo será: " + tempoParaDownload + " minutos.");
		
		//A resolução da Loiane está errada, visto que as unidades de medidas são diferentes. 1MB = 8Mb.
		
	}

}
