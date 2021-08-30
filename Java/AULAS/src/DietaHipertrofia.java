import java.util.Locale;
import java.util.Scanner;

public class DietaHipertrofia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double peso, carboidrato, proteina, gordura, calorias, cCarbo, cProt, cGord;
		
		System.out.print("Peso atual em kg: ");
		peso = ler.nextDouble();
	//////////Quantidade em gramas de cada macro/////////	
		carboidrato = peso*6;
		proteina = peso*2.2;
		gordura = peso*1;
	///////// Quantidade de calorias de cada macro///////	
		cCarbo = carboidrato*4;
		cProt = proteina*4;
		cGord = gordura*9;
	////////Total Calorias////////	
		calorias = cCarbo + cProt + cGord;

		System.out.printf("\nTotal de carboidratos a ser consumida por dia é: %.0f gramas e totalizando: %.0f kcall",carboidrato,cCarbo);
		System.out.printf("\nTotal de proteina a ser consumida por dia é: %.0f gramas e totalizando: %.0f kcall",proteina,cProt);
		System.out.printf("\nTotal de gordura a ser consumida por dia é: %.0f gramas e totalizando: %.0f kcall",gordura,cGord);
		System.out.printf("\nTotal de calorias diarias a serem consumidas: %.0f kcall",calorias);
	}

}
