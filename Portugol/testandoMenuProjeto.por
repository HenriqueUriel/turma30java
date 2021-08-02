programa
{
	
	funcao inicio()
	{
		inteiro menu, estoque =0, quantidade = 10, valor = 0.00
	
		faca {
			escreva ("1 - Glutamina","\t\t", "2 - Vitamina C\n")
			escreva ("3 - Regata Cav","\t\t", "4 - Tenis Sports\n")
			escreva ("5 - Whey Prot","\t\t", "6 - Snack Div\n")
			escreva ("7 - C. Legging","\t\t", "8 - Camiseta\n")
			escreva ("9 - BCAA CAPS","\t\t", "10 - Corda P.\n")
			escreva ("11 - Pagar\n")
			escreva ("Escolha seu produto COD G3- ")
			leia (menu)
			escreva ("Qtd. - ")
			leia (quantidade)

			estoque = estoque - quantidade
				se (menu < 10)
				{
				 escreva ("Produto selecionado\n")
				} 
			senao
				{
					escreva ("Area de Pagamento\n" )
				}
			} enquanto (menu!=0)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 95; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */