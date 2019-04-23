package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		
		Scanner box = new Scanner(System.in);
		
		System.out.println("Selecione seu sexo (M-F): ");
		String sexo = box.nextLine();
		
		
		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Sexo inválido");
		}

	}

}
