package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {
		
		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double TFahrenheit = box.nextDouble();
		
		double Celsius = ((TFahrenheit - 32) * 5) / 9;
		
		System.out.println("A temperatura convertida de Fahrenheit para Celsius é: " + Celsius + "ºC");

	}

}
