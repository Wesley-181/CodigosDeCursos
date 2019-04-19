package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite a nota de cada bimestre e pressione enter: ");
		double nota1 = box.nextDouble();
		double nota2 = box.nextDouble();
		double nota3 = box.nextDouble();
		double nota4 = box.nextDouble();
		
		double media = ((nota1 + nota2 + nota3 + nota4) / 4) ;
		
		System.out.println("A media das notas digitadas é: " + media);
	}

}
