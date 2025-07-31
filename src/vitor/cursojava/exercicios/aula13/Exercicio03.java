package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3. Faça um Programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		scan.useLocale(Locale.US);
		
		System.out.println("Digite um número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = scan.nextInt();
		
		System.out.println("A soma dos números é: " + (num1 + num2)); 	//Se não colocar entre parênteses é feita uma concatenação
	}

}
