package Lista3;

import java.util.Scanner;

public class Lista3Exerc6 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeroDigitado=0, contador=0;
		double media=0, soma=0;
		
		do {
			System.out.print("Digite um número: ");
			numeroDigitado = ler.nextInt();
			if (numeroDigitado!=0) {
				if (numeroDigitado % 3 == 0 ) {
					soma+=numeroDigitado;
					contador++;
				}
			}
			
		} while (numeroDigitado != 0);
			media = soma/contador; // soma = soma total dos numeros digitados e contador = total de vezes que foi digitado
			
			System.out.printf("A média dos números multiplos de 3 é %.0f",media);
			
	}

}
