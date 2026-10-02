package Viernes;

public class Viernes {

	//ejemplo de recursividad numero 40, así hasta que lo entienda 

	public static long factorial (int n) {
		if(n<=1) {
			return 1;
		}else {
			return n* factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("El factorial de 15 es: "+ factorial(15));
		}
//el fallo estaba en no poner long, un int se queda corto 
	
}
