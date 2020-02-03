public class Pedido {

  public String tipoPago;
    
  public void genBoleta(Producto a, Producto b, Producto c, int q1, int q2, int q3, double tot) {
	if(q1+q2+q3!=0) {
	  System.out.print("PRODUCTO \\ PRECIO (unit.) \\ CANT. \\ PRECIO (total)\n");
	  if(q1!=0) {
		  System.out.print(a.getNombre()+" \\ "+a.getPrecio()+" \\ "+q1+" \\ "+q1*a.getPrecio()+"\n");
	  }
	  if(q2!=0) {
		  System.out.print(b.getNombre()+" \\ "+b.getPrecio()+" \\ "+q2+" \\ "+q2*b.getPrecio()+"\n");
	  }
	  if(q3!=0) {
		  System.out.print(c.getNombre()+" \\ "+c.getPrecio()+" \\ "+q3+" \\ "+q3*c.getPrecio()+"\n");
	  }
	  System.out.print("TOTAL A PAGAR :    S/."+tot+"\n");
	}
	else {
		System.out.print("**NO SE HA SELECCIONADO NINGUN PRODUCTO**");
	}
  }
  
  
  public void set_tipoPago(String tipoPago) {
      this.tipoPago = tipoPago;
  }
  
  public String get_tipoPago() {
	  return tipoPago;
  }

}