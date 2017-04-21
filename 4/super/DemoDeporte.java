public class DemoDeporte {
  public static void main(String[] args) {
    Deportista D1 = new Deportista();
    System.out.println("El deportista se llama ".concat(D1.getNombre()));
    System.out.println("Y practica: ".concat(D1.getDeporte()));
  }
}
