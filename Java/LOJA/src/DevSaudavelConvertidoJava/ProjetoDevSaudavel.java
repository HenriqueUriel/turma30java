package DevSaudavelConvertidoJava;
import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	import java.text.DecimalFormat;

	public class ProjetoDevSaudavel {
			/*
			 * Projeto Ecommerce, loja de produtos saud√°veis.
			 * Programado por:
			 * Ana Beatriz Yujra Espejo
			 * Giovanna Siqueira Paiva dos Penedos
			 * Henrique Uriel Lopes
			 * Maicon Gomes Cerqueira
			 * Vinicius Cardoso Siqueira Francisco
			 */
		public static void main(String[] args) {
	//In√≠cio VINICIUS 			        
			DecimalFormat df = new DecimalFormat("#.00");//arredondamento do valor								
			LocalDateTime agora = LocalDateTime.now();//data/hora atual
			DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");// formatar a data
			String dataFormatada = formatterData.format(agora);// formatar a hora
			DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
			String horaFormatada = formatterHora.format(agora);
			Scanner ler = new Scanner(System.in);
	     	String [] verificarRepeticao = {"","","","","","","","","",""}; //Auxilia na verifica√ß√£o de um c√≥digo, se selicionado mais de uma vez numa compra
			String [] codProduto = { "G3-1", "G3-2","G3-3","G3-4","G3-5","G3-6","G3-7","G3-8","G3-9","G3-10"};
			String [] produto = { "Glutamina", "Vitamina C", "Regata Cav", "Tenis Sports", "Whey Prot", "Snacks Div", "C. Legging", "Camiseta", "BCAA CAPS", "Corda P."};
			String zerarCarrinho = " ";
			String auxCod = " ";
			double [] preco = { 30.00, 15.00, 45.00, 100.00, 75.00, 12.00, 80.00, 24.00, 42.00, 20.00 };
			double total = 0.0;			
			int[] estoque = new int[10];  
			int[] carrinhoCompras = new int[10];
			int contador = 0;
			int opcao = 0;
			int auxQuant = 0;
			char continua = ' ';
			char desejaEntraNoSite = ' ';
			char desejaVoltarParaSite = ' ';
			
			//Limita o estoque do produto at√© 10
			for(contador = 0 ; contador < 10 ; contador++){
				estoque[contador] = 10;	
			}
			//Entrada para o site
			do{
				insereBanner(); //Maic
				System.out.print("\nDeseja entrar no site [S/N] ? : ");
				desejaEntraNoSite = ler.next().toUpperCase().charAt(0);
				//Tabela de c√≥digo, produtos, pre√ßos e estoque
				if(desejaEntraNoSite == 'S' || desejaEntraNoSite == 's'){
					tituloTabela(); //Maic
					for(contador = 0 ; contador < 10 ; contador++){
						System.out.print("\n\t‚ô•     "+codProduto[contador]+" \t‚ô•\t"+ produto[contador]+"\t‚ô•\t"+ preco[contador]+"\t   ‚ô•\t  "+estoque[contador]+"\t   ‚ô•");
					}//for
					linha(true); //Maic
	//Fim VINICIUS 
	//In√≠cio ANA 
						do {
							System.out.print("\n\nSelecione o c√≥digo do produto : ");
							auxCod = ler.next().toUpperCase();
							//Se o produto selecionado estiver no carrinho, √© perguntado se deseja modific√°-lo
							for(contador = 0; contador < 10;contador++) {
								if(auxCod.equals(verificarRepeticao[contador])) {
									System.out.print("\nVoc√™ j√° selecionou este produto, deseja escolher outro [S/N] ? ");
									continua = ler.next().toUpperCase().charAt(0);
									//Caso cliente deseja escolher outro produto que n√£o esteja no carrinho
									if(continua == 'S') {
										auxQuant = 0;
										tituloTabela(); //Maic									
										for(contador = 0;contador < 10;contador++) {
											System.out.print("\t‚ô•     "+codProduto[contador]+" \t‚ô•\t"+ produto[contador]+"\t‚ô•\t"+ preco[contador]+"\t   ‚ô•\t  "+estoque[contador]+"\t   ‚ô•\n");
										}
										linha(true); //Maic
										System.out.print("\nSelecione o c√≥digo do produto : ");
										auxCod = ler.next().toUpperCase();
										contador = 0;
										while(auxCod.equalsIgnoreCase(codProduto[contador])){
											contador++;
										}
									}//Caso deseja modificar o produto existente no carrinho
										
								}
	//Fim ANA 
	//In√≠cio HENRIQUE 
								//Quantidade desejada do produto
								if (auxCod.equals(codProduto[contador])) {
							 		verificarRepeticao[contador] = codProduto[contador];
							 		System.out.print("C√≥digo : "+codProduto[contador]+"\nProduto : "+produto[contador]+"\nValor : "+preco[contador]+"\nEstoque : "+estoque[contador]);
							 		System.out.print("\n\nDigite a quantidade desejada : ");
							 		auxQuant = ler.nextInt();
							 		//Caso a quantidade seja negativa ou 0.
							 		while (auxQuant<=0) {
							 		System.out.print("Valor inv√°lido, digite novamente: ");
							 		auxQuant = ler.nextInt();
							 		}
							 		//Quantidade inexistente no estoque
							 		if (auxQuant > estoque[contador] && estoque[contador] == 0) {
							 			System.out.print("Produto em falta! Digite ' 0 'para prosseguir ");
							 			while (auxQuant > estoque[contador]) {
							 			auxQuant = ler.nextInt();	
							 			}
							 		}
							 		else if (auxQuant > estoque[contador]) {
							 			while (auxQuant > estoque[contador] && estoque[contador] <= 0) {
							 			System.out.print("\nDigite a quantidade mediante o estoque !");	
							 			System.out.print("\n\nDigite a quantidade desejada : ");
							 			auxQuant = ler.nextInt();
							 			}
							 		}
							 		break;	 				
							 	}
							} 
								//Carrinho durante a compra
					 			for (contador = 0; contador < 10; contador++) {
					 				if (auxCod.equals(codProduto[contador])) {
					 				carrinhoCompras[contador] = auxQuant;
					 				tituloCarrinho(); //Maic
					 					for (contador = 0; contador < 10; contador++) {
					 						if(carrinhoCompras[contador] != 0) {
					 							System.out.print("‚ô•     "+codProduto[contador]+" \t‚ô•\t"+produto[contador]+"\t‚ô•\t"+preco[contador]+"\t   ‚ô•\t  "+carrinhoCompras[contador]+"\t‚ô•\t"+(carrinhoCompras[contador]*preco[contador])+"\t    ‚ô•\n");			
					 						}
					 					}
					 				linha(false); //Maic
					 				}
					 			}
						 		//Ap√≥s adicionar o produto no carrinho, √© perguntado novamente
						 		System.out.print("\nDeseja continuar a compra [S/N] ?: ");
						 		continua = ler.next().toUpperCase().charAt(0);
						 		tituloTabela(); //Maic
						 		for (contador = 0 ; contador < 10 ; contador++) {
						 			if (continua == 'S') {
					 				System.out.print("\n\t‚ô•     "+codProduto[contador]+" \t‚ô•\t"+produto[contador]+"\t‚ô•\t"+preco[contador]+"\t   ‚ô•\t  "+estoque[contador]+"\t   ‚ô•");
						 			}
						 		}
					 		linha(true); //Maic	
						}while (continua == 'S');
	//Fim HENRIQUE 
	//In√≠cio GIOVANNA 
						//Compra finalizada - Carrinho final 
						tituloCarrinho(); //Maic
						for (contador = 0; contador < 10; contador++) {
							if (carrinhoCompras[contador] != 0) {
								System.out.printf("‚ô•     "+codProduto[contador]+" \t‚ô•\t"+produto[contador]+"\t‚ô•\t"+preco[contador]+"\t   ‚ô•\t  "+carrinhoCompras[contador]+"\t‚ô•\t"+(carrinhoCompras[contador] * preco[contador])+"\t    ‚ô•\n");
								total += carrinhoCompras[contador] * preco[contador];
							}
						}
						linha(false); //Maic
						System.out.printf("\nVALOR DA COMPRA : %.2f",total);
						System.out.println("\n\nFORMAS DE PAGAMENTO : ");
						System.out.println("Op√ß√£o [1] - Dinheiro √° vista c/ 10% de desconto");
						System.out.println("Op√ß√£o [2] - Cart√£o √° vista c/ 10% de acr√©scimo");
						System.out.println("Op√ß√£o [3] - Cart√£o em 2x c/ 15% de acr√©scimo");
						System.out.print("\nDigite a op√ß√£o de pagamento : ");
						opcao = ler.nextInt();
						linhaNota(true); //Maic					
						//Op√ß√µes de Pagamento
						while (opcao >3 || opcao <=0) {
							System.out.println("Op√ß√£o inv√°lida, escolha novamente: ");
							System.out.println("\n\nFORMAS DE PAGAMENTO : ");
							System.out.println("Op√ß√£o [1] - Dinheiro √° vista c/ 10% de desconto");
							System.out.println("Op√ß√£o [2] - Cart√£o √° vista c/ 10% de acr√©scimo");
							System.out.println("Op√ß√£o [3] - Cart√£o em 2x c/ 15% de acr√©scimo");
							System.out.print("\nDigite a op√ß√£o de pagamento : ");
							opcao = ler.nextInt();
						}					
						//Op√ß√£o 1 - √† vista
						if (opcao == 1) {
							for (contador = 0; contador < 10; contador++) {
								if (carrinhoCompras[contador] != 0) {
									System.out.println("‚ô•     "+codProduto[contador]+" \t‚ô•\t"+produto[contador]+"\t‚ô•\t"+preco[contador]+"\t   ‚ô•\t  "+carrinhoCompras[contador]+"\t‚ô•\t"+carrinhoCompras[contador] * preco[contador]+"\t    ‚ô•");
								}
							}
							System.out.println("\n\nDinheiro √† vista");
							System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
							System.out.println("10% de desconto : R$ "+df.format(total * 0.1));
							System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 0.9)+"\n");
							System.out.print("\n\t\t\t\t\tData de emiss√£o : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
							linhaNota(false); //Maic
						}
						//Op√ß√£o 2 - √† vista cart√£o
						if (opcao == 2) {
							for (contador = 0; contador < 10; contador++) {
								if (carrinhoCompras[contador] != 0) {
									System.out.println("‚ô•     "+codProduto[contador]+" \t‚ô•\t"+produto[contador]+"\t‚ô•\t"+preco[contador]+"\t   ‚ô•\t  "+carrinhoCompras[contador]+"\t‚ô•\t"+carrinhoCompras[contador] * preco[contador]+"\t    ‚ô•");
								}
							}
							System.out.println("\n\nCart√£o √† vista");
							System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
							System.out.println("10% de acr√©scimo : R$ "+df.format(total * 0.1));
							System.out.println("\nTOTAL DA COMPRA R$ "+df.format(total * 1.1)+"\n");
							System.out.print("\n\t\t\t\t\tData de emiss√£o : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
							linhaNota(false); //Maic
						}	
						//Op√ß√£o 3 - em 2X no cart√£o
						else if (opcao == 3) {
							for (contador = 0; contador < 10; contador++) {
								if (carrinhoCompras[contador] != 0) {
									System.out.println("‚ô•     "+codProduto[contador]+" \t‚ô•\t"+produto[contador]+"\t‚ô•\t"+preco[contador]+"\t   ‚ô•\t  "+carrinhoCompras[contador]+"\t‚ô•\t"+carrinhoCompras[contador] * preco[contador]+"\t    ‚ô•");
								}
							}
							System.out.println("\n\n2X no Cart√£o");
							System.out.println("9% de ICMS : R$ "+df.format(total * 0.09));
							System.out.println("15% de acr√©scimo : R$ "+df.format(total * 0.15));
							System.out.println("Valor da parcela : R$ "+df.format((total * 1.15)/2)+"\n");
							System.out.println("\nTOTAL DA COMPRA R$ " +df.format(total * 1.15)+"\n");
							System.out.print("\n\t\t\t\t\tData de emiss√£o : "+formatterData.format(agora)+"\t    Hora : "+formatterHora.format(agora));
							linhaNota(false); //Maic
						}					
						//Zerando carrinho para nova compra
						auxQuant=0;				
						contador=0;
						for (contador = 0; contador < 10; contador++) {
							verificarRepeticao[contador] = " ";
						}
						for (contador = 0; contador < 10; contador++) {
							estoque[contador] -= carrinhoCompras[contador];
						}
						for (contador = 0; contador < 10; contador++) {
							carrinhoCompras[contador] = 0;		
							total = 0.0;
						}
					}
				else {
					break;
				}
				System.out.print("\nDeseja retornar ao site [S/N]: ");
				desejaVoltarParaSite = ler.next().toUpperCase().charAt(0);	
			}while (desejaVoltarParaSite == 'S');
			System.out.println("Agradecemos a visita ‚ô•\nVolte Sempre !!!\n");
		}//void main
	//Fim GIOVANNA
		
	//In√≠cio MAICON

		//Cabe√ßalho do site
		public static void insereBanner() {
			System.out.println("www.devsaudavel.com.br || vers√£o 2.0\n");
			System.out.println("\t\t\t\t*****DEV SAUD√?VEL*****");
			System.out.println("\t\t\t\tProgramando a sua sa√∫de");
		}

		//Cabe√ßalho da tabela
		public static void tituloTabela() {
			System.out.println("\n\t‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•‚ô•");
			System.out.println("\t‚ô•\t\t\t    TABELA DE PRODUTOS\t\t\t\t   ‚ô•");
			System.out.println("\t‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï? ");
			System.out.println("\t‚ô•    C√ìDIGO\t‚ô•\t PRODUTO\t‚ô•    VALOR (R$)    ‚ô•    ESTOQUE    ‚ô•");
		}

		//Cabe√ßalho do carrinho
		public static void tituloCarrinho() {
			System.out.println("\n‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?");
			System.out.println("‚ô•\t\t\t\t  CARRINHO DE COMPRAS\t\t\t\t\t    ‚ô•");
			System.out.println("\n‚ô•    C√ìDIGO\t‚ô•\t PRODUTO\t‚ô•    VALOR (R$)    ‚ô•    QTDD    ‚ô•     TOTAL (R$)    ‚ô•");
		}
		
		//Linha divis√£o 
		public static void linha(boolean forte){
			if(forte){
				System.out.println("\n\t‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?");
			}
			else {
				System.out.println("‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?‚ï?");
			}
		}
		
		//Cabe√ßalho nota fiscal
		public static void linhaNota (boolean forte){
			if (forte){
				System.out.println("======================================= NOTA FISCAL =========================================\n");
				System.out.println("\nwww.devsaudavel.com.br || vers√£o 2.0\n");
				System.out.println("\t\t\t\t  *****DEV SAUD√?VEL*****\n");
				System.out.println("\t\t\t\t  Programando a sua sa√∫de\n");
				System.out.println("\n\n‚ô•    C√ìDIGO\t‚ô•\t PRODUTO\t‚ô•    VALOR (R$)    ‚ô•    QTDD    ‚ô•     TOTAL (R$)    ‚ô•\n");
			}
			else {
				System.out.println("\n=============================================================================================\n");
			}
		}
	//Fim MAICON
	}