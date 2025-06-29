package Aula02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char r1,r2,r3,r4,r5;
	String vitima;
	int contador = 0;
	
	System.out.println("Telefonou para a vitima? \n [S] Sim / [N]Não");
	r1 = Character.toLowerCase(sc.next().charAt(0));
	contador = r1 == 's'? ++contador:contador;
	System.out.println("Esteve no local do crime? \n [S] Sim / [N]Não");
	r2 = Character.toLowerCase(sc.next().charAt(0));
	contador = r2 == 's'? ++contador:contador;
	System.out.println("Mora perto da vítima? \n [S] Sim / [N]Não");
	r3 = Character.toLowerCase(sc.next().charAt(0));
	contador = r3 == 's'? ++contador:contador;
	System.out.println("Devia para a vítima? \n [S] Sim / [N]Não");
	r4 = Character.toLowerCase(sc.next().charAt(0));
	contador = r4 == 's'? ++contador:contador;
	System.out.println("Ja trabalhou com a vítima? \n [S] Sim / [N]Não");
	r5 = Character.toLowerCase(sc.next().charAt(0));
	contador = r5 == 's'? ++contador:contador;
	
	vitima = contador == 0 || contador == 1 ? "Inocente": contador == 2 ? "Suspeito" : contador >= 3 && contador <= 4 ? "Cumplice" : "Assassino";
	
	System.out.println("***Tabela de Classificação***");
	System.out.println("0 Questões positivas = Inocente");
	System.out.println("2 Questões positivas = Suspeito");
	System.out.println("3 a 4 Questões positivas = Cúmplice");
	System.out.println("5  Questões positivas = Assassino \n");
	System.out.printf("Resposta: %d \n", contador);
	System.out.printf("A vítima é %s \n", vitima);
	
	sc.close();
	}
}
