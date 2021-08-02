import java.util.Scanner;

public class Lista1Exerc2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int ano, mes, dia, dias;
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		ano = dias/365;
		mes = (dias%365)/30;
		dia = (dias%365)%30;
		
		System.out.println("Você tem "+ano+" anos "+ mes+" meses e "+dia+" dias!!");
		
	}

}
