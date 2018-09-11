package cap10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class VariosExemplos {

	public VariosExemplos() {
	}

	public static void main(String[] args) {
		System.out.println("----------COM TREESET----------------------------------------");
		Set<String> cursos = new TreeSet<>();
		cursos.add("PHP");
		cursos.add("Java");
		cursos.add("C#");
		cursos.add("Delphi");
		cursos.add("PHP");
		cursos.add("Java");

		for (String curso : cursos) {
			System.out.println(cursos);
		}

		System.out.println("bbbbbbbbbbbbbbbbbbbbbb");
		System.out.println(cursos);

		System.out.println("----------COM HashSET----------------------------------------");
		Set<String> cursos1 = new HashSet<>();
		cursos1.add("PHP");
		cursos1.add("Java");
		cursos1.add("C#");
		cursos1.add("Delphi");
		cursos1.add("PHP");
		cursos1.add("Java");

		for (String curso : cursos1) {
			System.out.println(cursos1);
		}
		System.out.println("aaaaaaaaaa");
		System.out.println(cursos1);
		

		System.out.println("----------COM ArrayLiST----------------------------------------");
		List<String> cursos2 = new ArrayList<>();
		cursos2.add("PHP");
		cursos2.add("Java");
		cursos2.add("C#");
		cursos2.add("Delphi");
		cursos2.add("PHP");
		cursos2.add("Java");

		for (String curso : cursos2) {
			System.out.println("Curso: " + cursos2);
		}
		System.out.println("ccccccccccccccc");
		System.out.println(cursos2.get(4));

		System.out.println("----------COM HashMAP----------------------------------------");
		Map<String, String> cursos11 = new HashMap<>();
		cursos11.put("1", "PHP");
		cursos11.put("2", "Java");
		cursos11.put("3", "C#");
		cursos11.put("4", "Delphi");
		cursos11.put("5", "PHP");
		cursos11.put("6", "Java");

		for (String curso : cursos11.values()) {
			System.out.println(cursos11);
		}
		System.out.println("aaaaaaaaaa");
		System.out.println(cursos11);
		System.out.println(cursos11.get("4"));
	}

}
