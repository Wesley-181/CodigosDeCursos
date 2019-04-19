package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo que será baixado em MB? ");
		double arquivo = box.nextDouble();
		System.out.println("Qual a velocidade da internet em Mbps?");
		double linkmbps = box.nextDouble();
		
		double linkMBps = linkmbps / 8; //Conversão da velocidade do link de Mb/s para MB/s
		
		double tempoestimado = arquivo / linkMBps;
		
		System.out.println("Seu arquivo será baixado em aproximadamente " + tempoestimado + " segundos.");

	}

}
