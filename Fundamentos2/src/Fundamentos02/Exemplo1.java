package Fundamentos02;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalAlunos = 0,x = 0 ;
		double soma = 0,media = 0;
		
		System.out.print("Total de alunos da sua Turma?:");
		totalAlunos = sc.nextInt();
		while ( x < totalAlunos) {
			System.out.printf("Digite a nota do %d° Aluno: ",x + 1);
			soma += sc.nextDouble();
			x++;
		}
		media = soma / totalAlunos;
		System.out.printf("Media da Turma é %.2f \n",media);
		System.out.println(media >= 7? "Turma Aprovada!!": "Turma Reprovada!" );
		sc.close();
	}
}
