package entities;

public class PetC {
//atributo	
	private String raca;
	private int anoNascimento;
	private char porte;
//construtor	
	public PetC(String raca, int anoNascimento) {
		super();
		this.raca = raca;
		this.anoNascimento = anoNascimento;
	}
	public PetC(String raca) {
		super();
		this.raca = raca;
	}
//encapsulamento (get/set)	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return anoNascimento;
	}
	public void setIdade(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public char getPorte() {
		return porte;
	}
	public void setPorte(char porte) {
		this.porte = porte;
	}
//metodo
	public int idade () {
		return  (2021 - anoNascimento);
	}
	//teste polimorfismo (gato/cachorro)
	public void emiteSom() {
		System.out.println("emite sooom!!!");
	}
	
}

