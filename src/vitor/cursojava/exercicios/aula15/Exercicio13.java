package vitor.cursojava.exercicios.aula15;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {

	public static void main(String[] args) {
		/* 13.Faça um Programa que leia um número e exiba o dia correspondente
		da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
		aparecer valor inválido. */
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite um número que corresponderá a um dia da semana (1-7): ");
		byte num = scan.nextByte();
		
		switch(num) {
			
			case 1 -> System.out.println("Domingo");
			case 2 -> System.out.println("Segunda");
			case 3 -> System.out.println("Terça");
			case 4 -> System.out.println("Quarta");
			case 5 -> System.out.println("Quinta");
			case 6 -> System.out.println("Sexta");
			case 7 -> System.out.println("Sábado");
			default -> System.out.println("Valor inválido");
		}
	}
}
