import java.util.Scanner;
public class EJ10 {
	public static void main (String [ ] args) {
		 Scanner reader1 = new Scanner(System.in);
		 Scanner reader2 = new Scanner(System.in);
		 String user, pass;
	     System.out.print("Usuario: ");
	     user = reader2.nextLine();
	     user = user.replace('a','4');
	     user = user.replace('e','3');
	     user = user.replace('i','1');
	     user = user.replace('o','0');
	     user = user.replace('u','8');
	     user = user.replace('A','4');
	     user = user.replace('E','3');
	     user = user.replace('I','1');
	     user = user.replace('O','0');
	     user = user.replace('U','8');
		System.out.print("Contraseña: ");
	     pass = reader1.nextLine();
	     if(user.equals(pass)) {
	    	 System.out.print("\nUSUARIO VALIDADO. PRESIONE UN BOTON PARA CONTINUAR.");
	     }
	     else {
	    	 System.out.print("\nCONTRASENA INCORRECTA. INTENTE NUEVAMENTE.");
	     }
	}}