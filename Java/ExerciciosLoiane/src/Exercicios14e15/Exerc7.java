package Exercicios14e15;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			int num1, num2, num3;
			
			System.out.print("Digite o primeiro numero: ");
			num1 = ler.nextInt();
			System.out.print("Digite o segundo numero: ");
			num2 = ler.nextInt();
			System.out.print("Digite o terceiro numero: ");
			num3 = ler.nextInt();

			if (num1 >= num2 && num1 >= num3) {
				System.out.printf("O primeiro numero digitado (%d) é o maior",num1);
			} else if (num2 >= num1 && num2 >= num3) {
				System.out.printf("O segundo numero digitado (%d) é o maior",num2);
			} else if (num3 >= num1 && num3 >= num2) {
				System.out.printf("O terceiro numero digitado (%d) é o maior",num3);
			}
			if (num1 <= num2 && num1 <= num3) {
				System.out.printf("O primeiro numero digitado (%d) é o menor",num1);
			} else if (num2 <= num1 && num2 <= num3) {
				System.out.printf("O segundo numero digitado (%d) é o menor",num2);
			} else if (num3 <= num1 && num3 <= num2) {
				System.out.printf("O terceiro numero digitado (%d) é o menor",num3);
			}	
	}
}