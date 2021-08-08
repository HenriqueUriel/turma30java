package Exercicios11e12e13;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int metros, centimetros;
		
		System.out.print("Digite a quantidade em (Metros): ");
		metros = ler.nextInt();
		
		centimetros = metros*100;
		
		System.out.println("A quantidade de "+metros+"m convertida é "+centimetros+"cm");

	}

}
