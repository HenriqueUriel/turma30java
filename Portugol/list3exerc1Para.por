programa
{
	
	funcao inicio()
	{
		//variaveis
		const inteiro HABITANTES = 20	// constante sempre com inteiro e a var com a palavra "MAIUSCILA"
		inteiro numeroFilhos = 0.00
		real salario = 0.00, mediaSalarios = 0.00, totalSalarios = 0.00, mediaFilhos = 0.00, totalFilhos = 0.00
		real percentual100 = 0.00, contadorSalario100 = 0.00, maiorSalario = 0.00

		//entradas
		

		para (inteiro x=1; x<=HABITANTES; x++){
			escreva ("Digite o salario R$ ")
			leia (salario)
			escreva ("Digite o numero de filhos: ")
			leia(numeroFilhos)	
			//Processamento
			totalSalarios = totalSalarios + salario
			totalFilhos = totalFilhos + numeroFilhos
		} // Fim do laço
			mediaSalarios = (totalSalarios/HABITANTES)
			mediaFilhos = (totalFilhos/HABITANTES)
			percentual100 = (contadorSalario100 / HABITANTES) * 100
			
			se (salario > maiorSalario){
				maiorSalario = salario

			se (salario <=100){
				contadorSalario100 ++
				}
			}
			escreva("\nTotal Salario   :  R$ ", totalSalarios)
			escreva("\nMedia Salario   :  R$ ", mediaSalarios)
			escreva("\nTotal Filhos    :  ", totalFilhos)
			escreva("\nMedia Filhos    :  ", mediaFilhos)
			escreva("\nMaior salario: ",maiorSalario)
			escreva("\nPercentual que recebe ate 100: ",percentual100)
			
			
											
		
	}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */