package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		
		Scanner box = new Scanner(System.in);

		System.out.println("Qual valor da sua hora trabalhada? ");
		double htrabalhada = box.nextDouble();
		System.out.println("Quantas horas voc� trabalhou este mes?");
		double horasNoMes = box.nextDouble();
		
		double salariobruto = htrabalhada * horasNoMes;
		
		System.out.println("Seu salario bruto � de: R$" + salariobruto);
		
		double IR = salariobruto * 0.11;
		double INSS = salariobruto * 0.08;
		double SINDICATO = salariobruto * 0.05;
		
		System.out.println("Sua contribui��o de Imposto de Renda � de: R$" + IR);
		System.out.println("Sua contribui��o de INSS � de: R$" + INSS);
		System.out.println("Sua contribui��o de sindicato � de: R$" + SINDICATO);
		
		double salarioliquido = salariobruto - IR - INSS - SINDICATO;
		double descontos = IR + INSS + SINDICATO;
		
		System.out.println("Os descontos no salario somam R$" + descontos + " e seu salario liquido � de R$" + salarioliquido);

	}

}
