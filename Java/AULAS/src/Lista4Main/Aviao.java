package Lista4Main;

import Lista4Class.AviaoClass;

public class Aviao {

	public static void main(String[] args) {
		
		AviaoClass novoAviao = new AviaoClass ();
		novoAviao.cor = "Azul";
		novoAviao.modelo = "71BlackMonster";
		novoAviao.velocidadeAtual = 0;
		novoAviao.velocidadeMaxima = 300;
		
		System.out.printf("Avião modelo %s cor %s, pronto para partir!!\n",novoAviao.modelo,novoAviao.cor);
		novoAviao.ligado();
		novoAviao.levantandoVoo();
		novoAviao.acelera(200);
		System.out.print("Velocidade de voo "+novoAviao.velocidadeAtual+" km/h\n");
		novoAviao.pousando();
		
		

	}

}
