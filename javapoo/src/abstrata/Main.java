package abstrata;


public class Main {

	public static void main(String[] args) {	
		//Exercicio 01
		Animal[] animal = new Animal[4];

		animal[0] = new Cachorro("bingo");
		animal[1] = new Gato("Pantera");
		animal[2] = new Cachorro("Tutão");
		animal[3] = new Gato("Bolinha");
		
		for (Animal animal2 : animal) {
			System.out.println(animal2.nome);
			animal2.emitirSom();
			animal2.dormir();
		}
		 //Exercicio 02
		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Multiplicacao multiplicacao = new Multiplicacao();
		Divisao divisao = new Divisao();
		

		System.out.println(soma.calcular(10, 2));
		System.out.println(subtracao.calcular(10, 2));
		System.out.println(multiplicacao.calcular(10, 2));
		System.out.println(divisao.calcular(10, 2));
		
		//Exercício 03
		Gerente gerente = new Gerente("Marcio",5000);
		System.out.printf("Salario atualizado: %.2f",gerente.calcularSalario(gerente.calcularBonus()));
		System.out.printf("Valor do bonus: %.2f",gerente.calcularBonus());
		}
	}
