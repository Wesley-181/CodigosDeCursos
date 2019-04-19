package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = box.nextDouble();
		
		double areaQuadrado = lado * lado;
		//System.out.println("A area do quadrado é: " + areaQuadrado);
		
		double dobroArea = areaQuadrado * 2;
		System.out.println("O dobro da area do quadrado é: " + dobroArea);
	}

}
