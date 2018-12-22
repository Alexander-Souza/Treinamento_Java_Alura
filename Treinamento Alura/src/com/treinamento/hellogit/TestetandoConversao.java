package com.treinamento.hellogit;

public class TestetandoConversao {
	public static void main(String[] args) {
		double salario = 1250.7;
		int valor = (int) salario;
		System.out.println("O valor do salario é: "+valor);
		
		long numeroGrande = 1234567890l;
		float pontoFlutuante = 3.14f;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
	}
}
