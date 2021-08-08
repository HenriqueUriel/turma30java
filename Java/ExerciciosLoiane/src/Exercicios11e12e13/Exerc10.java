package Exercicios11e12e13;

import java.util.Locale;
import java.util.Scanner;

	public class Exerc10 {
		
		public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner leia = new Scanner(System.in); 
		double temperaturaF; 
		double temperaturaC;
	
		System.out.println("Digite a temperatura em C: ");
		temperaturaC = leia.nextDouble(); 
	
		temperaturaF = ((temperaturaC*1.8)+32);
	
		System.out.printf("A temperatura em F é %.2f ",temperaturaF);
	
		}
	}	
