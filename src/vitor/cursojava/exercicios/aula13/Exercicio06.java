package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {

	public static void main(String[] args) {
		// 6. Faça um Programa que peça o raio de um círculo, calcule e mostre
		// sua área.
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o valor do raio do círculo: ");
		double raio = scan.nextFloat();
		
		double PI = Math.PI;
		
		double area = PI * (raio * raio);
		
		System.out.println("A área do círculo é: " + area);
		
	}

}
