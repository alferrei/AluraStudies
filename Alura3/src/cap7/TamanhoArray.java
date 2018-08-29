package cap7;

public class TamanhoArray {

	public static void main(String[] args) {
		int tamanho = 10;
		
		if (args.length!=0) {
			tamanho=Integer.parseInt(args[0]);
		}
		
		int [] arrayNumeros = new int[tamanho] ;
		for (int i = 0; i<arrayNumeros.length;i++) {
			arrayNumeros[i]=i*2;
			System.out.println(arrayNumeros[i]);
		}
	}
}
