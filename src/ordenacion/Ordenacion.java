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

	public static void sort(String[] datos){
		boolean changed = false;
		do {
			changed =false;
			for(int i=0; i<datos.length-1;i++) {
				if(datos[i].compareTo(datos[i+1])>0) {
					swap(datos,i,i+1);
					changed = true;
				}
			}
			
		} while(changed);
	}	
	
	public static void main(String[] args) {
		String[] nombres= {"Lucas","Maria", "Paz","Almudena", "Mateo", "laura", "Ñu"};
		//System.out.println(Arrays.toString(nombres));
		//swap(nombres,3,2);
		//System.out.println(Arrays.toString(nombres));
		sort(nombres);
		System.out.println(Arrays.toString(nombres));
	
}
}
