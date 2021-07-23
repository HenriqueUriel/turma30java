programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real A,B,C,D,E,F,X,Y

 		escreva("\nValor de A: ")
		leia(A)
		
		escreva("\nValor de B: ")
		leia(B)
		
		escreva("\nValor de C: ")
		leia(C)
		
		escreva("\nValor de D: ")
		leia(D)
		
		escreva("\nValor de E: ")
		leia(E)
		
		escreva("\nValor para F: ")
		leia(F) 		

 		X = mat.arredondar((C*E - B*F)/(A*E - B*D), 2)
		Y = mat.arredondar((A*F - C*D)/(A*E - B*D), 2)

		escreva("\nO valor de X é ", X, "O valor de Y é ", Y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */