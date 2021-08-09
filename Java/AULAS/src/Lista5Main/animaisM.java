package Lista5Main;

import Lista5Class.animais;
import Lista5Class.cachorro;
import Lista5Class.cavalo;
import Lista5Class.preguica;

public class animaisM {

	public static void main(String[] args) {
		
			animais pig = new animais ("Fred", 3, "nhoquenhoque","sim");
			cachorro dog = new cachorro ("Bobby", 7, "auauau","sim","sim");
			cavalo horse = new cavalo ("Bruto", 10, "rihrriih","sim","sim");
			preguica sono = new preguica ("Soninho", 15, "....","nao","sim");
			
			System.out.print("Porco esta agitado "+pig.getSom()+"\n");
			System.out.print(dog.getNome()+"\n");
			System.out.print(horse.getCorrer()+"\n");
			System.out.print(sono.getIdade());				

	}

}
