import java.util.Scanner;
public class Ejercicio6 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 int n, noriginal, digitos=1, d_pares=0;
	     System.out.print("Ingrese un numero: ");
		 n = reader.nextInt();
		 noriginal=n;
	     while(n>9) {
	    	 n=n/10;
	    	 digitos++;
	     }
	     for(int i=1; i<digitos; i++) {
	    	 if((n%10)%2==0) {
	    		 d_pares++;
	    	 }
	    	 n=n/10;
	     }
	     System.out.print("El numero ingresado presenta "+d_pares+" digito(s) pare(s).");
	}
}