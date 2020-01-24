import java.util.Scanner;
public class Ejercicio5 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 int n, digitos=1;
	     System.out.print("Ingrese un numero: ");
		 n = reader.nextInt();
	     while(n>9) {
	    	 n=n/10;
	    	 digitos++;
	     }
	     System.out.print("El numero de digitos es: "+digitos);
	}
}