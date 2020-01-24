import java.util.Scanner;
public class Ejercicio7 {
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
	     if(digitos%2==0) {
	    	 for(double i=0; i<digitos; i++) {
	    		 n1= n1 + n%10*(int)Math.pow(10, i);
	    		 n=n/10;
	    	 }
	     }
	     else {
	    	 for(int i=0; i<digitos; i++) {
	    		 n1=(int) (n1+n%10*Math.pow(10, i));
	    		 n=n/10;
	    	 }
	     }
	     if(n1==noriginal && digitos!=1) {
	    	 System.out.print("El numero ingresado es capicua.");
	     }
	     else {
	    	 System.out.print("El numero ingresado no es capicua.");
	     }
	}
}