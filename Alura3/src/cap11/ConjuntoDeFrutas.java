package cap11;

import java.util.*;

public class ConjuntoDeFrutas {

	private static final String FRUTAS[] = { "morango", "maça", "uva", "banana", "pera", "goiaba", "amora" };
	private static final String FRUTAS2[] = { "abacaxi", "limão", "graviola", "banana", "mamão", "goiaba" };

	public static void imprimirLista(Set<String> conjunto) {
		for (String fruta : conjunto)
			System.out.print(conjunto + " ");
		System.out.println("\nTotal de " + conjunto.size() + " frutas\n");
	}

	public static void convertMaiuscula(Set<String> conjunto) {
		for (String fruta : conjunto) {
			System.out.print(fruta.toUpperCase() + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Set<String> listaFrutas = new TreeSet<>(Arrays.asList(FRUTAS));
		Set<String> listaFrutas2 = new TreeSet<>(Arrays.asList(FRUTAS2));
		
		imprimirLista(listaFrutas);
		imprimirLista(listaFrutas2);
		
		System.out.println("Mostrando união das duas listas");
		listaFrutas.addAll(listaFrutas2);
		imprimirLista(listaFrutas);
		
		convertMaiuscula(listaFrutas);
	}

}
