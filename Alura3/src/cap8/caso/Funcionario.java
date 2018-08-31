package cap8.caso;

public class Funcionario {
	String nome;
	int idade;
	boolean estadoCivil;
	String telefone;
	String endereco;
	double salario;

	public void reajustarSalario() {
		salario += 100;
	}

	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSalario();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDados(String nome, int idade, String endereco, String telefone, double salario) {
		setNome(nome);
		setIdade(idade);
		setEndereco(endereco);
		setTelefone(telefone);
		setSalario(salario);
	}

	void mostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Salario: " + getSalario());
	}
}
