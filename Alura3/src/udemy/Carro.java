package udemy;

public class Carro {
	String modelo;
	String fabricante;
	int ano;
	String cor;
	int nrPortas;

	Carro() {
	}

	Carro(String fabricante, String modelo, String cor, int ano, int nrPortas) {
		setFabricante(fabricante);
		setAno(ano);
		setCor(cor);
		setModelo(modelo);
		setNrPortas(nrPortas);
	}

	Carro(String fabricante, int ano) {
		setFabricante(fabricante);
		setAno(ano);
	}

	Carro(String fabricante, String modelo, int ano) {
		setAno(ano);
		setFabricante(fabricante);
		setModelo(modelo);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNrPortas() {
		return nrPortas;
	}

	public void setNrPortas(int nrPortas) {
		this.nrPortas = nrPortas;
	}

	public void mostraCarro() {
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Numero de Portas: " + getNrPortas());
		System.out.println("Cor: " + getCor());
	}
	public void mostraMinimoCarro() {
		System.out.println(getFabricante()+" "+ getModelo()+" "+getCor()+" de "+ getAno()+ " acelerando hein!");
	}

	public void acelera() {
			for (int i = 5;i!=0;i--){
				System.out.println("Acelerando em "+ i + "...");
		}
		mostraMinimoCarro();	
		System.out.println("Vroooom...");
	}

}
