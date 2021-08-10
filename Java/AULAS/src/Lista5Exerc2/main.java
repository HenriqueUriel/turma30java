package Lista5Exerc2;

public class main {

	public static void main(String[] args) {
		
		animal qualquerAnimal = new animal(10,"Ronaldo");
		cachorro dog = new cachorro(4,"Dog", true);
		cavalo horse = new cavalo(20,"Cavalo",true);
		passaro andorinha = new passaro(2,"Bruce",true);
		
		qualquerAnimal.emiteSom();
		dog.emiteSom();
		horse.emiteSom();
		andorinha.emiteSom();

	}

}
