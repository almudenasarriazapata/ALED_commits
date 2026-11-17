package complejidad;

import Viernes.Viernes;

public class Catalan extends Viernes{
	public static long catalan (long n) {
		return factorial(2*n)/(factorial(n+1)*factorial(n));
	}
	public static void main(String[] args) {
	
		
		System.out.println(catalan (9));
	}

}
