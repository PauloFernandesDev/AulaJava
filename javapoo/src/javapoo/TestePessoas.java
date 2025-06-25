package javapoo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestePessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		
		System.out.println("Quantas pessoas deseja adicionar?: ");
		int quantidadeP = sc.nextInt();
		
		for (int i = 0; i < quantidadeP; i++) {
			
			System.out.printf("Digite o nome da %d° pessoa: ",i + 1);
			String nome = sc.next();
			System.out.printf("Digite a idade de %s:  ", nome);
			int idade = sc.nextInt();
			pessoas.add(new Pessoa(nome,idade));
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("\n");
			System.out.printf("Nome : %s \n",pessoa.nome);
			System.out.printf("Idade : %d \n",pessoa.idade);
			pessoa.comer("Morango");
		}
		System.out.printf(" \n\n Total de pessoas adicionadas: %d", pessoas.toArray().length);

		
		sc.close();
	}

}
