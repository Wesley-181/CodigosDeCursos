package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		 
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeironome = "Esta é ";
		String segundonome = "uma String concatenada. ";
		String terceironome = primeironome + segundonome;
		System.out.println(terceironome);
		
		resultado = resultado + 1; // Esta linha representa...
		System.out.println(resultado);
		
		resultado++;			  //essa mesma operação.
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++); //Esta linha *imprime* depois adiciona 
		System.out.println(++resultado); //Esta linha *adiciona* depois imprime
		
		System.out.println(resultado--); //Esta linha *imprime* depois subtrai 
		System.out.println(--resultado); //Esta linha *subtrai* depois imprime
		
		
	}

}
