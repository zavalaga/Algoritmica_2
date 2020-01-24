import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short n1, n2;
		 System.out.println("Ingrese primer numero: ");
		 n1 = reader.nextShort();
		 System.out.println("Ingrese segundo numero: ");
		 n2 = reader.nextShort();
		 System.out.println("Los divisores en comun de ambos son:");
		 for (short i=1; i<n1 || i<n2; i++) {
			 if (n1%i==0 && n2%i==0) {
				 System.out.println(" "+i);
			 }
		 }
	}
}