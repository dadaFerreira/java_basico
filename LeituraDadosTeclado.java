package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo ?:" + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome ?:" + primeiroNome);
		
		// obs: ? usado /* para negativar o c?digo, e n?o precia apagar.
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade ?:" + idade);
		
		System.out.println("Digite a sua autura:");
		double altura = scan.nextDouble();
		System.out.println("Sua Altura ?:" + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem pet");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc? digitou os seguintes valore");
		System.out.println("Primeiro nome" + primeiroNome);
		System.out.println("Idade"+ idade);
		System.out.println("Quantidade de filhos:" + qtdFilhos);
		System.out.println("Altura" + altura);
		System.out.println("Tem bichinho de estima??o?" + temPet);
	}

}
