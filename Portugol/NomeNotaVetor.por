programa
{
	
	funcao inicio()
	{
		cadeia alunos [4]		// i = indice
		real notas [4]

		para (inteiro i=0;i<4;i++){
			escreva("Qual seu nome: ")
			leia(alunos[i])
			escreva("Qual a sua nota: ")
			leia(notas[i])			
		}	
		para (inteiro i=0;i<4;i++){
			escreva("Seu nome é: ",alunos[i], " e sua nota foi ",notas[i],"\n")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {alunos, 6, 9, 6}-{notas, 7, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */