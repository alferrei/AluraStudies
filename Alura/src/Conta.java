
public class Conta {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;

	void deposita(double valor) {
		this.saldo += valor;

	}

	public void saca(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new RuntimeException("Saldo insuficiente");
		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
