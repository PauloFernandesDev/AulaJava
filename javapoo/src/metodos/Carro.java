package metodos;

public class Carro {

	public String cor;
	public double preco;
	public String modelo;
	
	public Carro() {
		
	}
	
	public Carro( String modelo, double preco) {
		this.preco = preco;
		this.modelo = modelo;
	}
	
	public Carro(String cor, String modelo,double preco) {
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
	}
	

	
}
