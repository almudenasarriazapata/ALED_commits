package oct14;

public class Complejidad {
	public double calculoLongMedia (String[] array) {
		int sumT = 0; 
		for (String s : array) 
			sumT+=s.length();
		return sumT/array.length;// no son del mismo tipo las variables, pero la conversión la ha hecho Java
	}
}
