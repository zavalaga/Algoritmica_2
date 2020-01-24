import java.util.Scanner;
public class Ejercicio4 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short año;
	     double residuo;
		 System.out.println("Ingrese el año a analizar:");
		 año = reader.nextShort();
		 residuo = año%4;
		 if (residuo>0) {
			 System.out.println("El año no es bisiesto.");
		 }
		 else {
			 System.out.println("El año es bisiesto.");
		 }
	}
}