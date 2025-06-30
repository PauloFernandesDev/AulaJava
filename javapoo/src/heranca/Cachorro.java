package heranca;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}

	public void Comer(){
		System.out.println("O cachorro está comendo ração!.");
	}

	public void Comer(String comida) {
		System.out.printf("O Cachorro está comendo %s \n", comida);
	}
	
	public void Comer(String nome,String comida) {
		System.out.printf("%s está comendo %s",nome, comida);
	}
}
