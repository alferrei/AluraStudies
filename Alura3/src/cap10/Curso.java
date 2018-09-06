package cap10;

public class Curso {

	private String nomeCurso;
	private int cargaHoraria;

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Curso() {

	}

	public Curso(String nomeCurso, int cargaHoraria) {
		setNomeCurso(nomeCurso);
		setCargaHoraria(cargaHoraria);
	}

	public Curso(String nomeCurso) {
		setNomeCurso(nomeCurso);
	}

}
