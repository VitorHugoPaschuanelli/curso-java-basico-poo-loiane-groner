package vitor.cursojava.exercicios.aula15;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
		// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite qual sexo dejesa escolher (m ou f): ");
		//char letraSexo = Character.toUpperCase(scan.next().charAt(0));    // Para padronizar com letra maiúscula, mas acabei complicando e dessa maneira
																			// o exercício retorna "Sexo masculino" caso o usuário digite "mulher".
		String letraSexo = scan.next();
		
		if(letraSexo.equalsIgnoreCase("m")) {         // Para comparar Strings temos que usar o método equalsIgnoreCase, para fazer a comparação
			System.out.println("Sexo masculino");	  // independente da formatação do caracter.
		}
		else if(letraSexo.equalsIgnoreCase("f")) {
			System.out.println("Sexo feminino");
		}
		else {
			System.out.println("Sexo inválido");
		}
	}

}
