package Lista4Main;

import Lista4Class.FuncionarioClass;

public class Funcionario {

	public static void main(String[] args) {
		
		FuncionarioClass colaborador = new FuncionarioClass(1000, "Roberto","N/A",28, "Itau");
		
		//declarei (instanciar)
		colaborador.setNome("Marcos");    
		colaborador.setIdade(29);
		colaborador.setGenero("Homem");
		colaborador.setEmpresa("Bradesco");
		colaborador.setSalario(2500);
		//retorno
		System.out.println("Nome: "+colaborador.getNome());
		System.out.println("Idade: "+colaborador.getIdade()+" anos");
		System.out.println("Genero: "+colaborador.getGenero());
		System.out.println("Empregado da Empresa: "+colaborador.getEmpresa());
		System.out.println("Salario Atual: R$ "+colaborador.getSalario());
				

	}

}
