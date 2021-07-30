programa
{
	inclua biblioteca Util
		
		funcao inicio(){
		
		const inteiro vezes = 10
		real jogadas[vezes]
		real maior = 0.0
		real contador = 1.0
		real media
		real soma =0.0
		 
		para(inteiro x=0;x<vezes;x++){
			jogadas[x] = Util.sorteia (1,6)
			soma+=jogadas[x]
			se(jogadas[x]== maior){
				contador++
			}
			se(jogadas[x]>maior){
				maior=jogadas[x]
				contador=0.0
				contador++
				}
			}
		media = soma/vezes
		
		para(inteiro x=0; x<vezes;x++){
			escreva("LANÇAMENTO ",x+1, " - ", jogadas[x], "\n")
		}
		escreva ("\n")
		escreva("O MAIOR LANÇAMENTO FOI : ", maior, "\n")
		se (contador==1){
			escreva("ESSE RESULTADO OCORREU ", contador, " VEZ.\n")
		}
		senao { 
			escreva("ESSE RESULTADO OCORREU ", contador, " VEZES.\n")
		}
		escreva("SOMA DOS RESULTADOS FOI ", soma, "\n")
		escreva("MEDIA DOS RESULTADOS FOI ", media,"\n")
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */