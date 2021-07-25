programa
{
	
	funcao inicio()
	{

		real peso, altura, idade, sexo, basal1, basal2
		

		escreva ("Qual seu sexo:\n (1) Homem\t (2) Mulher\t\n")
		leia(sexo)
		se(sexo==1){
			escreva("Peso (kg): ")
			leia(peso)
			escreva("Altura (cm): ")
			leia(altura)
			escreva("Idade (anos): ")
			leia(idade)

			basal1 = 66 + (13.8*peso) + (5*altura) - (6.8*idade)
			escreva("Sua taxa metabolica basal(TMB) é: ",basal1)
		}senao se(sexo==2){
			escreva("Peso (kg): ")
			leia(peso)
			escreva("Altura (cm): ")
			leia(altura)
			escreva("Idade (anos): ")
			leia(idade)

			basal2 = 655 + (9.6*peso) + (1.8*altura) - (4.7*idade)
			escreva("Sua taxa metabolica basal(TMB) é: ",basal2)
		}senao se(sexo >=3){
			escreva ("Opção invalida, escolha entre 1 e 2")
		}
									
	}	
}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */