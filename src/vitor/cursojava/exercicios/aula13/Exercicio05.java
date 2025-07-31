package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {

	public static void main(String[] args) {
		// 5. Faça um Programa que converta metros para centímetros.
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite a quantidade de metros: ");
		double metros = scan.nextFloat();
		
		double centimetros  = metros * 100;
		
		System.out.println("A medida em centimetros é: " + centimetros);

	}

}
