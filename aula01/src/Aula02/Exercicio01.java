package Aula02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor1 = 0, valor2 = 0, valor3 = 0;

		
		System.out.print("Informe o 1° valor:");
		valor1 = sc.nextInt();
		System.out.print("Informe o 2° valor:");
		valor2 = sc.nextInt();
		System.out.print("Informe o 3° valor:");
		valor3 = sc.nextInt();
		
		 //Usando if e else :
		 if(valor1 > valor2 && valor1 > valor3) {
			System.out.println("valor: " + valor1 + " é o maior valor!");
		}else if (valor2 > valor3) {
				System.out.println("valor: " + valor2 + " é o maior valor!");
			}else {	
				System.out.println("valor: " + valor3 + " é o maior valor!");
				
			}
		 //Usando o math.max();
		 int maior = Math.max(valor1, Math.max(valor2, valor3));
		 System.out.printf("maior valor: %d \n",maior);
					
		//Usando operador Ternário 
		int resposta =  valor1 > valor2 && valor1 > valor3 ? valor1 : valor2 > valor3 ? valor2 : valor3;
		
		System.out.printf("Valor %d é o maior valor", resposta);
		sc.close();
	}
}
