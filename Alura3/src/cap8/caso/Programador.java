package cap8.caso;

public class Programador extends Funcionario {
	String linguagem;

	public Programador() {

		// TODO Auto-generated constructor stub
	}

	public void reajustarSalario() {
		salario += 300;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	void mostrarDados() {
		System.out.println("----------------------------------------");
		super.mostrarDados();
		System.out.println("Linguagem de Programação: " + getLinguagem());
	}

}
