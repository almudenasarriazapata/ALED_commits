package ordenacion;

import java.util.Arrays;

public class Ordenacion {
	
	private static void swap (String[] datos, int i, int j) {
		if(i==j)
			return;
		String si = datos[i];
		String sj = datos[j];
		datos[i] = sj;
		datos[j]=si;
	}

	public static void main(String[] args) {
		String[] palabras= {"Lucas","Maria", "Paz","Almudena"};
		System.out.println(Arrays.toString(palabras));
		swap(palabras,3,2);
		System.out.println(Arrays.toString(palabras));

}
}
