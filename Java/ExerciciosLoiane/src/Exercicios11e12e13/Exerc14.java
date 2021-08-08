package Exercicios11e12e13;

import java.util.Locale;
import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double mb, mbps, tempoMinutos;
		
		System.out.println("Qual o tamanho do seu arquivo (MB): ");
		mb = ler.nextDouble();
		System.out.println("Qual a velocidade da internet (Mbps): ");
		mbps = ler.nextDouble();
		
		tempoMinutos = (mb/mbps);
		
		System.out.printf("Tempo estimado para seu Douwload é de %.2f minutos!!", tempoMinutos);

	}

}
