import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Set<String> palabras = new HashSet<String>();
		String texto = read.nextLine();
		int posicion1 = texto.indexOf(" ");

		int posicion2 = 0;
		int count=0;
		palabras.add(texto.substring(0, posicion1));
		count++;
		while (texto.indexOf(" ", posicion1+1) > 0) {
			posicion2 = texto.indexOf(" ", posicion1+1);
			palabras.add(texto.substring(posicion1+1, posicion2));
			count++;
			posicion1 = posicion2;
		}
		posicion2 = posicion1;
		palabras.add(texto.substring(posicion2+1));
		count++;
		count = count-palabras.size();
			System.out.println("NUMERO DE PALABRAS REPETIDAS: "+count);
			System.out.print("CONJUNTO SIN PALABRAS REPETIDAS:\n"+
			palabras.toString() + " ");

    }
}