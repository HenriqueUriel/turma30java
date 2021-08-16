package Exercicios14e15;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if (numero > 0) {
			System.out.printf("O numero %d é positivo",numero);
		} else if (numero < 0) {
			System.out.printf("O numero %d é negativo",numero);
		} else {
			System.out.printf("numero neutro %d", numero);
		}

	}

}
