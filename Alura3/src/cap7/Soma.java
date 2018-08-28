package cap7;

public class Soma {

	public static void main(String[] args) {
		double numeros = 0;
		for (String valores : args) {
			numeros += Double.parseDouble(valores);
		}
		System.out.println(numeros);
	}

}