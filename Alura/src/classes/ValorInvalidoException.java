package classes;

public class ValorInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5002255536408743168L;

	public ValorInvalidoException(double valor) {
		super("Valor invalido: " +valor);
	}

}
