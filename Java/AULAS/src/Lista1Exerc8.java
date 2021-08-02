import java.util.Locale;
import java.util.Scanner;

public class Lista1Exerc8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double custoFinal, custoFabrica, taxaVenda, imposto, porcento, taxaGoverno;
		
		imposto = 0.45;
		porcento = 0.28;
		
		System.out.println("Custo de Fabrica do carro: ");
		custoFabrica = ler.nextDouble();
		
		taxaVenda = custoFabrica * 0.28;
		taxaGoverno = custoFabrica * 0.45;
		
		custoFinal = custoFabrica + taxaVenda + taxaGoverno;
		
		System.out.println("Imposto do Governo: R$"+ Math.round(taxaGoverno));
		System.out.println("Taxa de venda: R$"+ Math.round(taxaGoverno));
		System.out.println("O custo total do seu carro é: R$"+ Math.round(custoFinal));
		
		
		
		
	}
}
