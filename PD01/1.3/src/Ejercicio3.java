import java.util.Scanner;
public class Ejercicio3 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short A, B, C;
		 System.out.println("Ingrese el valor A:");
		 A = reader.nextShort();
		 System.out.println("Ingrese el valor B:");
		 B = reader.nextShort();
		 C=A;
		 A=B;
		 B=C;
		 System.out.println ("El valor final de A es: "+A+"\nEl valor final de B es: "+B);
	}
}