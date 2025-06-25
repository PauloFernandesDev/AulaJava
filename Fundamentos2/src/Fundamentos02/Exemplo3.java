package Fundamentos02;

public class Exemplo3 {

	public static void main(String[] args) {
		int multi3 = 0, multi5 = 0;
		
		
		for (int i = 1; i <= 20; i++) {		
			/*if(i % 3 == 0) {
				multi3 += i;
			}if ( i % 5 == 0) {
				multi5 += i;
			}*/
			multi3 += i % 3 == 0? i : 0;
			multi5 += i % 5 == 0? i : 0;		
		}
		System.out.printf("Soma multiplos de 3: %d \n",multi3);	
		System.out.printf("Soma multiplos de 5: %d \n",multi5);
		System.out.printf("Soma total dos multiplos: %d", multi3 + multi5);
	}

}
