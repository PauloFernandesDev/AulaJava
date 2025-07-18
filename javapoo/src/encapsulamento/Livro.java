package encapsulamento;

public class Livro {
	private String titulo;
	private String autor;
	private int faixaEtariaMinima = 0;
	
	public Livro() {
		
	}
	public Livro(String titulo, String autor, int faixaEtariaMinima) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.faixaEtariaMinima = faixaEtariaMinima;
	}
	
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getFaixaEtariaMinima() {
		return faixaEtariaMinima;
	}
	public void setFaixaEtariaMinima(int faixaEtariaMinima) {
		this.faixaEtariaMinima = faixaEtariaMinima;
	}
	public boolean podeSerLidoPor(int idadeDoLeitor) {
		if(idadeDoLeitor >= faixaEtariaMinima) {
			System.out.println("Idade do leitor permite lê o livro");
			return true;
		}else {
			System.out.println("Idade do leitor não permite lê o livro");
			return false;
		}
	}
	
	

}
