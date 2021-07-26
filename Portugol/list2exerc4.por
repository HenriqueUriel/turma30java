programa{
  
  funcao inicio(){
  
    inteiro num
    
    escreva("Digite um número inteiro positivo: ")
    leia(num)

    se(num == 0){
      escreva("número digitado é neutro!")
    }
    senao se ((num % 2 )==1) {
      escreva("número par!")
    }
    senao se ((num < 0 )) {
	escreva ("número negativo!")  	 
    }
  	
    }
  }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */