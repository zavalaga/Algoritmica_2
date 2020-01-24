import java.util.Scanner;
public class Ejercicio4 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short x1, y1, x2, y2;
	     double distancia;
		 System.out.println("Ingrese el valor x1:");
		 x1 = reader.nextShort();
		 System.out.println("Ingrese el valor y1:");
		 y1 = reader.nextShort();
		 System.out.println("Ingrese el valor x2:");
		 x2 = reader.nextShort();
		 System.out.println("Ingrese el valor y2:");
		 y2 = reader.nextShort();
		 distancia = (double) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		 System.out.println ("La distancia entre el punto 1 y el punto 2 es de: "+distancia);
	}
}