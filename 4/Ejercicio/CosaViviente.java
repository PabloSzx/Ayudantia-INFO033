public abstract class CosaViviente {
  private String nombre;
  public CosaViviente(String nombre) {
    this.nombre = nombre;
  }
  public void respira() {
    System.out.println("Cosa viviente que respira");
  }
  public void come() {
    System.out.println("Cosa viviente que come");
  }
  public abstract void camina();

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getNombre() {
    return nombre;
  }
}
