package Exercicios11e12e13;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota1, nota2, nota3, nota4, media;
		
		System.out.print("Digite a nota do primeiro bimestre: ");
		nota1 = ler.nextInt();
		System.out.print("Digite a nota do segundo bimestre: ");
		nota2 = ler.nextInt();
		System.out.print("Digite a nota do terceiro bimestre: ");
		nota3 = ler.nextInt();
		System.out.print("Digite a nota do quarto bimestre: ");
		nota4 = ler.nextInt();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.print("Sua média final foi: "+media);
		
	}

}
