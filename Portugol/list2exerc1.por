programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real peso, excesso, multa

		escreva("\nQual o peso (KG) do saco de tomate: ")
		leia (peso)


		se (peso >50) {
			
			excesso = peso-50
			multa = excesso *4
			
			escreva ("\nPeso total de ",peso, "Kg")
			escreva ("\nExcesso de peso ", excesso, " kg totalizando R$ ",mat.arredondar(multa,2), " a mais em cima do produto!")
		}
		senao {
			escreva ("\nPeso de ", peso, "Kg dentro do permitido!")
				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 96; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */