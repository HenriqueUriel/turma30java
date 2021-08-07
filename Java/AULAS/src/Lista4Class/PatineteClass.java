package Lista4Class;

public class PatineteClass {

	public String marca;
	public String cor;
	public int quatidadeRodas;
	public double velocidade;
	public String andando;
	public String caiu;
	
	

	public void velPatinete (double quantidade) {
		double velocidadeNova = this.velocidade+quantidade;
		this.velocidade = velocidadeNova;
	}
	public String getCaiu() {
		return caiu;
	}

	public void setCaiu(String caiu) {
		this.caiu = caiu;
	}

	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getQuatidadeRodas() {
		return quatidadeRodas;
	}
	public void setQuatidadeRodas(int quatidadeRodas) {
		this.quatidadeRodas = quatidadeRodas;
	}
	public String getAndando() {
		return andando;
	}
	public void setAndando(String andando) {
		this.andando = andando;
	}
	
	
	
	
	
}
