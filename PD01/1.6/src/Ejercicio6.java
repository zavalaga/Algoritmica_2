import java.util.Scanner;
public class Ejercicio6 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     int primer, segundo, resultado;
		 System.out.println("Ingrese el dia y mes de su nacimiento en un solo numero (por ejemplo, 20 de julio seria 2007):");
		 primer = reader.nextInt();
		 System.out.println("Ingrese su edad:");
		 segundo = reader.nextInt();
		 resultado = (primer*2+5)*50+segundo-250;
		 System.out.println ("El resultado es: "+resultado);
	}
}