package oct14;

public class PotenciaLenta {
	static int potenciaLenta (int a, int b) {
		int p = 1;
		for (int i = 1; i <= b; i++)
			p*=a;
		return p;
	}
	
	static int potenciaOptimizada (int a, int b) {
		if (b==0)
			return 1;
		else if(b%2==0)
			return potenciaOptimizada(a*a, b/2);
		else
			return a*potenciaOptimizada(a*a,(b-1)/2);
	}
	
	public static void main (String [] args) {
		System.out.println("3 elevado a 5 vale: " + potenciaLenta(3,5));
		System.out.println("2 elevado 10 vale: " + potenciaLenta(2,10));
		System.out.println("4 elevado a 7 vale: " + potenciaLenta(4,7));
		System.out.println("3 elevado a 5 vale (Optim): " + potenciaOptimizada(3,5));
	}
	
}
