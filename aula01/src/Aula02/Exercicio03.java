package Aula02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, media = 0;
		
		System.out.println("*** Média ***");
		System.out.print("1° Nota: ");
		nota1 = sc.nextDouble();
		System.out.print("2° Nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.printf("Media : %.1f ", media);
		
	sc.close();
	}
}
