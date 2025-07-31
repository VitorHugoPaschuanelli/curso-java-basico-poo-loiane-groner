package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {

	public static void main(String[] args) {
		// 2. Faça um Programa que peça um número e então mostre a
		// mensagem O número informado foi [número].
		
		Scanner scan = new Scanner(System.in);
		
		scan.useLocale(Locale.US);
		
		System.out.println("Digite um número: ");
		
		int num = scan.nextInt();
		
		System.out.println("O número digitado foi: " + num);

	}

}
