public class DemoVivientes {
  public static void main(String[] args) {
    Humano humano = new Humano("Pedro");
    Perro perro = new Perro("Firulais");

    humano.camina();
    perro.camina();

    humano.come();
    humano.respira();
  }
}
