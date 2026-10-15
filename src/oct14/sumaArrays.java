package oct14;

public class sumaArrays {
	
	public int sumaArraysIterativo(int[] array) throws Exception{
		if (array == null || array.length == 0)
			throw new Exception ();
		int suma = 0; 
		for(int i = 0; i<array.length; i++)
			suma+= array[i];
		return suma;
		
	}

	public int sumaArraysRecursivo(int [] array) throws Exception{
		if (array == null || array.length == 0)
			throw new Exception ();
		return sumaArraysRecursivo(array,0);
	}
	private int sumaArraysRecursivo (int [] array, int n) {
		if (n == array.length-1)
			return array[n];
		return array[n]+sumaArraysRecursivo(array, n+1);
	
	}
	
	public double aritmeticaRec (int n, double d, double a0 ) throws Exception{
		if (n<0)
			throw new Exception("El número n debe ser natural o 0");
		if (n == 0)
			return a0;
		return d*n + a0 + aritmeticaRec(n-1, d, a0);
		
	}
}
