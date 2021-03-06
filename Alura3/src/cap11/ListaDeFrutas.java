package cap11;

import java.util.*;

public class ListaDeFrutas {

	private static final String FRUTAS[] = { "morango", "ma�a", "uva", "banana", "pera", "goiaba", "amora" };
	private static final String FRUTAS2[] = { "abacaxi", "lim�o", "graviola", "banana", "mam�o", "goiaba" };

	public static void imprimirLista(List<String> lista) {
		for (String fruta : lista)
			System.out.print(fruta + " ");
		System.out.println("\nTotal de " + lista.size() + " frutas\n");
	}

	public static void convertMaiuscula(List<String> lista) {
		for (String fruta : lista) {
			System.out.println(fruta.toUpperCase() + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		List<String> listaFrutas = new ArrayList<>(Arrays.asList(FRUTAS));
		List<String> listaFrutas2 = new ArrayList<>(Arrays.asList(FRUTAS2));
		
		imprimirLista(listaFrutas);
		imprimirLista(listaFrutas2);
		
		System.out.println("Mostrando uni�o das duas listas");
		listaFrutas.addAll(listaFrutas2);
		imprimirLista(listaFrutas);
		
		convertMaiuscula(listaFrutas);
	}

}
