package cap8;

public class Programador extends Funcionario{
	String linguagem;

	public Programador() {

		// TODO Auto-generated constructor stub
	}
	public void reajustarSalario() {
		salario+=300;
	}
	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

}
