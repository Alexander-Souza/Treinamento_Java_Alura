package com.treinamento.hellogit;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Teste condicional");
		int idade = 20;
		int quantidade = 3;
		boolean acompanhado = quantidade >= 2;
		if(idade >= 18 && acompanhado){
			System.out.println("Seja bem vindo...");
		}else {
			System.out.println("Infelismente você não pode entrar.");
		}
	}

}
