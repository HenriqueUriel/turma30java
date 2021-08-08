package Exercicios11e12e13;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double ganhoHora, horaTrabalhada, totalSalario, salarioLiquido;
		double ir, inss, sindicato, totalDesconto;
		
		System.out.print("Digite o valor recebido por hora:");
		ganhoHora = ler.nextDouble();
		System.out.print("Digite o total de horas trabalhadas:");
		horaTrabalhada = ler.nextDouble();
		
		totalSalario = ganhoHora*horaTrabalhada;
		ir = (totalSalario/100)*11;
		inss = (totalSalario/100)*8;
		sindicato = (totalSalario/100)*5;		
		totalDesconto = ir+inss+sindicato;
		salarioLiquido = totalSalario-totalDesconto;
		
		System.out.print("Salario Bruto, R$ "+totalSalario+"\n");
		System.out.printf("Total de desconto, R$ %.2f\n",totalDesconto);
		System.out.print("Sendo:"+"\n");
		System.out.print("IR 11% = R$"+ir+"\n");
		System.out.print("INSS 8% = R$"+inss+"\n");
		System.out.print("Sindicato 5% = R$"+sindicato+"\n");
		System.out.print("Desta forma, seu salario liquido é R$ "+salarioLiquido);

	}

}
