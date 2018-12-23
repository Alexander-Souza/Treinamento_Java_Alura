package com.treinamento.hellogit;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Teste condicional");
		int idade = 17;
		int quantidade = 3;
		if(idade >= 18) {
			System.out.println("É maior de idade.");
			System.out.println("Seja bem vindo...");
		}else {
			if(quantidade >= 2) {
				System.out.println("Você não tem 18, mas pode entrar, porque esta acompanhado");
			}else {
				System.out.println("Infelismente você não pode entrar.");
			}
		}
	}

}
