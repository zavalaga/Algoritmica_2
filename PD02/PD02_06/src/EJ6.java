import java.util.Scanner;
public class EJ6 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 String txt;
		 char space=' ';
	     System.out.print("Escriba una frase o texto: ");
		 txt = reader.nextLine();
		 int countah=1;
		 for(int i=0;i<=txt.length()-1;i++) {
			 if(txt.charAt(i)==space) {
				 countah++;
			 }
		 }
		System.out.print("Numero de palabras en el texto: "+countah);
	}}