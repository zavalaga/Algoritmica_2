import java.util.Scanner;
public class App {
	public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println ("Escriba una operacion (suma, resta, multiplicacion, division) separando los operandos mediante un espacio: (EJ: 1 + 1)");
        String operacion = read.nextLine(), N1, N2;
        char OP;
        int n1=0, n2=0, op, e1 = operacion.indexOf(' '), e2 = operacion.lastIndexOf(' '), resultado;
        boolean procede = true;
        N1 = operacion.substring(0, e1);
        try {
        n1 = Integer.parseInt(N1.trim());
        } catch (NumberFormatException e){
			System.out.println("Wrong Input: "+N1);
			procede = false;
		}
        N2 = operacion.substring(e2+1, operacion.length());
        try {
        n2 = Integer.parseInt(N2.trim());
        } catch (NumberFormatException e){
			System.out.println("Wrong Input: "+N2);
			procede = false;
		}
        if (procede) {
        OP = operacion.charAt(e1+1);
        op = (int)OP;
        switch (op) {
        case 43: resultado = n1+n2;
        System.out.println(operacion+" = "+resultado); break;
        case 45: resultado = n1-n2;
        System.out.println(operacion+" = "+resultado); break;
        case 42: resultado = n1*n2;
        System.out.println(operacion+" = "+resultado); break;
        case 47: resultado = n1/n2;
        System.out.println(operacion+" = "+resultado); break;
        }
        }
    
		
}
}
