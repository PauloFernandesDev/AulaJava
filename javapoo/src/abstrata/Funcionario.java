package abstrata;

public abstract class Funcionario {
 String nome;
 double salarioBase = 0 ;
 
  public Funcionario(String nome, double salarioBase) {
	this.nome = nome;
	this.salarioBase = salarioBase;
  }

  abstract double calcularSalario(double bonus);
  
}
