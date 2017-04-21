public class Humano extends CosaViviente {
    public Humano(String nombre) {
      super(nombre);
    }

    public void camina() {
      System.out.println("El humano ".concat(getNombre()).concat(" camina de pie"));
    }

}
