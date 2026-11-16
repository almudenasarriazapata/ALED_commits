package complejidad;

import java.util.HashSet;
import java.util.Set;

public class Complejidad {

	public static boolean checkK(int [] datos, int k) {
		Set <Integer> numeros = new HashSet<>();
		for (int i= 0; i<datos.length; i++) {
			if(numeros.contains(k-datos[i]))
				return true;
			numeros.add(datos[i]);	
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int [] array = {1,2,3,6,5,11,8,-3};
		System.out.println("El array 'array' cumple checkK: " + checkK(array,11));
		System.out.println(checkK(array,11));
	}

}
