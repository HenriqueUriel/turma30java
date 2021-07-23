programa
{
	
	funcao inicio()
	{

		inteiro horas, minutos, segundos, seg

		escreva("Duração que o evento teve em segundos: ")	//3600 é igual ao total de segundo em 1 hora. 60*60
		leia(segundos)

		horas = segundos/3600
		minutos = (segundos%3600)/60
		seg = (segundos%3600)%3600

		escreva("A duração do evento foi de ", horas , " horas ", minutos, " minutos e ", seg, " segundos ")
		   
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 184; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */