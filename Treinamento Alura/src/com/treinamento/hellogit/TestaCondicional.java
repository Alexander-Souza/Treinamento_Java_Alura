package com.treinamento.hellogit;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Teste condicional");
		int idade = 17;
		int quantidade = 3;
		if(idade >= 18) {
			System.out.println("� maior de idade.");
			System.out.println("Seja bem vindo...");
		}else {
			if(quantidade >= 2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar, porque esta acompanhado");
			}else {
				System.out.println("Infelismente voc� n�o pode entrar.");
			}
		}
	}

}
