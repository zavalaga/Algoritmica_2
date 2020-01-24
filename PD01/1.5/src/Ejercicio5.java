import java.util.Scanner;
public class Ejercicio5 {
	public static void main (String [ ] args) {
		 Scanner reader = new Scanner(System.in);
	     double radianes, tminutos, tsegundos;
	     int grados, minutos, segundos, num, den;
		 System.out.println("Ingrese el valor en pi radianes:\nNumerador:");
		 num = reader.nextInt();
		 System.out.println("Denominador:");
		 den = reader.nextInt();
		 radianes = (float)num/den;
		 tsegundos = radianes*648000;
		 tminutos = radianes*10800;
		 grados = (int)Math.floor(radianes*180);
		 minutos = (int) ((int)Math.floor(tminutos)-grados*60);
		 segundos = (int) ((int)Math.floor(tsegundos)-grados*60*60-minutos*60);
		 System.out.println ("El valor convertido al sistema sexagesimal es de:\n"+grados+" grados\n"+minutos+" minutos\n"+segundos+" segundos");
	}
}