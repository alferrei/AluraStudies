
public class TestaExcecao {

	public static void main(String[] args) {
		System.out.println("inicio main");
		m1();
		System.out.println("Fim main");
	}

	private static void m1() {
		System.out.println("Inicio m1");
		try {
			m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problema!");
		}

		System.out.println("Fim m1");
	}

	private static void m2() {
		System.out.println("Inicio m2");
		int[] nums = new int[5];
		for (int i = 0; i < 6; i++) {
			nums[i] = i * 2;
			System.out.println(nums[i]);
		}
		System.out.println("Fim m2");

	}

}
