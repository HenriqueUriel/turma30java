package Exercicios11e12e13;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int salarioHora =0, horasTrabalhadas=0, totalSalario=0;
		
		System.out.println("Digite o valor recebido por horas trabalhadas: ");
		salarioHora = ler.nextInt();
		System.out.println("Digite o total de horas trabalhadas: ");
		horasTrabalhadas = ler.nextInt();

		totalSalario = salarioHora*horasTrabalhadas;
		System.out.print("------------------------------------\n");
		System.out.printf("Seu salario este mês é de R$ %d",totalSalario);
	}

}
