package ordenacion;

public class Resultado {
	byte[] patron;
	int posicion;
	
	public Resultado[] sort (Resultado [] resultados) {
		boolean changed=false;
		do {
			changed = false;
			for(int i=0; i<resultados.length-1;i++)
				if(resultados[i].compareTo(resultados[i+1])>0) {
					swap(resultados,i,i+1);
					changed=true;
				}
					
		}
		while (changed);
		return resultados;
	} 
	
	private void swap(Resultado[] resultados, int i, int j) {
		if(i==j)
			return;
		Resultado ri = resultados[i];
		Resultado rj = resultados[j];
		resultados[i]=rj;
		resultados[j]=ri;
	}

	public static void main(String[] args) {

	}

}
