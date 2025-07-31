package vitor.cursojava.exercicios.aula15;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Character;

public class Exercicio04 {

	public static void main(String[] args) {
		// 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite uma letra: ");
		char letra = Character.toLowerCase(scan.next().charAt(0));
		
		switch(letra) {
		case 'a' -> System.out.println("Você digitou uma vogal"); // Usar switch é melhor por legibilidade e manutenção,
		case 'e' -> System.out.println("Você digitou uma vogal"); // mas eu havia pensado em suar if primeiramente.
		case 'i' -> System.out.println("Você digitou uma vogal");
		case 'o' -> System.out.println("Você digitou uma vogal");
		case 'u' -> System.out.println("Você digitou uma vogal");
		default -> System.out.println("Você digitou uma consoante");
		}
		
		// if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
		//	 System.out.println("Você digitou uma vogal");
		// }
		// else {
		//	 System.out.println("Você digitou uma consoante");
		// }

	}

}
