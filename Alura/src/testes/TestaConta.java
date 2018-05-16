package testes;
import classes.Conta;
import classes.SaldoInsuficienteException;
import classes.ValorInvalidoException;

public class TestaConta {

  public static void main(String[] args) throws ValorInvalidoException {

      Conta joao = new Conta();
      joao.deposita(50.0);
  try {
      joao.saca(100.0);
   } catch(SaldoInsuficienteException e) {
        System.out.println("Saldo est� insuficiente: " + e.getSaldoAtual());
   }

   catch(Exception e) {
        System.out.println("um outro erro qualquer!");
   }
        System.out.println(joao.getSaldo());
  }  
}