package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero = box.nextDouble();
		
		if (numero > 0){
			System.out.println("O n�mero digitado � positivo.");
		} else if (numero < 0) {
			System.out.println("O n�mero digitado � negativo.");
		}

	}

}
