programa
{
	
	funcao inicio()
	{

		real custoFinal, custoFabrica, taxaVenda, imposto, porcento, taxaGoverno

		imposto = 0.45
		porcento = 0.28

		escreva ("Custo de Fabrica do carro: ")
		leia(custoFabrica)

		taxaVenda = custoFabrica * 0.28
		taxaGoverno = custoFabrica * 0.45

		custoFinal = custoFabrica + taxaVenda + taxaGoverno

		escreva ("\nImposto do Governo: ", taxaGoverno)
		escreva ("\nTaxa da venda: ", taxaVenda)
		escreva ("\nO custo total do seu carro é: ", custoFinal)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */