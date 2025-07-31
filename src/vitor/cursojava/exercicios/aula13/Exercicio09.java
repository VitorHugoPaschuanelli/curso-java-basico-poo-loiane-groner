package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio09 {

	public static void main(String[] args) {
		// 9. Faça um Programa que peça a temperatura em graus Fahrenheit,
		// transforme e mostre a temperatura em graus Celsius.
		// o C = (5 * (F-32) / 9).
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double F = scan.nextDouble();
		
		System.out.println("A temperatura em Celcius é: " + (5 * (F-32) / 9));
	}

}
