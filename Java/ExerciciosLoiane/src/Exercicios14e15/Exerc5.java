package Exercicios14e15;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int nota1, nota2, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextInt();
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextInt();
		
		media = (nota1+nota2)/2;
		System.out.printf("Sua m�dia foi de (%d) ",media);
		
		if (media >= 7) {
			System.out.println("Aprovado!!");
		} else if (media == 10) {
			System.out.println("Aprovado com Distin��o!!");
		} else {
			System.out.println("Reprovado!!");
		}		
	}

}
