package Aula01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Positivo ou Negativo***");
		System.out.print("Informe o numero: ");
		numero = sc.nextInt();
		System.out.println(numero > 0 ? "Positivo" :numero == 0 ? "0":"Negativo");
		
		sc.close();
	}

}
