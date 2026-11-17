package complejidad;

import Viernes.Viernes;

public class Catalan2 {
	public static long catalan(long n) {
        return Viernes.factorial(2*n) /(Viernes.factorial(n+1) * Viernes.factorial(n));
    }
	
	public static void main (String[] args) {
		System.out.println(catalan(4));
		}
}
