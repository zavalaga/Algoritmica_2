import java.util.Scanner;
public class Ejercicio6 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     short l1, l2, l3;
		 System.out.println("Longitud 1:");
		 l1 = reader.nextShort();
		 System.out.println("Longitud 2:");
		 l2 = reader.nextShort();
		 System.out.println("Longitud 3:");
		 l3= reader.nextShort();
		 if(l1+l2>l3 && l1+l3>l2 && l2+l3>l1) {
			 System.out.println("Las longitudes pueden formar un triangulo.");
			 if(l1==l2 && l1==l3) {
				 System.out.println("El triangulo seria equilatero.");
			 }
			 else if(l1==l2 || l2==l3 || l1==l3) {
				 System.out.println("El triangulo seria isosceles.");
			 }
			 else {
				 System.out.println("El triangulo seria escaleno.");
			 }
		 }
		 else {
			 System.out.println("Las longitudes no pueden formar un triangulo.");
		 }
	}
}