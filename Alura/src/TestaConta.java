
public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta joao = new Conta();
		joao.deposita(50.0);

		if (joao.saca(30.0)) {
			System.out.println("Saque efetuado com sucesso");
		}

		System.out.println(joao.getSaldo());
	}

}
