
public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gael = new Gerente();
		gael.setNome("Gael Doido");
		gael.setSalario(200.0);
		gael.setCpf("325243543-0");
		gael.setSenha(1324);
		boolean autenticou = gael.autentica(1324);
		
		System.out.println(gael.getNome());
		System.out.println(gael.getCpf());
		System.out.println(gael.getSalario());
		
		System.out.println(autenticou);
	}

}
