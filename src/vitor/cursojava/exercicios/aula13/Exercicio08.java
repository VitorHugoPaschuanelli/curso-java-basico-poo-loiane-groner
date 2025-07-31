package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio08 {

	public static void main(String[] args) {
		// 8. Faça um Programa que pergunte quanto você ganha por hora e o
		// número de horas trabalhadas no mês. Calcule e mostre o total do seu
		// salário no referido mês.
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Quanto você recebe por hora? ");
		double salarioPorHora = scan.nextFloat();
		
		System.out.println("Quantas horas você trabalha no mês? ");
		double horasPorMes = scan.nextFloat();
		
		System.out.println("Seu salário mensal é: " + (salarioPorHora * horasPorMes));
		
	}

}
