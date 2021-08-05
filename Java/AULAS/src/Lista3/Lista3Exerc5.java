package Lista3;

import java.util.Scanner;

public class Lista3Exerc5 {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numeroTeclado=0;
		int somaNumero=0;
		
		do {
			System.out.print("Digite o número(Num 0 para finalizar): ");
			numeroTeclado = ler.nextInt();
			somaNumero+=numeroTeclado; // somaNumero = somaNumero+numeroTeclado
				
		} while (numeroTeclado != 0); 
			System.out.printf("\nSoma dos números digitados %d",somaNumero);	

	}

}
