package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio do colaborador: R$");
		double salario = box.nextDouble();
		
		double salarioReajustado = 0;
		int percentualAumento = 0;
		double valorAumento = 0;
		
		if (salario <= 280) {
			salarioReajustado = salario + (salario * 0.20) ;
			percentualAumento = 20 ;
		} else 
		if (salario > 280 && salario <= 700) {
				salarioReajustado = salario + (salario * 0.15) ;
				percentualAumento = 15;
		} else 
		if (salario > 700 && salario <= 1500) {
				salarioReajustado = salario + (salario * 0.10) ;
				percentualAumento = 10;
		} else 
		if (salario > 1500) {
				salarioReajustado = salario + (salario * 0.05) ;
				percentualAumento = 5;
		}

		valorAumento = salarioReajustado - salario;
		
		System.out.println("O sal�rio atual � R$" + salario);
		System.out.println("O percentual de aumento ser� de " + percentualAumento + "%");
		System.out.println("O valor do aumento ser� de R$" + valorAumento);
		System.out.println("O sal�rio ap�s o reajuste ser� R$" + salarioReajustado);
		
		
	}

}
