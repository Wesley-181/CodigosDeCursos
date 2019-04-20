package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = box.nextDouble();
		
		//area = lado * lado
		double areaQuadrado = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é: " + areaQuadrado);
		System.out.println("O dobro da area do quadrado é: " + (areaQuadrado * 2));
	}

}
