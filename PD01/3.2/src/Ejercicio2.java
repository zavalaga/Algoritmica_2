import java.util.Scanner;
public class Ejercicio2 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     int n, div=2;
	     System.out.println("Introduce el número a factorizar: ");
	     n = reader.nextShort();
	     System.out.println("Los factores del numero ingresado son:");
	     while (n!=1) {
	    	 if(n%div==0) {
	    		 System.out.print(div+" ");
	    		 n=n/div;
	    	 }
	    	 else {
	    		 div=div+1;
	    	 }
	        }
	    }
}