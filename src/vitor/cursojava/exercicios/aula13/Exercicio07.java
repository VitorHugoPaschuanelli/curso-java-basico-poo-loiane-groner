package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio07 {

	public static void main(String[] args) {
		// 7. Faça um Programa que calcule a área de um quadrado, em seguida
		// mostre o dobro desta área para o usuário.
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite a altura do quadrado: ");
		double altura = scan.nextFloat();
		
		System.out.println("Digite o comprimento do quadrado: ");
		double comprimento = scan.nextFloat();

		System.out.println("O dobro da área do quadrado é: " + ((altura * comprimento) * 2));
	}

}
