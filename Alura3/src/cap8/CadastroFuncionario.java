package cap8;

public class CadastroFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Secretaria s = new Secretaria();
		Motorista m = new Motorista();
		Programador p = new Programador();
		
		f.setNome("Juão");
		f.setIdade(15);
		f.setSalario(2200);
		f.setEndereco("lugar nenhum, 141");
		f.reajustarSalario();

		s.setNome("Joana");
		s.setIdade(23);
		s.setSalario(2400);
		s.setEndereco("lugar nenhum, 141");
		s.reajustarSalario();
		System.out.println(s);
		m.setNome("Manel");
		m.setIdade(15);
		m.setSalario(2200);
		m.setEndereco("lugar nenhum, 141");
		m.reajustarSalario();
System.out.println("---------------------------------------------");
		System.out.println(m);
	}

}
