package entities;

public class cachorro extends PetC {
	private boolean latinoAlto;

	public cachorro(String raca, int anoNascimento, boolean latinoAlto) {
		super(raca, anoNascimento);
		this.latinoAlto = latinoAlto;
	}

	public cachorro(String raca, boolean latinoAlto) {
		super(raca);
		this.latinoAlto = latinoAlto;
	}


	public boolean isLatinoAlto() {
		return latinoAlto;
	}

	public void setLatinoAlto(boolean latinoAlto) {
		this.latinoAlto = latinoAlto;
	}
	
	@Override  //polimorfismo
	public void emiteSom() {
		System.out.println("au au au au au ");
	}


}
