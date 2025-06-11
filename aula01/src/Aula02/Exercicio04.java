package Aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resposta;
		System.out.println("Digite [M] Masculino / [F] Feminino: ");
		char opcao = Character.toUpperCase(sc.next().charAt(0)) ;

		
		if(opcao == 'M') {
			resposta =  "Masculino";
		}else if (opcao == 'F') {
			resposta = "Feminino";			
		}else {
			resposta = "Opção inválida!";
		}
		System.out.println(resposta);
		sc.close();
		
	}

}
