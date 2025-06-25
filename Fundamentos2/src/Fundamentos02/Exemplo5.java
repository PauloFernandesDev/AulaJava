package Fundamentos02;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notas[] = new double[5],soma = 0, media = 0;
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Adicione a do %d° Aluno:", i +1);
			notas[i] = sc.nextDouble();
		}

		for (double nota : notas) {
			soma += nota;
		}
		media = soma / notas.length;
		System.out.printf("Média da turma: %.2f ", media);
		sc.close();
	}
}
