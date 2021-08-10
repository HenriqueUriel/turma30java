package Lista5Exerc2;

public class cavalo extends animal {
	private boolean saltarObstaculos;

	public cavalo(int idade, String nome, boolean saltarObstaculos) {
		super(idade, nome);
		this.saltarObstaculos = saltarObstaculos;
	}

	public boolean isSaltarObstaculos() {
		return saltarObstaculos;
	}

	public void setSaltarObstaculos(boolean saltarObstaculos) {
		this.saltarObstaculos = saltarObstaculos;
	}
	//polimorfismo
	@Override
	public void emiteSom() {
		System.out.println("rriiihhhrrriiiihhh");
	}
	
}
