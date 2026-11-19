package busquedaBinaria;

public class Perfecto {
	
	private static int sumaPerfecto1(int perf) {
		
	     int sum = 0;
	     for (int i = 1; i < perf; i++) {
	         if (perf % i == 0)
	             sum += i;
	        }

	        return sum;
	    }

	    public static boolean esPerfecto1(int perf) {
	    	
	        return perf > 1 && perf == sumaPerfecto1(perf);
	        
	    }
	    
	    private static int sumaPerfecto(int perf) {
	    	return sumaPerfectoRec(perf,1);
	    }
	    
	    private static int sumaPerfectoRec(int perf, int i) {
	    	if(i==perf)
	    		return 0;
	    	if(perf%i!=0)
	    		return sumaPerfectoRec(perf,i+1);
	    	return i+sumaPerfectoRec(perf,i+1);
	    }
	    
	    

	    public static void main(String[] args) {
		 
	    	//int N= 1000000000;
	      //  for (int i = 0; i < N; i++) {
	          //  if (esPerfecto1(i))
	              //  System.out.println(i);  
	       // }
	        
	        System.out.println(sumaPerfecto(28));

	}

}
