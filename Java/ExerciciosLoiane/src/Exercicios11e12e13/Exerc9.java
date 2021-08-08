package Exercicios11e12e13;

import java.util.Scanner;

	public class Exerc9 {

		public static void main(String[] args) { 
			Scanner ler = new Scanner(System.in);  
			int temperaturaF; 
			int temperaturaC;
		
			System.out.println("Digite a temperatura em F: ");
			temperaturaF = ler.nextInt();
			
			temperaturaC = (5*(temperaturaF-32)/9);
		
			System.out.println("A temperatura em C: "+temperaturaC);
		}		
}
