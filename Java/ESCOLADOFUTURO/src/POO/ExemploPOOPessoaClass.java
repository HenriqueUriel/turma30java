package POO;

public class ExemploPOOPessoaClass {

	// ATRIBUTOS
	private String primeiroNome;
	private String nomeMeio;
	private String ultimoNome;
	
	//CONSTRUTOR
	public ExemploPOOPessoaClass (String primeiro, String meio, String ultimo) { // PARAMETROS e associa o parametro com o atributo
		
		primeiroNome = primeiro;   // 
		nomeMeio = meio;
		ultimoNome = ultimo;	
	}
	
	public String getNomeCompleto() {		// retornar o nome completo
		
		String NomeCompleto = primeiroNome+" "+nomeMeio+" "+ultimoNome;
		return NomeCompleto;
	}
}
