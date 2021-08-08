package Exercicios11e12e13;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, soma;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		soma = num1+num2;
		
		System.out.print("A soma dos numeros digitador foi: "+soma);
		
	}

}
