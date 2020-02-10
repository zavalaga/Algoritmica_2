import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Animal[] animales = new Animal[10]; 
		Scanner read = new Scanner(System.in);
		
		int i, op=11;
		for (i=0; i<3; i++) {
			animales[i] = new Gato();
		}
		for (i=3; i<6; i++) {
			animales[i] = new Perro();
		}
		for (i=6; i<10; i++) {
			animales[i] = new Hombre();
		}
		System.out.println("Seleccione un animal: ( 0 para salir )");
		
		for (i=1; i<=3; i++) {
			System.out.println(i+". Gato "+i);
		}
		for (i=4; i<=6; i++) {
			System.out.println(i+". Perro "+(i-3));
		}		
		for (i=7; i<=10; i++) {
			System.out.println(i+". Hombre "+(i-6));
		}
		while (op !=0) {
			System.out.print("Opcion: ");
			op = read.nextInt();
			switch(op){
				case 1:  animales[0].hablar(); break;
				case 2:  animales[1].hablar(); break;
				case 3:  animales[2].hablar(); break;
				case 4:  animales[3].hablar(); break;
				case 5:  animales[4].hablar(); break;
				case 6:  animales[5].hablar(); break;
				case 7:  animales[6].hablar(); break;
				case 8:  animales[7].hablar(); break;
				case 9:  animales[8].hablar(); break;
				case 10: animales[9].hablar(); break;
				case 0: ; break;
				default: System.out.println("***OPCION NO VALIDA***");
			}
		}
			
	}

}
