package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);	
		
		System.out.println("Digite três números: ");
		double preco1 = box.nextDouble();
		double preco2 = box.nextDouble();
		double preco3 = box.nextDouble();
		
		if ((preco1 < preco2) && (preco1 < preco3)) {
			System.out.println("Você deve comprar o produto que tem o preço de " + preco1 + " ,pois, ele é o mais barato. ");
		} else if ((preco2 < preco1) && (preco2 < preco3)) {
			System.out.println("Você deve comprar o produto que tem o preço de " + preco2 + " ,pois, ele é o mais barato. ");
		} else {
			System.out.println("Você deve comprar o produto que tem o preço de " + preco3 + " ,pois, ele é o mais barato. ");
		}
	}

}
