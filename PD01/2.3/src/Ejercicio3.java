import java.util.Scanner;
public class Ejercicio3 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short A, B, C, D;
		 System.out.println("Ingrese el primer valor:");
		 A = reader.nextShort();
		 System.out.println("Ingrese el segundo valor:");
		 B = reader.nextShort();
		 System.out.println("Ingrese el tercer valor:");
		 C = reader.nextShort();
		 if (A>B && A<C || A<B && A>C) {
			 System.out.println ("El valor intermedio es: "+A);
		 }
		 else if (B>A && B<C || B<A && B>C) {
			 System.out.println ("El valor intermedio es: "+B);
		 }
		 else if (C>A && C<B || C<A && C>B) {
			 System.out.println ("El valor intermedio es: "+C);
		 }
		 else {
			 System.out.println("No existe valor intermedio.");
		 }
	}
}