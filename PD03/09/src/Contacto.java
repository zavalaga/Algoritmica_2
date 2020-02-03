public class Contacto {

  public String nombre;

  public String telefono;

  public String direccion;
  
  public Contacto (String nombre, String telefono, String direccion) {
	  this.nombre = nombre;
	  this.telefono = telefono;
	  this.direccion = direccion;
  }
  
  public String getNombre() {
	  return nombre;
  }
  public String getTelefono() {
	  return telefono;
  }  
  public String getDireccion() {
	  return direccion;
  }

}