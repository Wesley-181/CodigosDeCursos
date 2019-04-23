package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana(1-7): ");
		int diaSemana = scan.nextInt();
		
		/* No if o resultado da condi��o sempre ser� um boolean(true ou false)
		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("Ter�a");
		}  else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		}  else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("S�bado");
		} else {
			System.out.println("N�o � um dia v�lido");
		}*/
		
		/* Switch-Case aceita como condi��o os tipos primitivos inteiros, Enum e
		 * a partir do Java7 aceita o "tipo" String */		
		/*
		switch (diaSemana){
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Ter�a");   break;
		case 4: System.out.println("Quarta");  break;	
		case 5: System.out.println("Quinta");  break;
		case 6: System.out.println("Sexta");   break;
		case 7: System.out.println("S�bado");  break;
		default: System.out.println("N�o � um dia v�lido");
		} */
		
		//Switch-Case deixa o c�digo mais elegante do que v�rios IFs aninhados
		switch (diaSemana){
		case 2: 
		case 3: 
		case 4: 	
		case 5: 
		case 6: System.out.println("Dia �til"); break;
		case 1:
		case 7: System.out.println("Fim de Semana");  break;
		default: System.out.println("N�o � um dia v�lido");
		}

	}

}
