package vitor.cursojava.exercicios.aula15;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Character;

public class Exercicio10 {

	public static void main(String[] args) {
		// 10.Faça um Programa que pergunte em que turno você estuda. Peça
		// para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
		// mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
		// Inválido!", conforme o caso.

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o turno que você estuda (M-matutino ou V-Vespertino ou N- Noturno): ");
		char turno = Character.toLowerCase(scan.next().charAt(0));
		
		switch(turno) {
			case 'm' -> System.out.println("Bom dia!");
			case 'v' -> System.out.println("Bom tarde!");
			case 'n' -> System.out.println("Bom noite!");
			default -> System.out.println("Valor inválido!");
		}
		
	}

}
