
public class Main {
	public static void main (String [ ] args) {

		 double x = 1.0, y = 0.0, z = 2.0;
		 
		 boolean w = x * y < z / x || x / y > z * x && z * y < x && (++y < x || --z > y);
		 
		 System.out.print(w);

}
}
