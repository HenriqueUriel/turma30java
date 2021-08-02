import java.util.Scanner;

public class Lista1Exerc1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int totalAno;
		int totalMes;
		int idade;
		int ano;
		int mes;
		int dia;
		
		System.out.println("Qual a sua idade(anos)?");
		ano = ler.nextInt(); // 1 variavel depois palavra decla. no scanner e o tipo da var 
		
		System.out.println("Qual a sua idade(meses)?");
		mes = ler.nextInt();
		
		System.out.println("Qual a sua idade(dias)?");
		dia = ler.nextInt();
		
		totalAno = ano*365;
		totalMes = mes*30;
		idade = totalAno+totalMes+dia;
		
		System.out.println("Sua idade em dias é "+ idade);
	}

}
