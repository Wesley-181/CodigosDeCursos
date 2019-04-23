package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = box.nextDouble();
		
		if (numero > 0){
			System.out.println("O número digitado é positivo.");
		} else if (numero < 0) {
			System.out.println("O número digitado é negativo.");
		}

	}

}
