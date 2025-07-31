package vitor.cursojava.exercicios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// 1. Faça um Programa que peça dois números e imprima o maior deles
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O primeiro número é maior");
		}
		else if(num1 == num2) {
			System.out.println("Os dois números são iguais");
		}
		else {
			System.out.println("O segundo número é maior");
		}
	}

}
