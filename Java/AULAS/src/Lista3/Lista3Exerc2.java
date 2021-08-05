package Lista3;

import java.util.Scanner;

public class Lista3Exerc2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numeros=0;
		int contadoNumeroPar=0;
		int contadoNumeroImpar=0;
			
		for (int x=1; x<=10; x++) {
			System.out.print("Digite o número ("+(x)+"): ");
			numeros = ler.nextInt();
			if((numeros%2) == 0) {
				contadoNumeroPar++;
			} else if ((numeros%2) == 1) {
				contadoNumeroImpar++;
			} 
		}
			System.out.printf("São pares: %d e São impares: %d",contadoNumeroPar,contadoNumeroImpar);
	} 
}		
			
	
	


