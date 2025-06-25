package javapoo;

public class Pessoa {
	String nome;
	int idade;
	
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	
	public void comer(String comida) {
		
		System.out.printf("%s Está comendo! %s.",nome,comida);
	}
}
