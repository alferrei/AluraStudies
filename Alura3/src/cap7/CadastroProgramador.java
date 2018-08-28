package cap7;

public class CadastroProgramador {

	public static void main(String[] args) {
		Programador[] arrayProgramadores = { new Programador("Horacio", "PHP", 6250),
				new Programador("Lucia", "Java", 2222), new Programador("Gilberto", "C#", 5234) };
		
		for (Programador programador: arrayProgramadores) {
			programador.mostrarDados();
		}
	}
}
