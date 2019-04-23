package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);

		System.out.println("Qual valor da sua hora trabalhada? ");
		double htrabalhada = box.nextDouble();
		System.out.println("Quantas horas você trabalhou este mes?");
		int horasNoMes = box.nextInt();
		
		double salariobruto = htrabalhada * horasNoMes;
		
		System.out.println("Salário Bruto:" + "(" + htrabalhada + " * " + horasNoMes + ") " + "       : R$ " + salariobruto);
		
		int IR = 0;
		double descontoIR = 0;
		
		if (salariobruto <= 900) {
			
			System.out.println("(-) IR" + " (" + IR + "%)                       : R$ 0");
		} else
			if (salariobruto > 900 && salariobruto <= 1500) {
				IR = 5;
				descontoIR = (salariobruto * IR) / 100; 
				System.out.println("(-) IR" + " (" + IR + "%)                       : R$ " + descontoIR);
			} else
				if (salariobruto > 1500 && salariobruto <= 2500) {
					IR = 10;
					descontoIR = (salariobruto * IR) / 100; 
					System.out.println("(-) IR" + " (" + IR + "%)                       : R$ " + descontoIR);
				} else
					if (salariobruto > 2500) {
						IR = 20;
						descontoIR = (salariobruto * IR) / 100; 
						System.out.println("(-) IR" + " (" + IR + "%)                       : R$ " + descontoIR);
					}
		
		double descontoSindicato = salariobruto * 0.03;
		System.out.println("(-) Sindicato" + " (3" + "%)                : R$ " + descontoSindicato);
		
		double FGTS = salariobruto * 0.11;
		System.out.println("FGTS" + " (11" + "%)                        : R$ " + FGTS);
		
		double totalDescontos = descontoIR + descontoSindicato;
		System.out.println("Total de Descontos" + "                : R$ " + totalDescontos);
		
		double salarioLiquido = salariobruto - totalDescontos;
		System.out.println("Salário Liquido" + "                   : R$ " + salarioLiquido);
		
		
	}

}
