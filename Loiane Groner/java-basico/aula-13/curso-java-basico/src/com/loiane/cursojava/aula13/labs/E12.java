package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite sua altura: "); //Peso Ideal
		double altura = box.nextDouble();
		
		double pesoideal = (72.7 * altura) - 58; //Fórmula arbitrada pelo exercício
		
		System.out.println("O peso ideal para uma pessoa de " + altura + "m é: " + pesoideal + "Kg");

	}

}
