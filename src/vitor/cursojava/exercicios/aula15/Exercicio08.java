package vitor.cursojava.exercicios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// 8. Faça um programa que pergunte o preço de três produtos e informe
		// qual produto você deve comprar, sabendo que a decisão é sempre
		// pelo mais barato.
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o preço do primeiro produto: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Digite o preço do segundo produto: ");
		double produto2 = scan.nextDouble();
		
		System.out.println("Digite o preço do terceiro produto: ");
		double produto3 = scan.nextDouble();
		
		if(produto1 < produto2 && produto1 < produto3) {
			System.out.println("O primeiro produto é o mais barato: " + produto1);
		}
		else if(produto2 < produto1 && produto2 < produto3) {
			System.out.println("O segundo produto é o mais barato: " + produto2);
		}
		else if(produto3 < produto1 && produto3 < produto2) {
			System.out.println("O terceiro produto é o mais barato: " + produto3);
		}
		else if(produto1 == produto2 && produto2 == produto3) {
			System.out.println("todos os produtos têm o mesmo valor: " + produto1);
		}
		else if(produto1 == produto2) {
			System.out.println("O primeiro e o segundo produto têm o mesmo valor: " + produto1);
		}
		else if(produto1 == produto3) {
			System.out.println("O primeiro e o terceiro produto têm o mesmo valor: " + produto1);
		}
		else if(produto2 == produto3) {
			System.out.println("O segundo e o terceiro produto têm o mesmo valor: " + produto2);
		}
		
	}

}
