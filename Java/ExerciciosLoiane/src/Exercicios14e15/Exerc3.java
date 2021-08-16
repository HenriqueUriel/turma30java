package Exercicios14e15;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char letraDigitada;
		
		System.out.println("Digite a letra de acordo com seu sexo ([F]-Feminino/[M]-Masculino): ");
		letraDigitada = ler.next().toUpperCase().charAt(0);
		
		if (letraDigitada == 'F') {
			System.out.println("FEMININO");
		} else if (letraDigitada == 'M') {
			System.out.println("MASCULINO");
		} else {
			System.out.println("Opção invalida!!!");
		}

	}

}
