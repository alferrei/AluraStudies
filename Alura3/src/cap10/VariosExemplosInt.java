package cap10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class VariosExemplosInt {

	public VariosExemplosInt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("----------COM TREESET----------------------------------------");
		Set<Integer> cursos = new TreeSet<>();
		cursos.add(1);
		cursos.add(2);
		cursos.add(3);
		cursos.add(4);
		cursos.add(1);
		cursos.add(2);

		for (Integer curso : cursos) {
			System.out.println(cursos);
		}

		System.out.println("bbbbbbbbbbbbbbbbbbbbbb");
		System.out.println(cursos);

		System.out.println("----------COM HashSET----------------------------------------");
		Set<Integer> cursos1 = new HashSet<>();
		cursos1.add(1);
		cursos1.add(2);
		cursos1.add(3);
		cursos1.add(4);
		cursos1.add(1);
		cursos1.add(2);

		for (Integer curso : cursos1) {
			System.out.println(cursos1);
		}
		System.out.println("aaaaaaaaaa");
		System.out.println(cursos1);

		System.out.println("----------COM ArrayLiST----------------------------------------");
		List<Integer> cursos2 = new ArrayList<>();
		cursos2.add(1);
		cursos2.add(2);
		cursos2.add(3);
		cursos2.add(4);
		cursos2.add(2);
		cursos2.add(1);

		for (Integer curso : cursos2) {
			System.out.println("Curso: " + cursos2);
		}
		System.out.println("ccccccccccccccc");
		System.out.println(cursos2.get(4));

		System.out.println("----------COM HashMAP----------------------------------------");
		Map<String, Integer> cursos11 = new HashMap<>();
		cursos11.put("a", 1);
		cursos11.put("b", 2);
		cursos11.put("c", 3);
		cursos11.put("d", 4);
		cursos11.put("e", 2);
		cursos11.put("f", 1);

		for (Integer curso : cursos11.values()) {
			System.out.println(cursos11);
		}
		System.out.println("ddddddddddddddddddddddd");
		System.out.println(cursos11);
		System.out.println(cursos11.get("d"));
		// TODO Auto-generated method stub

	}

}
