package vitor.cursojava.exercicios.aula15;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio11 {

	public static void main(String[] args) {
		// 11.As Organizações Tabajara resolveram dar um aumento de salário aos
		// seus colaboradores e lhe contraram para desenvolver o programa que
		// calculará os reajustes.
		// o Faça um programa que recebe o salário de um colaborador e o
		// reajuste segundo o seguinte critério, baseado no salário atual:
		// o salários até R$ 280,00 (incluindo) : aumento de 20%
		// o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		// o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		// o salários de R$ 1500,00 em diante : aumento de 5% Após o
		// aumento ser realizado, informe na tela:
		// o o salário antes do reajuste;
		// o o percentual de aumento aplicado;
		// o o valor do aumento;
		// o o novo salário, após o aumento.

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o salário do colaborador: ");
		double salario = scan.nextDouble();
		double salarioReajustado = 0;
		
		if(salario <= 280) {
			salarioReajustado = salario + (salario * 0.2);
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("Valor do reajuste: " + (salario * 0.20));
			System.out.println("Reajuste aplicado: 20%");
			System.out.println("Salário reajustado: " + salarioReajustado);
		}
		else if(salario > 280 && salario < 700) {
			salarioReajustado = salario + (salario * 0.15);
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("Valor do reajuste: " + salario * 0.15);
			System.out.println("Reajuste aplicado: 15%");
			System.out.println("Salário reajustado: " + salarioReajustado);
		}
		else if(salario > 700 && salario < 1500) {
			salarioReajustado = salario + (salario * 0.10);
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("Valor do reajuste: " + salario * 0.10);
			System.out.println("Reajuste aplicado: 10%");
			System.out.println("Salário reajustado: " + salarioReajustado);
		}
		else if(salario >= 1500) {
			salarioReajustado = salario + (salario * 0.05);
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("Valor do reajuste: " + salario * 0.05);
			System.out.println("Reajuste aplicado: 05%");
			System.out.println("Salário reajustado: " + salarioReajustado);
		}
	}
}
