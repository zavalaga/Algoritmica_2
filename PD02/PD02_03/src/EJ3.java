import java.util.Scanner;
public class EJ3 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 String txt;
		 boolean palindromo=true;
	     System.out.print("Escriba una palabra o frase: ");
		 txt = reader.nextLine();
		 int length=txt.length();
		 if(txt.length()%2==0) {
			 for(int i=0; i<length/2; i++) {
				if(txt.charAt(i)==txt.charAt(length-i-1)) {
					palindromo=true;
				}
				else {
					palindromo=false;
				}
			 }	 
		 }
		 else {
			 for(int i=0; i<length-1/2; i++) {
					if(txt.charAt(i)==txt.charAt(length-i-1)) {
						palindromo=true;
					}
					else {
						palindromo=false;
					}
				 }
		 }
		if(palindromo==true) {
			System.out.print("El texto ingresado es palindromo.");
		}
		else {
			System.out.print("El texto ingresado no es palindromo.");
		}
		 }
	}