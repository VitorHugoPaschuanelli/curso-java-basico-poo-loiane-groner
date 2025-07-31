package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio04 {

	public static void main(String[] args) {
		// 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = scan.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		double nota4 = scan.nextFloat();
		
		System.out.println("A média das notas é: " + ((nota1 + nota2 + nota3 + nota4) / 4));
	}

}
