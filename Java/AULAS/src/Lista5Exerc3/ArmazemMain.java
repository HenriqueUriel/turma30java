package Lista5Exerc3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmazemMain {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<String> cadastro = new ArrayList<>();
		
		int x=0;
		String auxNome;
		
		
		cadastro.add("CAMISETA");
		cadastro.add("BLUSA");
		cadastro.add("SHORTS");
		cadastro.add("CALÇA");
		cadastro.add("BONE");
		
		System.out.println("Tamanho da lista :"+cadastro.size());
		//adicionando fora da lista, adc na posição 1
		cadastro.add(1,"Jaqueta");
			
		for (String armazem : cadastro) {
			System.out.println(x+" - "+armazem);
			x++;
		}
		
		System.out.println("Digite o nome do item que deseja apagar :");
		auxNome = leia.next().toUpperCase();
		x = cadastro.indexOf(auxNome);
		System.out.println("Vc escolheu o item "+cadastro.get(x)+", este item será retirado do estoque!!!");
		cadastro.remove(x);// remove para retirar da lista
		
		System.out.println("Novo Estoque\n");
	
		for (String armazem : cadastro) {
			System.out.println(cadastro.indexOf(armazem)+" - "+armazem);
		}
		
		

	}
}
