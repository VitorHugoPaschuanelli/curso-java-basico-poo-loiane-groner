package vitor.cursojava.aula12;

import java.util.Scanner;
import java.util.Locale;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		scan.useLocale(Locale.US);
		
		/*System.out.println("Digite seu nome completo: ");
		
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		
		String primeiroNome = scan.next();
		
		System.out.println("Seu primeiro nome é: " + primeiroNome);*/
		
		System.out.println("Digite sua idade: ");
		
		int idade = scan.nextInt();
		
		System.out.println("Digite sua altura: ");
		
		double altura = scan.nextDouble();
		
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Sua altura é: " + altura);
	}

}
