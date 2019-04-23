package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		
		Scanner box = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda?");
		System.out.println("Digite:\nM para Matutino,\nV para Vespertino,\nN para Noturno.");
		String turno = box.nextLine();
		
		switch (turno) {
		case "m": System.out.println("Bom Dia!"); break;
		case "M": System.out.println("Bom Dia!"); break;
		case "v": System.out.println("Boa Tarde!"); break;
		case "V": System.out.println("Boa Tarde!"); break;
		case "n": System.out.println("Boa Noite!"); break;
		case "N": System.out.println("Boa Noite!"); break;
		default: System.out.println("Valor Inválido!");
		}
		
		

	}

}
