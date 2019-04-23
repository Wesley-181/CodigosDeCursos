package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite duas notas: ");
		double nota1 = box.nextDouble();
		double nota2 = box.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		
		if (media == 10){
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7){
			System.out.println("Aprovado");
		} else if (media < 7){
			System.out.println("Reprovado");
		}
		

	}

}
