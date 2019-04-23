package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);	
		
		System.out.println("Digite três números: ");
		double num1 = box.nextDouble();
		double num2 = box.nextDouble();
		double num3 = box.nextDouble();
		
		if ((num1 < num2) & (num1 < num3) & (num2 < num3)) {
			System.out.println(num3 + " " + num2 + " " + num1);
		} 
		else if ((num1 < num2) & (num1 < num3) & (num3 < num2)) {
			System.out.println(num2 + " " + num3 + " " + num1);
		}
		else if ((num2 < num1) & (num2 < num3) & (num1 < num3)) {
			System.out.println(num3 + " " + num1 + " " + num2);
		} 
		else if ((num2 < num1) & (num2 < num3) & (num3 < num1)) {
			System.out.println(num1 + " " + num3 + " " + num2);
		}
		else if ((num3 < num1) & (num3 < num2) & (num1 < num2)) {
			System.out.println(num2 + " " + num1 + " " + num3);
		} 
		else if ((num3 < num1) & (num3 < num2) & (num2 < num1)) {
			System.out.println(num1 + " " + num2 + " " + num3);
		}
		

	}

}
