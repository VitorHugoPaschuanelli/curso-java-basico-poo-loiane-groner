package vitor.cursojava.exercicios.aula15;

import java.util.Scanner; 
import java.util.Locale;

public class Exercicio12 {

	public static void main(String[] args) {
		/* 12.Faça um programa para o cálculo de uma folha de pagamento,
		sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
		FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
		a empresa que deposita). O Salário Líquido corresponde ao Salário
		Bruto menos os descontos. O programa deverá pedir ao usuário o
		valor da sua hora e a quantidade de horas trabalhadas no mês.
		o Desconto do IR:
		o Salário Bruto até 900 (inclusive) - isento
		o Salário Bruto até 1500 (inclusive) - desconto de 5%
		o Salário Bruto até 2500 (inclusive) - desconto de 10%
		o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
		as informações, dispostas conforme o exemplo abaixo. 
		No exemplo o valor da hora é 5 e a quantidade de hora é 220.
		Salário Bruto: (5 * 220) : R$ 1100,00
		(-) IR (5%) : R$ 55,00
		(-) INSS ( 10%) : R$ 110,00
		FGTS (11%) : R$ 121,00
		Total de descontos : R$ 165,00
		Salário Liquido : R$ 935,00 */ 
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o salário recebido por hora: ");
		double salarioPorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		double horasTrabalhadasMes = scan.nextDouble();
		
		final double salarioBruto = salarioPorHora * horasTrabalhadasMes;
		final double fgts = salarioBruto * 0.11;;
		final double inss = salarioBruto * 0.10;
		final double taxaSindicato = salarioBruto * 0.03;
		double impostoRenda = 0;
		double salarioLiquido = 0;
		double descontos = 0;
		
		if(salarioBruto <= 1500) {
			impostoRenda = salarioBruto * 0.05;
		}
		else if(salarioBruto <= 2500) {
			impostoRenda = salarioBruto * 0.10;
		}
		else if(salarioBruto > 2500) {
			impostoRenda = salarioBruto * 0.20;
			
		}
		
		descontos = (taxaSindicato + inss + impostoRenda);
		salarioLiquido = salarioBruto - descontos;

		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("Imposto de renda: " + (impostoRenda * salarioBruto));
		System.out.println("INSS: " + inss);
		System.out.println("FGTS: " + fgts);
		System.out.println("Total de descontos: " + descontos);
		System.out.println("Salário líquido: " + salarioLiquido);
		
		//No exemplo não foi aplicada a taxa do sindicato, corrigi este problema na minha resolução.
	}

}
