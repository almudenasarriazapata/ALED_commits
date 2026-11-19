package complejidad;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
	
	public static int mayoria1 (int[] v) throws Exception{
		if (v==null||v.length==0)
			throw new Exception();
		int numeroMasRepetido = v[0];
		int maximasRepeticiones = 1;
		for(int i=0; i<v.length;i++) {
			int numRep = 0;
			for (int j = 0; j<v.length;j++)
				if (v[j]==v[i]) 
					numRep++;
			if(numRep>maximasRepeticiones) {
				maximasRepeticiones= numRep;
				numeroMasRepetido= v[i];
			}
		}
		return numeroMasRepetido;
	}
	
	public static int mayoria2 (int[] v) throws Exception{
		if (v==null||v.length==0)
			throw new Exception();
		Map<Integer,Integer> histograma = new HashMap<>();
		int masRep = v[0];
		int maximasRepeticiones = 1;
		Integer numRep;
		for (int i=0;i<v.length;i++) {
			if(histograma.containsKey(v[i])) {
				numRep = histograma.get(v[i]);//devuelve el value de la key v[i]
				histograma.put(v[i],++numRep);
			}
			else {
				numRep =1;
				histograma.put(v[i], numRep);
			}
			if(numRep>maximasRepeticiones) {
				maximasRepeticiones=numRep;
				masRep=v[i];
			}
		}
		return masRep;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		int [] array = {1,3,3,6,5,3,8,-3,1,4,5,5,5,5,5,5,2,121,2,2,6};
		System.out.println(checkK(array,11));
		//System.out.println(mayoria1(array));
		System.out.println(mayoria2(array));
	}

}
