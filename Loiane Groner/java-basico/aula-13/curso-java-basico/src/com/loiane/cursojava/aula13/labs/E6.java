package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {
		
		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio da circunferencia: ");
		double raio = box.nextDouble();
		
		double areaCircunferencia = 3.14 * (raio * raio);
		
		System.out.println("A area do circulo �: " + areaCircunferencia);

	}

}
