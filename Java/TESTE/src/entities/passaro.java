package entities;

public class passaro extends PetC {
	private boolean voar;

	public passaro(String raca, int anoNascimento, boolean voar) {
		super(raca, anoNascimento);
		this.voar = voar;
	}

	public passaro(String raca, boolean voar) {
		super(raca);
		this.voar = voar;
	}


	public boolean isVoar() {
		return voar;
	}

	public void setVoar(boolean voar) {
		this.voar = voar;
	}
	

}
