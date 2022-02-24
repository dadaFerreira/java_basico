package com.loiane.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exer04 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Entre com uma letra:");
			String letra = scan.next();
			/*
			if ( letra.equalsIgnoreCase("a")||  letra.equalsIgnoreCase("e") ||  letra.equalsIgnoreCase("i") ||  letra.equalsIgnoreCase("o") ||  letra.equalsIgnoreCase("0") ||  letra.equalsIgnoreCase("u")) {
				System.out.println("vogal");
			} else {
				System.out.println("consoante");
			} 
			*/
			// Segunda maneira de ser realizado, so poderá ser realizado essa maneira só java 7 ou superior//
			if ( letra.length() > 1) {
				System.out.println("Não é uma letra valida");
			}else {
			switch( letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("vogal"); break;
			default: System.out.println("consoante");
				
			}
	}

		}
}