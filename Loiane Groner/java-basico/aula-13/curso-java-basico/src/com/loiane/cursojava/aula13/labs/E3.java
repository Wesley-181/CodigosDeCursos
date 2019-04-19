package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {

		Scanner caixa = new Scanner(System.in);
		
		System.out.println("Digite um numero aperte enter e digite outro numero: ");
		double num1 = caixa.nextDouble();
		double num2 = caixa.nextDouble();
		double soma = num1 + num2;
		System.out.println("A soma dos numeros digitados é: " + soma);

	}

}
