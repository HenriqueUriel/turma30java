package Lista5Class;

public class preguica extends animais {
	private String subirArvore;

	public preguica(String nome, int idade, String som, String correr, String subirArvore) {
		super(nome, idade, som, correr);
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	

}
