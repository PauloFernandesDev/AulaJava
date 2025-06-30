package heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro("Akashi", 3, "Husky");
		
		
		animal.comer();
		cachorro.Comer();
		cachorro.Comer("Carne");
		cachorro.Comer(cachorro.nome,"Carne");
		
	}

}
