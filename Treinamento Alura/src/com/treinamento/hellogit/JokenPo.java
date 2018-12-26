package com.treinamento.hellogit;

import java.util.Scanner;

//Jogo Pedra, Papel e Tesoura - JokemPo
public class JokenPo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//lógica do jogador
		int jogador;
		
		System.out.println("_____JokenPo_____");
		System.out.println("_________________");
		System.out.println(" 1 - Pedra ");
		System.out.println(" 2 - Papel ");
		System.out.println(" 3 - Tesoura ");
		System.out.println("Digite a opção desejada: ");
		jogador = input.nextInt();
		
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida, tente novamente...");
			break;
		}
		
		//lógica do computador
		int computador = (int)(Math.random()*3+1);
		
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		
		}
		
		if (jogador != computador) {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
				System.out.println("Jogador VENCEU!!!!");
			} else {
				System.out.println("Computador VENCEU!!!");
			}
		} else {
			System.out.println("EMPATE");
		}
		
	}

}
