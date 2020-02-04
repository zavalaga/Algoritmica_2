import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String txt;
		System.out.print("Ingrese el texto a convertir: ");
		txt = read.nextLine();
		for(int i=0; i<txt.length(); i++) {
			int ascii = txt.charAt(i);
			char ch1 = txt.charAt(i);
			if(ascii>=97 && ascii<=122){
				ascii = txt.charAt(i)-32;
				char ch2 = (char)ascii;
				txt = txt.replace(ch1,ch2);
			}	
			}
		System.out.print(txt);
		}

}
