package Lista2;
import java.util.Locale;
import java.util.Scanner;

public class Lista2Exerc4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double x;
		
		System.out.println("Digite um numero: ");
		x = ler.nextDouble();
		
		if (x<0) {
			System.out.println("Impossivel realizar, numero negativo!!");
		}
		else if (x==0) {
			System.out.println("Zero � neutro!!");
		}
		else if ((x%2)==1) {		
			System.out.println("O numero digitado "+x+" � impar e o seu resultado "
					+ "elevado ao quadrado � "+ Math.pow(x,2));
		}
		else {
			System.out.println("O numero digitado "+x+" � par e sua raiz quadrade "
					+ "� "+ Math.sqrt(x));
		}
	}

}
