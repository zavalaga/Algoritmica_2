import java.util.Scanner;
public class EJ2 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 String txt, xtx="";
	     System.out.print("Ingrese el texto: ");
		 txt = reader.nextLine();
		 for(int i=txt.length()-1; i>=0; i--) {
			 xtx= xtx+txt.charAt(i);
		 }
	     System.out.print("El texto escrito al reves seria: "+xtx);
	  
	}
}
