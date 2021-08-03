package Lista2;

import java.util.Scanner;

public class Lista2Exerc2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o primeiro numero: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = ler.nextInt();
		System.out.println("Digite o terceiro numero: ");
		c = ler.nextInt();
		
		System.out.printf("Valores digitados %d, %d e %d, em ordem crescente: \n", a, b, c);
		
		if (a <= b && a <= c) {
			System.out.println(a);
			if (b <= c) {
				System.out.println(b + "\n" + c);
			} else {
				System.out.println(c + "\n" + b);
			}
		}
		if (b <= a && b <= c) {
			System.out.println(b);
			if (a <= c) {
				System.out.println(a + "\n" + c);
			} else {
				System.out.println(c + "\n" + a);
			}
		}
		if (c <= b && c <= a) {
			System.out.println(c);
			if (b <= a) {
				System.out.println(b + "\n" + a);
			} else {
				System.out.println(a + "\n" + b);
			}
		
		}

	}
}
