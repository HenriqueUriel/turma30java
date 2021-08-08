package Exercicios11e12e13;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, dobroPrimerioMetadeSegundo;
		double num3, somaTriploPrimeiroTerceiro, terceiroElevadoCubo;	
		
		System.out.println("Digite um numero inteiro: ");
		num1 = ler.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		num2 = ler.nextInt();
		System.out.println("Digite um numero real: ");
		num3 = ler.nextInt();
		
		dobroPrimerioMetadeSegundo = (num1*2)*(num2/2);
		somaTriploPrimeiroTerceiro = (num1*3)+num3;
		terceiroElevadoCubo = Math.pow(num3,3);
		
		System.out.print("O dobro do primeiro("+num1+") com metade do segundo("+num2+") = "+dobroPrimerioMetadeSegundo+"\n");
		System.out.print("A soma do triplo do primeiro("+num1+") com o terceiro("+num3+") = "+somaTriploPrimeiroTerceiro+"\n");
		System.out.print("O terceiro("+num3+") ao cubo = "+terceiroElevadoCubo+"\n");
	}

}
