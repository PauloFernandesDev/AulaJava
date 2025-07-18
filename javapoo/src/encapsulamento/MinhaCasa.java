package encapsulamento;

import java.util.Scanner;

public class MinhaCasa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pet animal = new  Pet();
		
		
		System.out.println("************* La da Adoção! *************");
		System.out.print("**Informe a Especie que deseja adotar: ");
		animal.setTipo(sc.next());
		System.out.print("**Informe Raça: ");
		animal.setRaça(sc.next());
		System.out.print("**Informe Nome:");
		animal.setNome(sc.next());
		System.out.print("**Informe Idade: ");
		animal.setIdade(sc.nextInt());
		System.out.println("*****************************************");
		System.out.println("\n** Informações do Animal **");
		System.out.printf("*Especie: %s \nRaça: %s \nNome: %s \nIdade: %d \n",animal.getTipo(),animal.getRaça(),animal.getNome(),animal.getIdade());
		
	sc.close();
	}
}
