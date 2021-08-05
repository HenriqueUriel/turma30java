package Lista3;

import java.util.Scanner;

public class Lista3Exerc3 {
		
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade=0;
		int maiorIdade = 0;
		int menorIdade =0;
		char continuar = 'S';
		
		while(idade!=-99 && continuar == 'S') { //dentro do while a condicao que era, se digitar -99 para, adicionado um char para continuar S/N
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			if (idade<=21) {
				menorIdade++;
			}
			if (idade>=50) {
				maiorIdade++;
			}
			System.out.print("Deseja continuar [S/N] ? ");
			continuar = ler.next().toUpperCase().charAt(0);
		}
		
		System.out.printf("Pessoas com menos de 21 anos - %d !!\n",menorIdade);
		System.out.printf("Pessoas com mais de 50 anos - %d !!",maiorIdade);
		
	}

}
