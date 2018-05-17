package testes;

import classes.*;
import classes.SaldoInsuficienteException;
import classes.ValorInvalidoException;

public class TestaConta {

	public static void main(String[] args) throws ValorInvalidoException {
		int conta = 0, agencia = 0;
		Conta joao = new Conta(agencia, conta);
		joao.deposita(50.0);
		try {
			joao.saca(100.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		}

		catch (Exception e) {
			System.out.println("um outro erro qualquer!");
		}
		System.out.println(joao.getSaldo());
	}
}