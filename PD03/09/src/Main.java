import java.util.Scanner;

public class Main {
	
	public static Scanner read = new Scanner(System.in);

	public static void main (String [ ] args) {
		
		int pd = 4, nContactos = 0, limite = 5;
		Contacto c[];
		
		while (pd != 0 ) {
		pd = 4;
		System.out.print("\nSeleccione una operacion: / (0: finalizar)\n"
				+ "1. Agregar contacto.\n"
				+ "2. Borrar contacto.\n"
				+ "3. Ver contactos.\nOpcion: ");
		pd = read.nextInt();
		
		switch(pd) {
		case 1: if (nContactos<=limite) {
			Agenda.agregarContacto(nContactos);
			nContactos++;
		    }
		    else {
		    	System.out.print("**AGENDA LLENA**\n");
		    } break;
		case 2: Agenda.borrarContacto(); break;
		case 3: Agenda.verContacto(); break;
		
	
		
		}
	}
}
}
