package vitor.cursojava.exercicios.aula13;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {

	public static void main(String[] args) {
		// 15.Faça um Programa que pergunte quanto você ganha por hora e o
		// número de horas trabalhadas no mês. Calcule e mostre o total do seu
		// salário no referido mês, sabendo-se que são descontados 11% para o
		// Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
		// programa que nos dê:
		// . salário bruto.
		// a. quanto pagou ao INSS.
		// b. quanto pagou ao sindicato.
		// c. o salário líquido.
		// d. calcule os descontos e o salário líquido, conforme a tabela
		// abaixo:
		// + Salário Bruto : R$ - IR (11%) : R$ - INSS
		// (8%) : R$ - Sindicato ( 5%) : R$ = Salário
		// Liquido : R$
		// Obs.: Salário Bruto - Descontos = Salário Líquido.
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Quanto você ganha por hora? ");
		double salarioPorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou no mês? ");
		double horasTrabalhadasMes = scan.nextDouble();
		
		double impostoRenda = ((salarioPorHora * horasTrabalhadasMes) * 0.11);
		double inss = ((salarioPorHora * horasTrabalhadasMes) * 0.08);
		double sindicato = ((salarioPorHora * horasTrabalhadasMes) * 0.05);
		double salarioFinal = ((salarioPorHora * horasTrabalhadasMes) - impostoRenda - inss - sindicato);
		
		System.out.println("Valor pago ao imposto de renda: R$" + impostoRenda);
		System.out.println("Valor pago ao INSS: R$" + inss);
		System.out.println("Valor pago ao sindicato: R$" + sindicato);
		System.out.println("O número de horas trabalhadas no mês é: R$" + salarioFinal);

	}

}
