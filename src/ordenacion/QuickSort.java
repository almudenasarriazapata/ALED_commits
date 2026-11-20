package ordenacion;

import java.util.Arrays;

public class QuickSort {

	private static void swap (String[] datos, int i, int j) {
		if(i==j)
			return;
		String si = datos[i];
		String sj = datos[j];
		datos[i] = sj;
		datos[j]=si;
	}
	
	private static void sort(String[] datos,int a, int z) {
		if(z<=a)
			return;
		String pivot = datos[(a+z)/2];
		int izq = a;
		int der = z-1;
		while(izq<=der) {
			while(datos[izq].compareTo(pivot)<0)
				izq++;
			while(datos[der].compareTo(pivot)>0)
				der--;
			if(izq<=der)
				swap(datos,izq++,der--);
		}
		sort(datos,a,der+1);
		sort(datos,izq,z);
		
	}
	
	public static void sort(String[] datos) {
		sort(datos,0,datos.length);
	}
	
	public static void main(String[] args) {
		String[] nombres = {"Zoe", "Carlos", "Lucia", "Pedro", "Ana", "Sofia", "Miguel", "Elena", "David", "Beatriz"};
		sort(nombres);
		System.out.println(Arrays.toString(nombres));
	}

}
