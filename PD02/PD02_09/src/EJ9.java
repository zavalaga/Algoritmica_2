import java.util.Scanner;
public class EJ9 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
		 String user, pass;
	     System.out.print("Usuario: ");
	     user = reader.nextLine();
	     user = user.replace('a','4');
	     user = user.replace('e','3');
	     user = user.replace('i','1');
	     user = user.replace('o','0');
	     user = user.replace('u','8');
		System.out.print("Contraseña: ");
	     pass = reader.nextLine();
	     if(user==pass) {
	    	 System.out.print("\nUSUARIO VALIDADO. PRESIONE UN BOTON PARA CONTINUAR.");
	     }
	     else {
	    	 System.out.print("\nCONTRASEÑA INCORRECTA. INTENTE NUEVAMENTE.");
	     }
	}}