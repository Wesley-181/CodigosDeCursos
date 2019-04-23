package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int num1 = box.nextInt();
		int num2 = box.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " é o maior entre os números digitados.");
		} else {
			System.out.println(num2 + " é o maior entre os números digitados.");
		}

	}

}
