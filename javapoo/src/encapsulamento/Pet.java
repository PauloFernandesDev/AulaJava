package encapsulamento;

public class Pet {
	private String nome;
	private int idade;
	private String raça;
	private  String tipo;
	
	 
	public Pet() {
		super();
	}


	public Pet(String nome, int idade, String raça, String tipo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raça = raça;
		this.tipo = tipo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
