package Lista5Class;

public class cachorro extends animais {
	private String latir;

	public cachorro(String nome, int idade, String som, String correr, String latir) {
		super(nome, idade, som, correr);
		this.latir = latir;
	}

	public String getLatir() {
		return latir;
	}

	public void setLatir(String latir) {
		this.latir = latir;
	}
	

}
