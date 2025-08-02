package vitor.cursojava.exercicios.aula15;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio14 {

	public static void main(String[] args) {
		/* 14.Faça um programa que lê as duas notas parciais obtidas por um aluno
		numa disciplina ao longo de um semestre, e calcule a sua média. A
		atribuição de conceitos obedece à tabela abaixo:
		o Média de Aproveitamento Conceito
		o Entre 9.0 e 10.0 A
		o Entre 7.5 e 9.0 B
		o Entre 6.0 e 7.5 C
		o Entre 4.0 e 6.0 D
		o Entre 4.0 e zero E */
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		char conceito = ' ';
		
		if(media >= 0 && media <= 10) {
			if(media >= 9 || media == 10) {
				conceito = 'A';
			}
			else if(media < 9 && media >= 7.5) {
				conceito = 'B';
			}
			else if(media < 7.5 && media >= 6) {
				conceito = 'C';
			}
			else if(media < 6 && media >= 4) {
				conceito = 'D';
			}
			else if(media < 4 && media >= 0) {
				conceito = 'E';
			}
			System.out.println("A média do(a) aluno(a) é: " + media);
			System.out.println("O conceito do(a) aluno(a) é: " + conceito);
		} 
		else {
			System.out.println("Média não está entre 0 e 10.");
		}
	}
}
	
