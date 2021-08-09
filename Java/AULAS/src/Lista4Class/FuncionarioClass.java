package Lista4Class;

public class FuncionarioClass {

	
	public double salario;
	public String nome;
	public String genero;
	public int idade;
	public String empresa;
	
	public FuncionarioClass(double salario, String nome, String genero, int idade, String empresa) {
		super();
		this.salario = salario;
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.empresa = empresa;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
}
