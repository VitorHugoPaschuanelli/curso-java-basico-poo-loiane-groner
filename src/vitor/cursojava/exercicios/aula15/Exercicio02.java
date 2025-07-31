package vitor.cursojava.exercicios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// 2. Faça um Programa que peça um valor e mostre na tela se o valor é
		// positivo ou negativo.
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite um número (positivo ou negativo)");
		double num = scan.nextDouble();
		
		if(num >= 0) {
			System.out.println("O número é positivo");
		}
		else {
			System.out.println("O número é negativo");
		}
	}
}