package vitor.cursojava.exercicios.aula15;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio09 {

	public static void main(String[] args) {
		// 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double num3 = scan.nextDouble();
		
		if(num1 == num2 && num1 == num3) {							//Todos iguais
			System.out.println(num1 + "\n" + num2 + "\n" + num3);
		}
		else if(num1 > num2 && num2 > num3) {						//1, 2, 3
			System.out.println(num1 + "\n" + num2 + "\n" + num3);
		}
		else if(num1 > num2 && num1 > num3 && num3 > num2) {		//1 ,3, 2
			System.out.println(num1 + "\n" + num3 + "\n" + num2);
		}
		else if(num2 > num1 && num1 > num3) {						//2, 1, 3
			System.out.println(num2 + "\n" + num1 + "\n" + num3);
		}
		else if(num2 > num1 && num2 > num3 && num3 > num1) {		//2, 3, 1
			System.out.println(num2 + "\n" + num3 + "\n" + num1);
		}
		else if(num3 > num1 && num1 > num2) {						//3, 1, 2
			System.out.println(num3 + "\n" + num1 + "\n" + num2);
		}
		else if(num3 > num2 && num2 > num1) {						//3, 2, 1
			System.out.println(num3 + "\n" + num2 + "\n" + num1);
		}
		else if(num1 == num2) {
			if(num2 > num3) {										//1 == 2; 1, 2, 3 (3 é o menor)
				System.out.println(num1 + "\n" + num2 + "\n" + num3);
			}
			else {													//1 == 2; 3, 1, 2 (2 é o menor)
				System.out.println(num3 + "\n" + num1 + "\n" + num2);
			}
		}
		else if(num1 == num3) {
			if(num2 > num1) {										//1 == 3; 2, 1, 3 (3 é o menor)
				System.out.println(num2 + "\n" + num1 + "\n" + num3);
			}
			else {													//1 == 3; 1, 3, 2 (2 é o menor)
				System.out.println(num1 + "\n" + num3 + "\n" + num2);
			}
		}
		else if(num2 == num3) {
			if(num2 > num1) {										//2 == 3; 2, 3, 1 (1 é o menor)
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
			}
			else {													//2 == 3; 1, 2, 3 (3 é o menor)
				System.out.println(num1 + "\n" + num2 + "\n" + num3);
			}
		}
		
	}

}
