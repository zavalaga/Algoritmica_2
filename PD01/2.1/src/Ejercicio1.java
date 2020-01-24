import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short n;
	     float nd;
		 System.out.println("Ingrese un numero:");
		 n = reader.nextShort();
		nd = (float) n%2;
		if (nd>0) {
			System.out.println("El numero ingresado es impar.");
		}
		else {
			System.out.println("El numero ingresado es par.");
		}
	}
}