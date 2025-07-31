package vitor.cursojava.aula14;

import java.util.Scanner;
import java.util.Locale;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o valor do produto: ");
		double valor = scan.nextDouble();
		
		if(valor <= 5) {
			System.out.println("Está barato!");
		}
		else if(valor > 5 && valor <= 10) {
			System.out.println("Preço justo!");
		}
		else if(valor > 10 && valor <= 15) {
			System.out.println("Peça desconto!");
		}
		else {
			System.out.println("Está caro!");
		}

	}

}
