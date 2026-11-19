package Viernes;


public class Viernes {

	//ejemplo de recursividad numero 40, así hasta que lo entienda 

	public static long factorial (long n) {
		if(n<=1) {
			return 1;
		}else {
			return n* factorial(n-1);
		}
	}
	
	public static int sumaArray (int[] array) throws Exception{
		if (array==null||array.length==0)
			throw new Exception();
		return sumaArrayRecursivo(array,0);
	}
	
	private static int sumaArrayRecursivo (int[] array, int indice) {
		if(indice ==array.length)
			return 0;
		return array[indice]+sumaArrayRecursivo(array,indice+1);

	}
	
	
	public static void main(String[] args) throws Exception {
		int[] array = {2,4,6,8,10,12,14,16,18,20};
		System.out.println("El factorial de 15 es: "+ factorial(15));
		System.out.println(sumaArray(array));
		
		}
//el fallo estaba en no poner long, un int se queda corto 
	

	
	
}
