package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite o comprimento em metros: ");
		double valorMetros = box.nextDouble();
		
		double valorCm = valorMetros * 100;
		
		System.out.println("A conversao de Metros para Centimetros é: " + valorCm);

	}

}
