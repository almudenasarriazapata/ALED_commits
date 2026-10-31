package busquedaBinaria;

public class BusquedaBinaria {
	
	    public static void main(String[] args) {

	        int[] numeros = {2, 5, 8, 12, 15, 20, 25};

	        int buscado = 15;
	        int inicio = 0;
	        int fin = numeros.length - 1;

	        while (inicio <= fin) {

	            int medio = (inicio + fin) / 2;

	            if (numeros[medio] == buscado) {
	                System.out.println("Encontrado en " + medio);
	                break;

	            } else if (numeros[medio] < buscado) {
	                inicio = medio + 1;
	            } else {
	                fin = medio - 1;
	            }
	        }
	    }
	}
	


