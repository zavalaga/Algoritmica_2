import java.util.Scanner;
public class Ejercicio4 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 int n, suma=0;
	     System.out.print("Ingrese un numero: ");
		 n = reader.nextInt();
	     for(int i=1;i<n;i++) {
	    	 if(n%i==0) {
	    		suma=suma+i;
	    	 }
	     }
	     if(suma==n) {
             System.out.println("El numero es perfecto.");
         }
    	 else{
             System.out.println("El numero no es perfecto.");
         }
	}
}