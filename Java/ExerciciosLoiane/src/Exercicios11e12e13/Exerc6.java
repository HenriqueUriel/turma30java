package Exercicios11e12e13;

import java.util.Scanner;

public class Exerc6 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double raioCirculo, areaCirculo;
		double pi = 3.14;
		
		System.out.print("Digite o raio do circulo: ");
		raioCirculo = ler.nextDouble();
		
		areaCirculo = pi*Math.pow(raioCirculo,2);
		
		System.out.println("A area do circulo é: "+areaCirculo+" m²");
	}

}
