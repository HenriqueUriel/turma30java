programa
{
	
	funcao inicio()
	{
		cadeia alunos [4]		// i = indice
		real notas [4]

		para (inteiro i=0;i<4;i++){
			escreva("\nQual seu nome: ")
			leia(alunos[i])
			escreva("Qual a sua nota: ")
			leia(notas[i])			
		}	
		para (inteiro i=0;i<4;i++){
			escreva("Seu nome é: ",alunos[i], " e sua nota foi ",notas[i],"\n")
			se(notas[i]<=5){
				escreva("Estude mais, infelizmente você ficou com nota baixa\n")			
				} senao {
					escreva("Parabéns, você foi aprovado!!\n")
				}
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */