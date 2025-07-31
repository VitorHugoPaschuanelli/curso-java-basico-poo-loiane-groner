package vitor.cursojava.exercicios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// 6. Faça um Programa que leia três números e mostre o maior deles.

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double num3 = scan.nextDouble();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O primeiro número é maior: " + num1);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("O segundo número é maior: " + num2);
		}
		else if(num3 > num1 && num3 > num2) {
			System.out.println("O terceiro número é maior: " + num3);
		}
		else if(num1 == num2 && num1 == num3){
			System.out.println("Todos os números são iguais: " + num1);
		}
		else if(num1 == num2){
			System.out.println("O primeiro e o segundo são iguais: " + num1);
		}
		else if(num1 == num3){
			System.out.println("O primeiro e o terceiro são iguais: " + num1);
		}
		else if(num2 == num3){
			System.out.println("O segundo e o terceiro são iguais: "  + num2);
		}
		
	}

}
