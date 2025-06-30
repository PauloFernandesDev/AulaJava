package heranca;

public class Animal {

	public String nome;
	public int idade;
	public String especie;
	
	public Animal() {
		
	}
	
	public Animal(String nome, int idade, String especie) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
	}


	public  void  comer() {
		System.out.println("O Animal Está comendo!");
	}
}
