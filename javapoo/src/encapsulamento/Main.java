package encapsulamento;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Paulo", 29);		
		ContaBancaria conta = new ContaBancaria("123", 100.00);
		Produto produto = new Produto("feijão 1kg", 9.0 , 5 );
		Aluno aluno1  = new Aluno("Márcio", 10, 9.5);
		Aluno aluno2  = new Aluno("Paulo", 6,5.5);
		Livro livro1 = new Livro("O contador","Mariana", 18);
		Livro livro2 = new Livro("Narnia","Kaline", 15);
		
		System.out.println("****");
		System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
		
		System.out.println("****");
		conta.DepositarValor(50);
		conta.SacarValor(75);
		conta.SacarValor(100);
		
		System.out.println("****");
		produto.adicionarEstoque(5);
		produto.removerEstoque(10);
		produto.removerEstoque(1);
		
		System.out.println("****");
		aluno1.getMedia();
		aluno1.isAprovado();
		aluno2.getMedia();
		aluno2.isAprovado();
		
		System.out.println("****");
		livro1.podeSerLidoPor(17);
		livro2.podeSerLidoPor(19);
		
	}

}
