package classes;

public class Conta {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;
	public void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor  - 0.10;        
        }        
    }

	public void saca(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException(saldo);

		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
