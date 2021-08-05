package Lista3;

import java.util.Scanner;

public class Lista3Exerc4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		char sexo; // (1-feminino/2-masculino/3-outros)
		char opcoes; // (1- pessoa calma/2- pessoa nervosa/3-pessoa agrressiva
		int contadorPessoas = 0;
		final int LIMITE_PESSOAS_ENTREVISTADAS = 150; //Final = Const
		char op = 'S'; // continuar sim ou nao
		int numeroPessoasCalmas = 0;
		int numeroMulheresNervosas = 0;
		int numeroHomensAgressivos = 0;
		int numeroOutrosCalmos = 0;
		int numeroPessoasNervosasMais40anos = 0;
		int numeroPessoasCalmasMenos18anos = 0;
		
		while(contadorPessoas < LIMITE_PESSOAS_ENTREVISTADAS && op=='S' ) { // op=='S' continuar em caso 'N' para
		
		System.out.print("Digite a idade: ");
		idade = ler.nextInt();
		System.out.print("Digite 1-Feminino / 2-Masculino/ 3-Outros: ");
		sexo = ler.next().charAt(0);
		System.out.print("Digite a opção 1-Pessoa Calma / 2-Pessoa Nervosa / 3-Pessoa Agrressiva: ");
		opcoes = ler.next().charAt(0);
		contadorPessoas ++; // contador++ = serve para trocar para o prox
		System.out.println("Continua S/N: ");
		op = ler.next().toUpperCase().charAt(0);
		
				if (opcoes == '1') {
					numeroPessoasCalmas++;
				}
				if (sexo =='1' && opcoes =='2') {
					numeroMulheresNervosas++;
				}
				if (sexo=='2' && opcoes == '3') {
					numeroHomensAgressivos++;
				}
				if (sexo == '3' && opcoes == '1') {
					numeroOutrosCalmos++;
				}
				if (opcoes == '2' && idade >40 ) {
					numeroPessoasNervosasMais40anos++;
				}
				if (opcoes == '1' && idade <18) {
					numeroPessoasCalmasMenos18anos++;
				}	
		}
		
			System.out.println("Pessoas calmas "+numeroPessoasCalmas);
			System.out.println("Mulheres nervosas "+numeroMulheresNervosas);
			System.out.println("Homens agressivos "+numeroHomensAgressivos);
			System.out.println("Outros calmos "+numeroOutrosCalmos);
			System.out.println("Pessoas nervosas acima de 40 anos "+numeroPessoasNervosasMais40anos);
			System.out.println("Pessoas calmas c/ menos de 18 anos "+numeroPessoasCalmasMenos18anos);
		
	}

}
