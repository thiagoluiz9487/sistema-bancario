package bankdigital;

public class Conta {
	
	private double saldo = 50;
	private int agencia;
	private String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("o valor depositado é de "+ valor);
		System.out.println("seu saldo atual é de " + saldo);
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("saque autorizado no valor de "+ valor);
			System.out.println("seu saldo atual é de "+ saldo);
			return true;
		}else {
			System.out.println("saque não autorizado. valor atual menor que o valor solicitado");
			return false;
		}
	}
	public boolean transferir(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("transferencia autorizada no valor de "+ valor);
			System.out.println("seu saldo atual é de "+ saldo);
			return true;
		}else {
			System.out.println("transferencia não realizada, saldo insuficiente!");
			return false;
		}
	}
	public double saldo() {
		return this.saldo;
	}
	public boolean debito(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Débito automático autorizado no valor de: "+ valor);
			System.out.println("seu saldo atual é de "+ saldo);
			return true;
		}else {
			System.out.println("Débito automático não autorizado por falta de saldo");
			return false;
		}
	}
}
