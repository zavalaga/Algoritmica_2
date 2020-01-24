import java.util.Scanner;
public class Ejercicio2 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short n1, n2;
	     int resultado;
		 System.out.println("Ingrese un numero: ");
		 n1 = reader.nextShort();
		 System.out.println("Ingrese otro numero: ");
		 n2 = reader.nextShort();
		 if (n1>=0 && n2>=0) {
			 resultado = n1*n2;
		 }
		 else {
			 resultado = n1+n2;
		 }
		System.out.println("El resultado es: "+resultado);
	}
}