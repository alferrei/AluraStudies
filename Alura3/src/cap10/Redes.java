package cap10;

public class Redes extends Curso implements Vendavel {

	String sistemaOperacional;

	public Redes() {
		// TODO Auto-generated constructor stub
	}

	public Redes (String nomeCurso, int cargaHoraria, String sistemaOperacional) {
		super(nomeCurso, cargaHoraria);
		setSistemaOperacional(sistemaOperacional);
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	@Override
	public double getPreco(int modalidade) {
		if (modalidade == 1) {
			return 620;
		}
		if (modalidade == 2) {
			return 1190;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Nome do curso: " + getNomeCurso() + "\nCarga Horaria: " + getCargaHoraria() + "\nSistema Operacional: "
				+ getSistemaOperacional() + "\n";
	}

}
