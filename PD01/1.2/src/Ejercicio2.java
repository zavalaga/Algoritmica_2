import java.util.Scanner;
public class Ejercicio2 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short n;
	     int resultado=0;
		 System.out.println("Ingrese un numero: ");
		 n = reader.nextShort();
		 for(byte i=0; i<=n; i++) {	
			 resultado=resultado+(i*i*i);
		 }
		 System.out.println ("La suma de los cubos de los "+n+" primeros numeros naturales es: "+resultado);
	}
}