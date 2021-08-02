import java.util.Scanner;

public class Lista1Exerc3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int horas, minutos, segundos, seg;
		
		System.out.println("Qual a duração do evento em segundos?");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		seg = (segundos%3600)%3600;
		
		System.out.println("O evento durou "+horas+" horas "+minutos+" minutos e "+seg+" segundos!!");
	}

}
