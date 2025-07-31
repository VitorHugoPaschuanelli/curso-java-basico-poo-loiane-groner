package vitor.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite um dia da semana(1-7): ");
		int dia = scan.nextInt();
		
		switch(dia) {
		case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda");
		case 3 -> System.out.println("Terça");
		case 4 -> System.out.println("Quarta");
		case 5 -> System.out.println("Quinta");
		case 6 -> System.out.println("Sexta");
		default -> System.out.println("Dia inválido");
		};
		
		//Um pouco diferente do que a Loiane fez, devido atualizações do Java.
	}

}
