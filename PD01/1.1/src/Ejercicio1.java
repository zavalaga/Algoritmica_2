import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short radio1, altura1;
	     double area;
		 System.out.println("Ingrese radio del cilindro: ");
		 radio1 = reader.nextShort();
		 System.out.println("Ingrese altura del cilindro: ");
		 altura1 = reader.nextShort();
		 area = 2*3.14*radio1*altura1+2*3.14*radio1*radio1 ;
		 System.out.println ("El area del cilindro es: "+ area);
	}
}