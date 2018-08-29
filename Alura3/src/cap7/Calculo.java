package cap7;

public class Calculo {
	static double somar(double... numeros) {
		double resultado = 0;
		for (double numero : numeros) {
			resultado += numero;
		}
		return resultado;
	}

}
