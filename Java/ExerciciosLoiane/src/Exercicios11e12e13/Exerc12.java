package Exercicios11e12e13;

import java.util.Locale;
import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);		
		double altura, pesoIdeal;
		
		System.out.println("Digite a sua altura (1.70) = ");
		altura = ler.nextDouble();
		
		pesoIdeal = ((72.7*altura)-58);
		
		System.out.print("Seu peso ideal com base na sua altura é: "+pesoIdeal);
		
		

	}

}
