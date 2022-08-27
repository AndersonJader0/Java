
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		lista.add("LTP");
		lista.add("Web");
		lista.add("Algoritmo");

		for (int i = 0; i < lista.size(); i++) {
		    System.out.println(lista.get(i));
		}
	}
}