package oct14;

public class UsaComplejidad {
	public static void main(String[] args) {
		Complejidad c = new Complejidad();
		String[] s = {"Hola", "Adiós", "No quiero estudiar"};
		System.out.println("La media del tamaño de mi puto array es: "+c.calculoLongMedia(s));
		System.out.println(s.length);
		for (int i = 0; i< s.length; i++) {
			System.out.println(s[i].length());
		}
	}
}

