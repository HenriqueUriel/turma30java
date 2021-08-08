package Exercicios11e12e13;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int areaQuadrado =0, dobroArea=0, resultAreaQuadrado =0;
		
		System.out.print("Digite a medida de um dos lados do quadrado: ");
		areaQuadrado = ler.nextInt();
		
		resultAreaQuadrado = areaQuadrado*areaQuadrado;
		dobroArea = resultAreaQuadrado*2;
		
		
		System.out.print("Area do quadrado: "+resultAreaQuadrado+"\nDobro da medida é: "+dobroArea);
	}

}
