import java.util.Scanner;
public class Ejercicio9 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 int n, n1=0, noriginal, digitos=1;
	     System.out.print("Ingrese un numero: ");
		 n = reader.nextInt();
		 noriginal=n;
	     while(n>9) {
	    	 n=n/10;
	    	 digitos++;
	     }
	     n=noriginal;
	     for(double i=0; i<digitos; i++) {
	    		 n1= n1 + n%10;
	    		 n=n/10;
	    	 }
	    	 System.out.print("La suma de digitos del numero ingresado es: "+n1);
	    
	}
}