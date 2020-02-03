		import java.util.Scanner;

public class Agenda {
	static Contacto[] contactos = new Contacto[5];
	public static Scanner read = new Scanner(System.in);

	public static void agregarContacto(int a) {
		String n, t, d;
		System.out.print("Nombre: ");
		n = read.nextLine();
		System.out.print("Telefono: ");
		t = read.nextLine();
		System.out.print("Direccion: ");
		d = read.nextLine();
		contactos[a] = new Contacto(n, t, d);
	}
	
	public static void borrarContacto() {
		System.out.print("Numero del contacto: ");
		int b = read.nextInt();
        if(contactos[b-1]!=null) {
    		contactos[b-1]=null; 
        } 
        else {
        	System.out.println("\n**CONTACTO VACIO**");
        }
	}
	
	public static void verContacto() {
		System.out.print("Numero del contacto: ");
        int c = read.nextInt()-1;
        if (contactos[c]!=null) {
        	System.out.println("\n"+contactos[c].getNombre());
        	System.out.println("Telefono: "+contactos[c].getTelefono());
        	System.out.println("Direccion: "+contactos[c].getDireccion());
        }
        else {
        	System.out.println("\n**CONTACTO VACIO**");
        }

	}
	

}
