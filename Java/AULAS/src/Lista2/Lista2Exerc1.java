package Lista2;
import java.util.Scanner;

public class Lista2Exerc1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, maiorNumero;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		maiorNumero = num1;
				
		if (maiorNumero > num2) {
			if (maiorNumero > num3) {
				
				System.out.printf("O maior numero � %d", num1);
			} else {
				System.out.printf("O maior numero � %d", num3);
			}
		}else {
			System.out.printf("O maior numero � %d", num2);
		}
		
		

	}

}
