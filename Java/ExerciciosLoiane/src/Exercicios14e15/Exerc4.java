package Exercicios14e15;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String x;
		
		System.out.print("Digite uma letra: ");
		x = ler.next();
		
		if (x.equalsIgnoreCase("a") || x.equalsIgnoreCase("e") || x.equalsIgnoreCase("i") || x.equalsIgnoreCase("o") || x.equalsIgnoreCase("u")) {
			System.out.printf("A letra (%s) é uma vogal",x);
		} else {
			System.out.printf("A letra (%s) é uma consoante",x);
		}

	}

}
