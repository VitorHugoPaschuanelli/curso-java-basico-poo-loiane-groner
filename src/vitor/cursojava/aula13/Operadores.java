package vitor.cursojava.aula13;

public class Operadores {

	public static void main(String[] args) {
		// Apenas aquilo que achei interessante
		
		//É possível concatenar strings com soma
		
		String primeira = "Eu sou";
		String segunda = " o Vitor";
		
		String terceira = primeira + segunda;
		
		System.out.println(terceira);
		
		//Operador XOR só retorna true se ambos forem diferentes
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x ^ y); //true
		
		y = true;
		
		System.out.println(x ^ y); //false

	}

}
