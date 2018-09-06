package cap10;

public class VerificaVenda {

	public VerificaVenda() {
	}

	public static void main(String[] args) {
		JavaProgrammer cursoJava = new JavaProgrammer("Java Programmer", 40, "8.0");
		Redes cursoRedes = new Redes ("Redes", 40, "Linux");
		
		cursoInfo(cursoJava, 2);
		cursoInfo(cursoRedes, 2);
	}
	
	static void cursoInfo (Vendavel curso, int mod) {
		System.out.println("Escola: " + Vendavel.ESCOLA);
		System.out.println(curso + " custa: " + curso.getPreco(mod));
		System.out.println("------------------------------------------");
	}

}
