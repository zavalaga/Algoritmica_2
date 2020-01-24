import java.util.Scanner;
public class EJ8 {
	public static void main (String [ ] args) {
		 Scanner reader1 = new Scanner(System.in);
		 Scanner reader2 = new Scanner(System.in);
		 int n;
	     System.out.print("Elementos a imprimir: ");
		 n = reader1.nextInt();
		 String txt[];
		 txt=new String[n];
		 for(int i=1;i<=n;i++) {
			 System.out.print("Ingresar elemento "+i+": ");
			 txt[i-1] = reader2.nextLine();
		 }
		 System.out.println("\nLos elementos del arreglo ingresado son: ");
		 for(int j=0;j<=n-1;j++) {
			 System.out.println(txt[j]);
		 }
	}}