import java.util.Scanner;
public class Ejercicio10 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 int n, suma=0, sumandos=1;
	     System.out.print("Ingrese un numero: ");
		 n = reader.nextInt();
	     for(int i=1; i<=n; i++) {
	    		 if(i%2!=0) {
	    			 suma=suma+i;
	    			 sumandos++;
	    		 }
	     }
	   System.out.println("La suma de impares entre 1 y "+n+" es: "+suma);
	   System.out.print("La suma de impares tiene "+sumandos+" sumandos.");
	    
	}
}