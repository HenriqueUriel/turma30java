package Exercicios14e15;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		if (num1 > num2) {
			System.out.printf("O primeiro numero digitado foi %d e é maior que o segundo %d",num1, num2);
		} else {
			System.out.printf("O segundo numero digitado %d é maior que o primeiro numero digitado %d",num2, num1);
		}
		
		

	}

}
