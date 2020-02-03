import java.util.Scanner;

public class Main {
	
	public static Scanner read = new Scanner(System.in);

	public static void main (String [ ] args) {
		
		Producto arroz = new Producto("Arroz", 2.50, 100);
		
		Producto azucar = new Producto("Azucar", 1.50, 200);
		
		Producto atun = new Producto("Atun", 5.50, 150);
		
		Pedido p = new Pedido();
		
		int ctd1 = 0, ctd2 = 0, ctd3 = 0, pd = 4, temp = 0, tp;
		
		String ef = "Efectivo", tar = "Tarjeta", chq = "Cheque";
		
		while (pd != 0 ) {
		pd = 4;
		System.out.print("\nSeleccione un producto: / (0: finalizar pedido)\n"
				+ "1. Arroz     - Stock: " +arroz.getStock()+"\n"
				+ "2. Azucar    - Stock: "+azucar.getStock()+"\n"
				+ "3. Atun      - Stock: "+atun.getStock()+"\nOpcion: ");
		pd = read.nextInt();
		
		if (pd!=0) {
		System.out.print("Cantidad: ");
		temp = read.nextInt();
		
		switch(pd) {
		case 1: ctd1 = ctd1 + temp;
			arroz.actualizarStock(temp); break;
		case 2: ctd2 = ctd2+temp; 
			azucar.actualizarStock(temp); break;
		case 3: ctd3 = ctd3+temp; 
			atun.actualizarStock(temp); break;
		}
		}
		}
		if(ctd1+ctd2+ctd3!=0) {
			System.out.println("");
			  double total = ctd1*arroz.getPrecio()+ctd2*azucar.getPrecio()+ctd3*atun.getPrecio();
			p.genBoleta(arroz, azucar, atun, ctd1, ctd2, ctd3, total);

		System.out.print("\nSeleccione metodo de pago: \n"
				+ "1. "+ef+"\n"
				+ "2. "+chq+"\n"
				+ "3. "+tar+"\nOpcion: ");
		tp = read.nextInt();
		
		switch(tp) {
		case 1: p.set_tipoPago(ef); break;
		case 2: p.set_tipoPago(chq); break;
		case 3: p.set_tipoPago(tar); break;
		}
		System.out.print("Se ha realizado el pago de S/."+total+" mediante "+p.get_tipoPago());
		}
		else {
			System.out.print("**NO SE HA SELECCIONADO NINGUN PRODUCTO. OPERACION FINALIZADA.**");
		}
	}
}
