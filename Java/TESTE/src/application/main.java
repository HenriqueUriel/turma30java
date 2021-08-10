package application;

import entities.cachorro;
import entities.gato;

public class main {

	public static void main(String[] args) {
		
		cachorro dog = new cachorro("Pit",true);
		
		gato cat = new gato ("siames",true);
		dog.setIdade(2010);
		
		cat.emiteSom();
		
		dog.emiteSom();
	}

}
