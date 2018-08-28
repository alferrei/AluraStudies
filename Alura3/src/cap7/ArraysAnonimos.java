package cap7;

public class ArraysAnonimos {

	static double somar(double a, double b, double c) {
		return a + b + c;
	}

	static double somar(double[] numeros) {
		double resultado = 0;
		for (double d : numeros) {
			resultado += d;
		}
		return resultado;
	}

	public static void main(String[] args) {

		double resultado = somar(new double[] { 2, 10, 4, 3 });
		System.out.println("Primeiro resultado: " + resultado);
		System.out.println("Segundo resultado: " + somar(5, 7, 6));
		System.out.println("outra possibilidade: " + somar(new double[] { 20, 10, 40, 30 }));
	}

}
