package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		
		//Cria o objeto "scan" 
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite seu nome completo: ");
		
		//Armazena dentro de "nomeCompleto" o que foi digitado na "linha"
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		//////////////////////////////////////////////////////////////
		
		System.out.println("Digite seu primeiro nome");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
	
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e sem tem PET: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("A quantidade de filhos é: " + qtdFilhos);
		System.out.println("A sua altura é: " + altura);
		System.out.println("Tem PET? " + temPet);

	}

}
