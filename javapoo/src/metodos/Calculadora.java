package metodos;

public class Calculadora {

	public static void main(String[] args) {
		CalcularMetodos calcularMetodos = new CalcularMetodos();
		
		int soma1 = calcularMetodos.soma(3, 10);
		int soma2 = calcularMetodos.soma(5, 8, 9);
		
		int diminuir1 = calcularMetodos.diminuir(3, 10);
		int diminuir2= calcularMetodos.diminuir(5, 8, 9);
		
		double dividir1 = calcularMetodos.dividir(3, 10);
		double dividir2 = calcularMetodos.dividir(5, 8, 9);
		
		int multiplicar1 = calcularMetodos.multiplicar(3, 10);
		int multiplicar2 = calcularMetodos.multiplicar(5, 8, 9);
		

		System.out.println(soma1);
		System.out.println(soma2);
		System.out.println(diminuir1);
		System.out.println(diminuir2);
		System.out.println(multiplicar1);
		System.out.println(multiplicar2);
		System.out.println(dividir1);
		System.out.println(dividir2);
	}

}
