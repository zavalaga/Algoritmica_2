import java.util.Scanner;
public class Ejercicio3 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 int n, cont=1;
	     System.out.print("Ingrese un numero: ");
		 n = reader.nextInt();
	     for(int i=1;i<n;i++) {
	    	 if(n%i==0) {
	    		 cont=cont+1;
	    	 }
	     }
	     if(cont<=2) {
             System.out.println("El numero es primo.");
         }
    	 else{
             System.out.println("El numero no es primo.");
         }
	}
}