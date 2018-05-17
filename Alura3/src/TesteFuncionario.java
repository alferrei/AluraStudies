
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncionarioTeste f1 = new FuncionarioTeste();
		f1.setNome("Nico Cachaça");
		f1.setCpf("234234888-9");
		f1.setSalario(3200.00);
		f1.setTipo(2);
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
		
	}

}
