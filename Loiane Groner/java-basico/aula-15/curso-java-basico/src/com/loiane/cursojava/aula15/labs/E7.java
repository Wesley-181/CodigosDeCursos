package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);	
		
		System.out.println("Digite três números: ");
		double num1 = box.nextDouble();
		double num2 = box.nextDouble();
		double num3 = box.nextDouble();
		
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " foi o maior número digitado. ");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " foi o maior número digitado. ");
		} else {
			System.out.println(num3 + " foi o maior número digitado. "); 
		}
		
		System.out.println("e ");
		
		if ((num1 < num2) && (num1 < num3)) {
			System.out.println(num1 + " foi o menor número digitado. ");
		} else if ((num2 < num1) && (num2 < num3)) {
			System.out.println(num2 + " foi o menor número digitado. ");
		} else {
			System.out.println(num3 + " foi o menor número digitado. "); 
		}

	}

}
