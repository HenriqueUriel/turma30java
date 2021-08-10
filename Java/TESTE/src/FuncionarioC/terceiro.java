package FuncionarioC;

public class terceiro extends funcionario {
	private double adicional;

	public terceiro(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@Override
	public double calculoSalario () {
		return super.getValorPorHora() * super.getHorasTrabalhadas() + adicional;
	}

}
