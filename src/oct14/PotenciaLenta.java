package oct14;

public class PotenciaLenta {
	static int potenciaLenta (int a, int b) {
		int p = 1;
		for (int i = 1; i <= b; i++) {
			p = p*a;
		}
		return p;
	}
	
	public static void main (String [] args) {
		System.out.println("3 elevado a 5 vale: " + potenciaLenta(3,5));
		System.out.println("3 elevado a 5 vale: " + potenciaLenta(2,10));
		System.out.println("3 elevado a 5 vale: " + potenciaLenta(4,7));
	}
	
}
