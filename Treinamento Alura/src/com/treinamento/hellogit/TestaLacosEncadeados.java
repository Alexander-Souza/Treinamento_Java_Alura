package com.treinamento.hellogit;

public class TestaLacosEncadeados {
	public static void main(String[] args) {
		for(int multiplicador=0;multiplicador <= 10;multiplicador++) {
			for(int contador=0;contador <= 10;contador++) {
				System.out.print(multiplicador+" x "+contador+" = "+(multiplicador * contador)+" |");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
