package Lista4Main;

import Lista4Class.PatineteClass;

public class Patinete {

	public static void main(String[] args) {
		
		PatineteClass andandoPatinete = new PatineteClass();
		
		andandoPatinete.setMarca("Yellow");
		andandoPatinete.setCor("amarelo");
		andandoPatinete.setQuatidadeRodas(4);
		andandoPatinete.setAndando("Sim");
		andandoPatinete.velocidade = 0;
		andandoPatinete.setCaiu("caiu e se quebrou todo!!");
		
		System.out.println("Andando de Patinete: "+andandoPatinete.getAndando());
		System.out.println("Marca: "+andandoPatinete.getMarca());
		System.out.println("Cor: "+andandoPatinete.getCor());
		System.out.println("Rodas (2|4): "+andandoPatinete.getQuatidadeRodas());
		andandoPatinete.velPatinete(40);
		System.out.println("Velocidade Atual: "+andandoPatinete.velocidade+" Km/h");
		System.out.println("Esta tudo bem?: "+andandoPatinete.getCaiu()+" :( ");
		
		
		

	}

}
