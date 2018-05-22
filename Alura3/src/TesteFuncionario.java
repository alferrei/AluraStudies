
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario nicola = new Funcionario();
		nicola.setNome("Olha La Rapaz");
		nicola.setSalario(5300.90);
		
		System.out.println(nicola.getBonificacao());
		System.out.println(nicola.getNome());
	}

}
