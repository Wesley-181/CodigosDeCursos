package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in); 
		
		System.out.println("Digite a temperatura em Celsius: ");
		double TCelsius = box.nextDouble();
		
		double Fahrenheit = ((TCelsius * 9) / 5) + 32;
		
		System.out.println("A temperatura convertida de Celsius para Fahrenheit é: " + Fahrenheit + "ºF");

	}

}
