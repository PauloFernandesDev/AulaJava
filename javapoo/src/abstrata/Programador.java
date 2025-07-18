package abstrata;

public class Programador extends Funcionario implements Bonificavel {

	public Programador(String nome, double salarioBase) {
		super(nome, salarioBase);

	}

	@Override
	public double calcularBonus() {
		
		return salarioBase *= 0.1;
	}

	@Override
	public double calcularSalario(double bonus) {
		return salarioBase += bonus;
	}

}
