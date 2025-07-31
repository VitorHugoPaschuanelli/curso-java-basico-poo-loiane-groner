package vitor.cursojava.exercicios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// 10.Faça um Programa que peça a temperatura em graus Celsius,
		// transforme e mostre em graus Fahrenheit.

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite a temperatura em Celcius: ");
		double C = scan.nextDouble();
		
		System.out.println("A temperatura em Fahrenheit é: " + ((C * 9/5) + 32));
	}

}
