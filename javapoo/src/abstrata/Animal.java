package abstrata;

public abstract class Animal {
	String nome ;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	public void emitirSom() {
		
	}
	public void dormir() {
		System.out.println("O animal está dormindo!.");
	}

}
