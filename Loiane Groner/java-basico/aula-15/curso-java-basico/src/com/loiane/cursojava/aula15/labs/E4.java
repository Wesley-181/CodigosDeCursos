package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = box.nextLine();

		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E")
				|| letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O")
				|| letra.equalsIgnoreCase("U")) {
			
			System.out.println("Você digitou uma vogal.");

		} else {
			
			System.out.println("Você digitou uma consoante.");
			
		}

	}

}
