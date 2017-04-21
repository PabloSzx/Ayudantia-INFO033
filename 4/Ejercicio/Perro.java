public class Perro extends CosaViviente {
  public Perro(String nombre) {
    super(nombre);
  }

  public void camina() {
    System.out.println("El perro ".concat(getNombre()).concat(" camina en 4 patas"));
  }
}
