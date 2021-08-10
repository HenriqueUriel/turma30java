package Lista5Exerc2;

public class animal {
	
	private int idade;
	private String nome;
	//construtor
	public animal(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	//encapsulamento
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//metodo
	public void emiteSom() {
		System.out.println("emitir som....");
	}
	

}
