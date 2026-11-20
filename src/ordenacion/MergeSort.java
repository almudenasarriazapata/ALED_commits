package ordenacion;
import java.util.*;

public class MergeSort {
    public void sort(String[] datos) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, datos);
        sort(list);
        list.toArray(datos);
    }

    private void sort(List<String> list) {
        if (list.size() < 2)
            return;

        int m = list.size() / 2;
        List<String> izq = new ArrayList<>(list.subList(0, m));
        List<String> der = new ArrayList<>(list.subList(m, list.size()));

        sort(izq);
        sort(der);

        list.clear();

        while (izq.size() > 0 && der.size() > 0) {
            String si = izq.get(0);
            String sd = der.get(0);

            if (si.compareTo(sd) > 0)
                list.add(izq.remove(0));
            else
                list.add(der.remove(0));
        }

        list.addAll(izq);
        list.addAll(der);
    }


	
	public static void main(String[] args) {
		List <String> izq = new ArrayList<>();
		List <String> list = new ArrayList<>();
		System.out.println(list);
		izq.add("Lol");
		izq.add("Lel");
		izq.add("Lul");
		izq.add("Lal");
		System.out.println(izq);
		list.add(izq.remove(0));
		System.out.println(list);
		System.out.println(izq);
		
	}
	

}
