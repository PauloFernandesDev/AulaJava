package Fundamentos02;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalAlunos = 0;
		double soma = 0, media = 0;
		
		System.out.println("Total de alunos na turma:");
		totalAlunos = sc.nextInt();
		
		for(int i = 0; i < totalAlunos ; i++) {
			System.out.printf("Digite a %d° nota:",i + 1);
			soma += sc.nextDouble();
		}
		media = soma / totalAlunos;
		
		System.out.printf("Media da Turma: %.2f", media);
		sc.close();
	}
}

