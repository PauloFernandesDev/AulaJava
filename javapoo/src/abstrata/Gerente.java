package abstrata;

public class Gerente extends Funcionario implements Bonificavel {

	public Gerente(String nome, double salarioBase) {
		super(nome, salarioBase);

	}

	@Override
	public double calcularBonus() {
		return salarioBase * 0.2;
	}

	@Override
	public double calcularSalario(double bonus) {

		return salarioBase + bonus;
	}

}
