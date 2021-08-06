import java.util.Scanner;

public class lista1Exerc4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, r, s;
		
		System.out.println("Escreva o valor de A:");
		a = ler.nextDouble();
		
		System.out.println("Escreva o valor de B:");
		b = ler.nextDouble();
		
		System.out.println("Escreva o valor de C:");
		c = ler.nextDouble();
		
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		d = (r+s)/2;
		
		System.out.println("O resultado foi, D= "+d);
	}

}
