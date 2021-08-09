package Lista5Class;

public class cavalo extends animais {
		
	private String relinchar;

		public cavalo(String nome, int idade, String som, String correr, String relinchar) {
			super(nome, idade, som, correr);
			this.relinchar = relinchar;
		}

		public String getRelinchar() {
			return relinchar;
		}

		public void setRelinchar(String relinchar) {
			this.relinchar = relinchar;
		}
		
	
}
