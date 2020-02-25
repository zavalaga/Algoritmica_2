import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escriba palabras separadas por espacios: ");
		Scanner read = new Scanner (System.in);
		List<String> invertido = new ArrayList<String>();
		String texto = read.nextLine();
		int posicion1 = texto.lastIndexOf(" ");
		int posicion2 = texto.length();
		invertido.add(texto.substring(posicion1+1, texto.length()));
		while (texto.lastIndexOf(" ", posicion2) > 0) {
			posicion2 = texto.lastIndexOf(" ", posicion1-1);
			invertido.add(texto.substring(posicion2+1, posicion1));
			posicion1 = posicion2;
		}
			for (String txt : invertido) {
				System.out.print(txt+" ");
			}
    }
}