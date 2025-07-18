package encapsulamento;

public class Aluno {
	
	private String nome;
	private double nota1 = 0, nota2 = 0, media = 0;
	
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double  getMedia() {
		this.media = (this.nota1 + this.nota2) / 2;
		System.out.printf("Media de %s: %.2f \n",this.nome, media);
		return media;
	}
	
	public boolean isAprovado() {
		if(this.media >= 6.0) {
			System.out.printf("Aluno:  %s está aprovado!\n", this.nome);
			return true;
		}
		System.out.printf("Aluno:  %s está reprovado!\n", this.nome);
		return false;
	}
	
	
	

}
