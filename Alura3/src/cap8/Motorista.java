package cap8;

public class Motorista extends Funcionario {
	int nrCnh;
	int tempoDeExperiencia;

	private void dirigir() {
		System.out.println("Dirigindo..");
	}

	public int getNrCnh() {
		return nrCnh;
	}

	public void setNrCnh(int nrCnh) {
		this.nrCnh = nrCnh;
	}

	public int getTempoDeExperiencia() {
		return tempoDeExperiencia;
	}

	public void setTempoDeExperiencia(int tempoDeExperiencia) {
		this.tempoDeExperiencia = tempoDeExperiencia;
	}
}
