package Exercicios16e17;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int nota = 0;
		boolean notaValida=false;
		
	
		
		do  {
			System.out.println("Digite uma nota de 0 a 10: ");
			nota = ler.nextInt();
			
			if (nota <= 10) {
				notaValida = true;
				System.out.println("Nota digitada: "+nota);	
			} else {
				System.out.println("Digite uma nota valida!!");
			}	
		} while (!notaValida); // ! = negando (nega��o de false nesse caso � true) ou notaValida == false;	
	}

}
