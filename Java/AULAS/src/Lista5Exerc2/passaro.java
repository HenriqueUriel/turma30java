package Lista5Exerc2;

public class passaro extends animal {
	private boolean voar;

	public passaro(int idade, String nome, boolean voar) {
		super(idade, nome);
		this.voar = voar;
	}

	public boolean isVoar() {
		return voar;
	}

	public void setVoar(boolean voar) {
		this.voar = voar;
	}
	//polimorfismo
	@Override
	public void emiteSom() {
		System.out.println("piu piu piu piu piu");
	}

}
