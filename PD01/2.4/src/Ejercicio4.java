import java.util.Scanner;
public class Ejercicio4 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short a�o;
	     double residuo;
		 System.out.println("Ingrese el a�o a analizar:");
		 a�o = reader.nextShort();
		 residuo = a�o%4;
		 if (residuo>0) {
			 System.out.println("El a�o no es bisiesto.");
		 }
		 else {
			 System.out.println("El a�o es bisiesto.");
		 }
	}
}