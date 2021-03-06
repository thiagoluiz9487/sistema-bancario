package bankdigital;

public class Conta {
	
	private double saldo = 50;
	private int agencia;
	private String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("o valor depositado ? de "+ valor);
		System.out.println("seu saldo atual ? de " + saldo);
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("saque autorizado no valor de "+ valor);
			System.out.println("seu saldo atual ? de "+ saldo);
			return true;
		}else {
			System.out.println("saque n?o autorizado. valor atual menor que o valor solicitado");
			return false;
		}
	}
	public boolean transferir(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("transferencia autorizada no valor de "+ valor);
			System.out.println("seu saldo atual ? de "+ saldo);
			return true;
		}else {
			System.out.println("transferencia n?o realizada, saldo insuficiente!");
			return false;
		}
	}
	public double saldo() {
		return this.saldo;
	}
	public boolean debito(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("D?bito autom?tico autorizado no valor de: "+ valor);
			System.out.println("seu saldo atual ? de "+ saldo);
			return true;
		}else {
			System.out.println("D?bito autom?tico n?o autorizado por falta de saldo");
			return false;
		}
	}
}
