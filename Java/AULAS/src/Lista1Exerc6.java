import java.util.Scanner;

public class Lista1Exerc6 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, d, p1, p2;
		
		System.out.println("escreva o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.println("escreva o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.println("escreva o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.println("escreva o valor de y2: ");
		y2 = ler.nextDouble();
		
		p1 = Math.pow(x2-x1,2);
		p2 = Math.pow(y2-y1,2);
		d = Math.sqrt(p1+p2);
		
		System.out.println("A distância entre eles é: "+d);
		
	}

}
