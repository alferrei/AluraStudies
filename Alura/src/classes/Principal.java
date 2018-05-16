package classes;

public class Principal {

	public static void main(String[] args) throws ValorInvalidoException {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.deposita(100.0);
		System.out.println(conta.getSaldo());
	}

}
