package Lista2;
import java.util.Scanner;

public class Lista2exerc3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a sua idade(anos): ");
		idade = ler.nextInt();
		
		if (idade >=10 && idade <=14) {	
			System.out.println("Voc� � infantil!!");
		}else if (idade >=15 && idade <=17) {
			System.out.println("Voc� � juvenil!!");
		} else if (idade >=18 && idade <=25) {
			System.out.println("Voce � adulto!!");
		}else {
			System.out.println("idade inv�lida :x");
		}

	}

}
