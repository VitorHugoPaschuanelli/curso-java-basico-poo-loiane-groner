package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12.Tendo como dados de entrada a altura de uma pessoa, construa um
		// algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
		//	(72.7*altura) - 58
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Seu peso ideal é: " + ((72.7*altura) - 58));
		
	}

}
