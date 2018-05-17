package testes;
import classes.*;
public class TestaDeposita {
    public static void main(String[] args) throws ValorInvalidoException {
    	int agencia=0,numero=0;
        Conta cp = new Conta(agencia,numero);

        cp.deposita(-100);
    }

}
