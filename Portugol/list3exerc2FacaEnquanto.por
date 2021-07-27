programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, totalNumeros = 0, contadorNumeros = 0

		escreva ("Digite um numero posito acima de 1: ")
		leia(numero)
		faca {
			contadorNumeros++ // = contadorNumeros = contadorNumeros+1
			totalNumeros = totalNumeros + contadorNumeros
			escreva(" + ", contadorNumeros)	
		} enquanto (contadorNumeros < numero)
		escreva (" = ", totalNumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */