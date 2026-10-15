package oct14;

public class UsaArrays {

	
	public static void main(String[] args) throws Exception {
		sumaArrays suma = new sumaArrays();
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("El resultado de sumaArraysIterativo es: "+ suma.sumaArraysIterativo(array));
		System.out.println("El resultado de sumaArraysRecursivo es: "+ suma.sumaArraysRecursivo(array));
		System.out.println("No sé: "+ suma.aritmeticaRec(3,2.0,2.0));
	}

}
