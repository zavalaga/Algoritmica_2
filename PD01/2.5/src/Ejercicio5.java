import java.util.Scanner;
public class Ejercicio5 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     int m, n, q;
		 System.out.println("Ingrese el valor de M:");
		 m = reader.nextInt();
		 System.out.println("Ingrese el valor de N:");
		 n = reader.nextInt();
		 System.out.println("Ingrese el valor de Q:");
		 q = reader.nextInt();
		 if (m%n==0 && m%q==0) {
			 System.out.println("M es multiplo de N y Q. ");
		 }
		 else {
			 System.out.println("M no es multiplo de N y Q.");
		 }
		
	}
}