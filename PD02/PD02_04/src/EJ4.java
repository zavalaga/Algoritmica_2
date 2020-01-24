import java.util.Scanner;
public class EJ4 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 String txt, vocals="aeiou";
	     System.out.print("Escriba una palabra o frase: ");
		 txt = reader.nextLine();
		 int countah=0;
		 for(int i=0;i<=txt.length()-1;i++) {
			 for(int j=0; j<=4;j++) {
				 if(txt.charAt(i)==vocals.charAt(j)) {
					 countah++;
				 } 
			 }
		 }
		System.out.print("Numero de vocales presentes en el texto: "+countah);
	}}