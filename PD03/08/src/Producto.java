public class Producto {

  public String nombre;

  public double precio;

  public Integer stock;
  
  public Producto (String nombre, double precio, int stock) {
	  this.nombre = nombre;
	  this.precio = precio;
	  this.stock = stock;
  }
  
  public double getPrecio() {
	  return precio;
  }
  
  public int getStock () {
	  return stock;
  }

  public void actualizarStock(int cant) {
	  stock = stock-cant;  
  }
  
  public String getNombre() {
	  return nombre;
  }

}