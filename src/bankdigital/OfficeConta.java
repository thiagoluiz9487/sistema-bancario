package bankdigital;

public class OfficeConta {
	
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.deposita(0);
		minhaConta.sacar(0);
		minhaConta.transferir(0);
		minhaConta.debito(0);
		
		System.out.println(minhaConta.saldo());
		
	}		
}
