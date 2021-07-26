programa
{
	
	funcao inicio()
	{
		cadeia nome
		caracter opcao

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite a opção A/O/E: ")
		leia(opcao)

		se (opcao == 'A' ou opcao == 'a'){
			escreva ("Boa tarde Sra. ", nome)
		}
		senao se (opcao == 'E' ou opcao == 'e'){
			escreva ("Boa tarde Sre. ", nome)
		}
		senao se (opcao == 'O' ou opcao == 'o'){
			escreva ("Boa tarde Sr. ", nome)
		}
		senao {
			escreva ("Escolha uma opção valida!!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */