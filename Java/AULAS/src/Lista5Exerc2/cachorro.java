package Lista5Exerc2;

public class cachorro extends animal {
	private boolean latir;

	public cachorro(int idade, String nome, boolean latir) {
		super(idade, nome);
		this.latir = latir;
	}

	public boolean isCorrer() {
		return latir;
	}

	public void setCorrer(boolean correr) {
		this.latir = correr;
	}
	//polimorfismo
	@Override
	public void emiteSom() {
		System.out.println("au au au au");
	}

}
