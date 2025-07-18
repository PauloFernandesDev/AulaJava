package encapsulamento;

public class Retangulo {
	
	private double base, altura;

	
	public Retangulo() {
		
	}
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calculeArea() {
		double area = base * altura;
		return area;
	}
	
	public double calculePerimetro() {
		double perimetro = 2*(base + altura);
		return perimetro;
	}

}
