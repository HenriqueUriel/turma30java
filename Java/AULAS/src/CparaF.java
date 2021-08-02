import java.util.Locale;
import java.util.Scanner; // importar scanner

public class CparaF {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //tag para locar padrão americano!
		Scanner leia = new Scanner(System.in); // "leia" vai ser usado para ler o teclado
		double temperaturaF; // double = real (00.00)
		double temperaturaC;
		
		System.out.println("Digite a temperatura em C: ");
		temperaturaC = leia.nextDouble(); // lendo o teclado
		
		temperaturaF = (temperaturaC*1.8) + 32;
		
		System.out.println("A temperatura em F é: "+temperaturaF);
		
	}
}
