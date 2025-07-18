package encapsulamento;

public class ContaBancaria {
	
	private String numeroConta;
	private double saldo = 0;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String numeroConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void DepositarValor(double valor) {
		if(valor > 0){
			this.saldo += valor;
			System.out.println("adicionado $" + valor + " na sua conta! \nSaldo atual: $" + this.saldo);

		}else {
			System.out.println("Digite valor positivo!");
		}
		
	}

	public void SacarValor(double valor) {
		if(this.saldo > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de $" + valor + " realizado \nSaldo atual da conta: $" + this.saldo);
		}else {
			System.out.println("Conta sem saldo ou saldo negativado ou valor de saque maior que o saldo, por favor realize um deposito");
		}
	}
}
