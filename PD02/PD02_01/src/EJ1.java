import java.util.Scanner;
public class EJ1 {
	public static String concatenar(String txtUno, String txtDos, String txtTres) {   
		 String txt;
		 txt = txtUno+" "+txtDos+" "+txtTres;
		 return txt;
		 }
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 String txt1, txt2, txt3, txt;
	     System.out.print("Primera palabra: ");
		 txt1 = reader.nextLine();
		 System.out.print("Segunda palabra: ");
		 txt2 = reader.nextLine();
		 System.out.print("Tercera palabra: ");
		 txt3 = reader.nextLine();
	     txt=concatenar(txt1, txt2, txt3);
	     System.out.print("\nEl texto concatenado es: "+txt);
	    		 }
	     
	  
	}
