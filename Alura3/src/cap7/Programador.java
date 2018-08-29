package cap7;

public class Programador {
	private String nome, linguagem;
	private double salario;

	public Programador(String nome, String linguagem, double salario) {
		this.nome = nome;
		this.linguagem = linguagem;
		this.salario = salario;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Linguagem que programa " + linguagem);
		System.out.println("Salario: " + salario);
		System.out.println("----------------------------------------------");
	}

	public Programador() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
