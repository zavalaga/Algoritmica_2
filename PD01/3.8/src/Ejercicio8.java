import java.util.Scanner;
public class Ejercicio8 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 int n, noriginal, suma1=0, suma2=0, digitos=0, sumatot;
	     System.out.print("Ingrese un numero: ");
		 n = reader.nextInt();
		 noriginal=n;
	     while(n>9) {
	    	 n=n/10;
	    	 digitos++;
	     }
	     if(digitos%2==0) {
	    	 for (int i=1; i<=n/2; i++) {
	    		 suma1=suma1+i;
	    	 }
	    	 for (int j=1; j<=n/2; j++) {
	    		 suma2=suma2+j*2;
	    	 }
	    	 sumatot=suma1+suma2;
	    	 System.out.print("La sumatoria de la serie de "+noriginal+" terminos es: "+sumatot);
	     }
	     else {
	    	 for (int i=1; i<=(n+1)/2; i++) {
	    		 suma1=suma1+i;
	    	 }
	    	 for (int j=1; j<=(n-1)/2; j++) {
	    		 suma2=suma2+j*2;
	    	 }
	    	 sumatot=suma1+suma2;
	    	 System.out.print("La sumatoria de la serie de "+noriginal+" terminos es: "+sumatot);
	     }
	     
	}
}