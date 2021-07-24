programa
{
	
	funcao inicio()
	{
		real peso, carboidrato, proteina, gordura, calorias, cCarbo, cProt, cGord


		escreva ("Peso atual em kg: ")
		leia(peso)

		carboidrato = peso*6
		proteina = peso*2.2
		gordura = peso*0.9

		cCarbo = carboidrato*4
		cProt = proteina*4
		cGord = gordura*9

		calorias = cCarbo + cProt + cGord

		escreva ("\nTotal de carboidratos a ser consumida por dia é: ",carboidrato, " gramas e totalizando: ", cCarbo, " kcall")
		escreva ("\nTotal de proteina a ser consumida por dia é: ",proteina, " gramas e totalizando: ", cProt, " kcall")
		escreva ("\nTotal de gordura a ser consumida por dia é: ",gordura, " gramas e totalizando: ", cGord, " kcall")
		escreva ("\nTotal de calorias diarias a serem consumidas: ",calorias, " kcall")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 743; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */