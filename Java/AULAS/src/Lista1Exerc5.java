import java.util.Scanner;

public class Lista1Exerc5 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Digite sua terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = (nota1/2) + (nota2/3) + (nota3/5);
		
		System.out.println("Sua média foi de "+Math. round(media));
		
	}

}
