package Aula02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		System.out.printf("**Dia da semana** \n 1 - Domingo \n 2 - Segunda \n 3 - Terça \n 4 - Quarta \n 5 - Quinta \n 6 - Sexta \n 7 - Sabado \n Digite numero da semana: ");
		numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Dia Solicitado: Domingo");
			break;
		case 2:
			System.out.println("Dia Solicitado: Segunda");
			break;
		case 3:
			System.out.println("Dia Solicitado: Terça");
			break;
		case 4:
			System.out.println("Dia Solicitado: Quarta");
			break;
		case 5:
			System.out.println("Dia Solicitado: Quinta");
			break;
		case 6:
			System.out.println("Dia Solicitado: Sexta");
			break;
		case 7:
			System.out.println("Dia Solicitado: Sabado");
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
		sc.close();
	}
}
