package ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class FraseCelebre implements Comparable<FraseCelebre> {
	
	private int anio;
	private String autor; 
	private String frase;
	
	public FraseCelebre(int anio, String autor, String frase) {
		this.anio= anio;
		this.autor= autor;
		this.frase = frase;
	}
	
	@Override
	public int compareTo(FraseCelebre otraFrase) {
		int diferenciaAnios = this.anio - otraFrase.anio;
		if(diferenciaAnios!=0)
			return -diferenciaAnios;
		else
			return this.autor.compareTo(otraFrase.autor);
	}
	
	public String getFrase() {
	    return frase;
	}
	
	public static void main(String[] args) {
		ArrayList<FraseCelebre> frases = new ArrayList<>();
		frases.add(new FraseCelebre(1950, "Rosa Sparks", "No quiero estudiar MÁS"));
		frases.add(new FraseCelebre(1990, "Pedro Picapiedra", "TENGO MIEDO"));
		frases.add(new FraseCelebre(1870, "Snoopy", "Quien tiene un amigo, tiene un tesoro"));
		frases.add(new FraseCelebre(1452, "Barbie", "Tú puedes ser lo que quieras"));
		Collections.sort(frases);
		for(FraseCelebre frase : frases) {
			System.out.println(frase.getFrase());
		}
	}
	

}
