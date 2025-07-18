package encapsulamento;

import java.util.Scanner;

public class TesteElementosFormula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo(10,9);
		
		System.out.println("Elementos de um Retangulo");
		System.out.printf("Base: %.2f \n",retangulo.getBase());
		System.out.printf("Altura: %.2f \n",retangulo.getAltura());
		System.out.printf("Area: %.2f \n",retangulo.calculeArea());
		System.out.printf("Comprimento: %.2f",retangulo.calculePerimetro());
		
		sc.close();
	}

}
