programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{

		real x1, x2, y1, y2, d, p1, p2
		
		escreva ("escreva o valor de x1: ")
		leia(x1)
		escreva ("escreva o valor de x2: ")
		leia(x2)
		escreva ("escreva o valor de y1: ")
		leia(y1)
		escreva ("escreva o valor de x2: ")
		leia(y2)

		p1 = Matematica.potencia((x2-x1), 2) // 2 igual a elevado, selecionar matematica em bibliotecas
		p2 = Matematica.potencia((y2-y1), 2)
		d = Matematica.raiz((p1+p2), 2)

		escreva ("A distância entre eles é: ",d)
	
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */