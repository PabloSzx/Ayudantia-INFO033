import java.util.Scanner;

public class Persona2 {
  private String nombre;
  private String direccion;
  //Constructor
  public Persona2(String request) {
    Scanner teclado = new Scanner(System.in);
    System.out.print(request);
    this.nombre = teclado.nextLine();
  }

  //Getters y setters
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
}
