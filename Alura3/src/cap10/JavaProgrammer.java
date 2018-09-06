package cap10;

public class JavaProgrammer extends Curso implements Vendavel {

	String versao;

	public JavaProgrammer() {
		// TODO Auto-generated constructor stub
	}

	public JavaProgrammer(String nomeCurso, int cargaHoraria, String versao) {
		super(nomeCurso, cargaHoraria);
		setVersao(versao);
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	@Override
	public String toString() {
		return "Nome do curso: " + getNomeCurso() + "\nCarga Horaria: " + getCargaHoraria() + "\nVersão da Linguagem: "
				+ getVersao() + "\n";
	}

	@Override
	public double getPreco(int modalidade) {
		if (modalidade == 1) {
			return 780;
		}
		if (modalidade == 2) {
			return 1320;
		}
		return 0;
	}

}
