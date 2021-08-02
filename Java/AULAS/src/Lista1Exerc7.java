import java.util.Scanner;

public class Lista1Exerc7 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Valor de A: ");
		a = ler.nextDouble();
		System.out.println("Valor de B: ");
		b = ler.nextDouble();
		System.out.println("Valor de C: ");
		c = ler.nextDouble();
		System.out.println("Valor de D: ");
		d = ler.nextDouble();
		System.out.println("Valor de E: ");
		e = ler.nextDouble();
		System.out.println("Valor de F: ");
		f = ler.nextDouble();
		
		x = Math.round((c*e - b*f)/(a*e - b*d));
		y = Math.round((a*f - c*d)/(a*e - b*d));
		
		System.out.println("O valor de X é "+x+" O valor de Y é "+y);
	}

}
