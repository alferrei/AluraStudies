package classes;

public class Principal {

	public static void main(String[] args) throws ValorInvalidoException {
		// TODO Auto-generated method stub
		int numero = 0;
		int agencia = 0;
		Conta conta = new Conta(agencia, numero);
		conta.deposita(100.0);
		System.out.println(conta.getSaldo());
	}

}
