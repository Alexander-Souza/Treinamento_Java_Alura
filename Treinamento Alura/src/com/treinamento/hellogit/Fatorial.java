package com.treinamento.hellogit;

public class Fatorial {
	public static void main(String[] args) {
		
		int fatorial = 1;
		for(int i=1; i<7; i++) {
			fatorial *= i;
			System.out.println("Fatorial de "+ i + " = "+fatorial);
		}
	}

}
