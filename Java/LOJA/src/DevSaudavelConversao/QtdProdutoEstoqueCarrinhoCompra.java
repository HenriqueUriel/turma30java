package DevSaudavelConversao;
import java.util.Scanner;

public class QtdProdutoEstoqueCarrinhoCompra {
	
	Scanner ler = new Scanner(System.in);
	 int auxQuant = 0;
	 char continua;
	
	 		//Quantidade desejada do produto.
	 		if (auxCod == codProduto[contador]) {
	 		verificarRepeticao[contador] = codProduto[contador];
	 		System.out.print("Código : "+codProduto[contador]+"\nProduto : "+produto[contador]+"\nValor : "+preco[contador]+"\nEstoque : "+estoque[contador]);
	 		System.out.print("\n\nDigite a quantidade desejada : ");
	 		auxQuant = ler.nextInt();
	 			//Caso a quantidade seja negativa ou 0.
	 			while (auxQuant<=0) {
	 			System.out.print("Valor inválido, digite novamente: ");
	 			auxQuant = ler.nextInt();
	 			}
	 			//Quantidade inexistente no estoque
	 			if (auxQuant > estoque[contador] && estoque[contador] == 0) {
	 				System.out.print("Produto em falta no estoque, digite 0 para escolher outro produto! ");
	 				while (auxQuant > estoque[contador]) {
	 				auxQuant = ler.nextInt();	
	 				}
	 			}
	 			else if (auxQuant > estoque[contador]) {
	 				while (auxQuant > estoque[contador]) {
	 				System.out.print("\nDigite a quantidade mediante o estoque !");	
	 				System.out.print("\n\nDigite a quantidade desejada : ");
	 				auxQuant = ler.nextInt();
	 				}
	 			}
	 			break;	 				
	 		}
	 	// } continuação da ana - primeiro for, chave fechando!
	 		
	 		//Carrinho durante a compra
	 		for (contador = 0; contador < 10; contador++) {
	 			if (auxCod == codProduto[contador]) {
	 				carrinhoCompras[contador] = auxQuant;
	 				//tituloCarrinho()
	 				for (contador = 0; contador < 10; contador++) {
	 						if(carrinhoCompras[contador] != 0) {
	 							System.out.print("♥     "+codProduto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+carrinhoCompras[contador]+"\t♥\t"+(carrinhoCompras[contador]*preco[contador])+"\t    ♥\n");			
	 						}
	 				}
	 				//linha(falso)
	 			}
	 		}
	 		//Após adicionar o produto no carrinho, se deseja continuar comprando.
	 		System.out.print("\nDeseja continuar a compra [S/N] ?: ");
	 		continua = ler.next().toUpperCase().charAt(0);
	 		//tituloTabela()
	 		for (contador = 0 ; contador < 10 ; contador++) {
	 			if (continua == 'S') {
	 				System.out.print("\n\t♥     "+codProduto[contador]+" \t♥\t"+produto[contador]+"\t♥\t"+preco[contador]+"\t   ♥\t  "+estoque[contador]+"\t   ♥");
	 			}
	 		}
	 		//linha(verdadeiro)
	 		//chave ( } )fechando o primeiro faça (do) da ana, comeco cod dela!
	 	} while (continua == 'S');	
	 	
	 	//inicio gih!
	}

}
