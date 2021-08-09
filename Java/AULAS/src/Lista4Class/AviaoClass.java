package Lista4Class;

public class AviaoClass {

	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	
	
	
	public AviaoClass(String cor, String modelo) {
		super();
		this.cor = cor;
		this.modelo = modelo;
	}
	public void ligado () {
		System.out.println("Avi�o ligado...");
	}
	public void levantandoVoo () {
		System.out.println("delocando....");
	}
	public void pousando () {
		System.out.println("avi�o chegando ao ch�o!!");
	}
	
	public void acelera (double rapido) {
		double velocidadeNova = this.velocidadeAtual+rapido;
		this.velocidadeAtual = velocidadeNova;
	}
	
	
}
