package com.treinamento.hellogit;

import java.util.Scanner;

public class JogoDado {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char opcao = 's';
		
		while(opcao == 's') {
			System.out.println("Lançamento do DADO................");
			int dado = (int)(Math.random()*6+1);
			System.out.println("Face: "+dado);
			System.out.println("Deseja continuar a lançar o dado: [s/n]");
			opcao = input.next().charAt(0);
		}
	}

}
