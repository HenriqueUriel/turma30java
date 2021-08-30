import java.util.Locale;
import java.util.Scanner;

public class CalculoBasal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		double peso, altura, idade, sexo, basal1, basal2;
		
		System.out.print("Qual seu sexo:\n (1) Homem\t (2) Mulher\t\n");
		sexo = ler.nextDouble();
		
		if (sexo ==1){
			System.out.print("Peso (kg): ");
			peso = ler.nextDouble();
			System.out.print("Altura (cm): ");
			altura = ler.nextDouble();
			System.out.print("Idade (anos): ");
			idade = ler.nextDouble();

			basal1 = 66 + (13.8*peso) + (5*altura) - (6.8*idade);
			System.out.printf("Sua taxa metabolica basal(TMB) é %.2f ",basal1);
		} else if (sexo ==2) {
			System.out.print("Peso (kg): ");
			peso = ler.nextDouble();
			System.out.print("Altura (cm): ");
			altura = ler.nextDouble();
			System.out.print("Idade (anos): ");
			idade = ler.nextDouble();
			
			basal2 = 655 + (9.6*peso) + (1.8*altura) - (4.7*idade);
			System.out.printf("Sua taxa metabolica basal(TMB) é %.2f ",basal2);
		} else if (sexo >=3) {
			System.out.print("Opção invalida, escolha entre 1 e 2");
		} else if (sexo ==0) {
			System.out.print("Opção invalida, escolha entre 1 e 2");
		} else if (sexo <0) {
			System.out.print("Opção invalida, escolha entre 1 e 2");
		}
	}

}
