programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro contador=10 // inicio

		enquanto (contador>0) //enquanto vdd fica em execução
		{
			limpa()
			escreva("Contagem regressiva....", contador)
			contador = contador -1
			Util.aguarde(2000) //função de "contagem", no caso vai contar a cada 2000 milisegundos(2sec)
		}
		limpa()
		escreva ("booooommm!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */