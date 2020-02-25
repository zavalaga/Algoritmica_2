import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Set<String> A = new HashSet<String>();
		Set<String> B = new HashSet<String>();
		Set<String> C = new HashSet<String>();
		Set<String> temp = new HashSet<String>();
		
		System.out.print("Ingrese elementos, en orden ascendente y separados por espacios para los siguientes conjuntos: "+
		"\nA: ");
		String texto = read.nextLine();
		int posicion1 = texto.indexOf(" ");
		int posicion2 = 0;
		A.add(texto.substring(0, posicion1));
		temp.add(texto.substring(0, posicion1));
		while (texto.indexOf(" ", posicion1+1) > 0) {
			posicion2 = texto.indexOf(" ", posicion1+1);
			A.add(texto.substring(posicion1+1, posicion2));
			temp.add(texto.substring(posicion1+1, posicion2));
			posicion1 = posicion2;
		}
		posicion2 = posicion1;
		A.add(texto.substring(posicion2+1));
		temp.add(texto.substring(posicion2+1));
		
		System.out.print("B: ");
		texto = read.nextLine();
		posicion1 = texto.indexOf(" ");
		posicion2 = 0;
		B.add(texto.substring(0, posicion1));
		temp.add(texto.substring(0, posicion1));
		while (texto.indexOf(" ", posicion1+1) > 0) {
			posicion2 = texto.indexOf(" ", posicion1+1);
			B.add(texto.substring(posicion1+1, posicion2));
			temp.add(texto.substring(posicion1+1, posicion2));
			posicion1 = posicion2;
		}
		posicion2 = posicion1;
		B.add(texto.substring(posicion2+1));
		temp.add(texto.substring(posicion2+1));

		String t1 = "", t2 = "";
		for (int i = 0; i < temp.size()-1; i++) {
			boolean menor = false;
			for (int j = i+1; j < temp.size(); j++) {
				t1 = String.valueOf(temp.toArray()[i]);
				t2 = String.valueOf(temp.toArray()[j]);
				if(Integer.parseInt(t1)<Integer.parseInt(t2)) {
					menor = true;
				}
				else {
					menor = false;
					C.remove(t1);
					C.add(t2);
					temp.remove(t2);
					i = 0;
				}
			}
			if (menor) {				
			    C.add(t1);
			    temp.remove(t1);
			    i = -1;
			}
			t1 = String.valueOf(temp.toArray()[0]);
		}
		
		C.add(t1);
		
		System.out.print("A U B = ");
		System.out.println(C.toString() + " ");
		System.out.print("\n***PARA NUMEROS DE MAS DE UNA CIFRA EL ARREGLO PUEDE HABERLOS ORDENADO DE OTRA MANERA AUTOMATICAMENTE***");



    }
}