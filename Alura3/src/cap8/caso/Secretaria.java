package cap8.caso;

public class Secretaria extends Funcionario {
	int nrSrt;
	boolean linguaInglesa;

	public int getNrSrt() {
		return nrSrt;
	}

	public void setNrSrt(int nrSrt) {
		this.nrSrt = nrSrt;
	}

	public boolean isLinguaInglesa() {
		return linguaInglesa;
	}

	public void setLinguaInglesa(boolean linguaInglesa) {
		this.linguaInglesa = linguaInglesa;
	}

	private void atenderTelefone() {
		System.out.println("Atendendo o telefone");
	}
}
