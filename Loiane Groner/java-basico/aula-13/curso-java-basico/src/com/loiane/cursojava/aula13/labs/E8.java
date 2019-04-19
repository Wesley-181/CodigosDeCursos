package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Qual valor da sua hora trabalhada? ");
		double htrabalhada = box.nextDouble();
		System.out.println("Quantas horas você trabalhou este mes?");
		double horasNoMes = box.nextDouble();
		
		double salario = htrabalhada * horasNoMes;
		
		System.out.println("Seu salario e de: " + salario);
		
	}

}
