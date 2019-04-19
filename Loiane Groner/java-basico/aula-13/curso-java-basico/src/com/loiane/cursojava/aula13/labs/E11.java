package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros: ");
		int numinteiro1 = box.nextInt();
		int numinteiro2 = box.nextInt();
		System.out.println("Digite um numero real: ");
		double numreal = box.nextDouble();
		
		//O produto do dobro do primeiro com metade do segundo
		double dobroPrimeiro = numinteiro1 * 2;
		double metadeSegundo = (double)numinteiro2 / 2; //Foi necessário fazer Casting, senão o resultado é 1.0
		double produto = dobroPrimeiro * metadeSegundo;
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + produto);

		//A soma do triplo do primeiro com o terceiro
		double triploprimeiro = numinteiro1 * 3;
		double soma = triploprimeiro + numreal;
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
		
		//O terceiro elevado ao cubo
		double terceirocubo = numreal * numreal * numreal;
		System.out.println("O terceiro numero elevado ao cubo é: " + terceirocubo);
	}

}
