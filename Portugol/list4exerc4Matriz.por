programa
{
	
	funcao inicio()
	{
		const inteiro L = 3
		const inteiro C = 3
		inteiro matrizUsuario[L][C], soma = 0, diagonalPrincipal=0
		
		para(inteiro linha =0; linha<L;linha++){
			para(inteiro coluna=0;coluna<C;coluna++){
				escreva("DIGITE O VALOR: \n")
				leia(matrizUsuario[linha][coluna])
				soma = soma + matrizUsuario[linha][coluna]
				se(linha==coluna){
					diagonalPrincipal = diagonalPrincipal + matrizUsuario[linha][coluna]
				}
			}
		}
			escreva("\n")
		para(inteiro linha =0;linha<L;linha++){
			para(inteiro coluna=0;coluna<C;coluna++){	
				escreva(matrizUsuario[linha][coluna], " ")
				}
				escreva("\n")
		}
		escreva("\n")
		escreva("SOMA DA MATRIZ:", soma, "\n")
		escreva("SOMA DA DIAGONAL PRINCIPAL: ", diagonalPrincipal, "\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizUsuario, 8, 10, 13};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */