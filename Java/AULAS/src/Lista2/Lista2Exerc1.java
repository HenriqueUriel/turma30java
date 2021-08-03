package Lista2;
import java.util.Scanner;

public class Lista2Exerc1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, maiorNumero;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextInt();
		
		maiorNumero = num1;
				
		if (maiorNumero > num2) {
			if (maiorNumero > num3) {
				
				System.out.printf("O maior numero é %d", num1);
			} else {
				System.out.printf("O maior numero é %d", num3);
			}
		}else {
			System.out.printf("O maior numero é %d", num2);
		}
		
		

	}

}
