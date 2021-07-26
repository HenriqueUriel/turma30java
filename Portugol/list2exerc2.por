programa
{
	
	funcao inicio()
	{
		inteiro horas, excedente, salario, excesso
		cadeia nomeUsuario
		
		escreva("\nNome do funcionario: ")
		leia(nomeUsuario)
		escreva("Digite o número de horas trabalhadas: ")
		leia(horas)
		limpa()

		se (horas>50) {
			excedente = horas - 50
			excesso = excedente * 20.00
			salario = 50*10.00 + excesso
			escreva ("\nFuncionario ",nomeUsuario, ",")
			escreva ("\nSeu salário Total é de R$", salario, " sendo R$", excesso, " de horas extras!")
		}
		senao {			
			salario = 50*10.00
			excedente = 0.00
			escreva ("\nFuncionario ",nomeUsuario, ",")
			escreva ("\nSeu salário este mês foi de R$ ", salario)
			escreva ("\ne R$ ", excedente, " (zero), pois não obteve horas extras trabalhadas este mês!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */