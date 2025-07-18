package encapsulamento;

public class Produto {

	private String nome;
	private double preco = 0;
	private int quantidadeEstoque = 0;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void adicionarEstoque(int estoque) {
		this.quantidadeEstoque += estoque;
		System.out.printf("Adicionado %d itens ao estoque \n", estoque);
		System.out.println("*** Informações atualizada ***");
		System.out.printf("Nome: %s \nPreco: %.2f \nQuantidade no estoque: %d \n",this.nome,this.preco,this.quantidadeEstoque);
	}
	
	public void removerEstoque(int estoque) {
		if(this.quantidadeEstoque > 0) {
			this.quantidadeEstoque -= estoque;
			System.out.printf("Retirado %d itens ao estoque \n", estoque);
			System.out.println("*** Informações atualizada ***");
			System.out.printf("Nome: %s \nPreco: %.2f \nQuantidade no estoque: %d \n",this.nome,this.preco,this.quantidadeEstoque);
		}else {
			System.out.println("Não possui estoque para este produto!");
		}
	}
	
	
}
