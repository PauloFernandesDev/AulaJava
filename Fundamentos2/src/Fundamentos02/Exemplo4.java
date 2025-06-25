package Fundamentos02;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int conjunto1[] = new int[4];
		int conjunto2[] = new int[4];
		int conjunto3[] = new int[4];
		int conjunto4[] = new int[4];
		
		for (int i = 0; i < conjunto1.length; i++) {
			System.out.printf("Digite o %d° valor do conjunto1: ",i+1);
			conjunto1[i] = sc.nextInt();
			System.out.printf("Digite o %d° valor do conjunto2: ",i+1);
			conjunto2[i] = sc.nextInt();
			System.out.printf("Digite o %d° valor do conjunto3: ",i+1);
			conjunto3[i] = sc.nextInt();
			System.out.printf("Digite o %d° valor do conjunto4: ",i+1);
			conjunto4[i] = sc.nextInt();			
		}
		
		System.out.println(Arrays.toString(conjunto1));
		System.out.println(Arrays.toString(conjunto2));
		System.out.println(Arrays.toString(conjunto3));
		System.out.println(Arrays.toString(conjunto4));
		sc.close();
	}
}
