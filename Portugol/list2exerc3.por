programa
{
	
	funcao inicio()
	{
		real num1, num2, num3, num4, r1, r2, r3, r4

		escreva ("Escreva o primeiro numero: ")
		leia(num1)
		escreva ("Escreva o segundo numero: ")
		leia(num2)
		escreva("Escreva o terceiro numero: ")
		leia(num3)
		escreva("Escreva o primeiro numero: ")
		leia(num4)
		limpa()

			r1 = num1*num1
			r2 = num2*num2
			r3 = num3*num4
			r4 = num4*num4
		
		se (r3>=1000){		
			escreva ("O valor do terceiro foi de ",r3)			
		}
		senao {
			escreva ("\nO quadrado dos seguintes numeros são: \n")
			escreva ("\nO quadrado de ",num1, " é ", r1)
			escreva ("\nO quadrado de ",num2, " é ", r2)
			escreva ("\nO quadrado de ",num3, " é ", r3)
			escreva ("\nO quadrado de ",num4, " é ", r4)			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 457; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */