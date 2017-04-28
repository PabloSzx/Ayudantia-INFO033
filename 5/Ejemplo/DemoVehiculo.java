public class DemoVehiculo {
  public static void main(String[] args) {
    Moto m1 = new Moto();
    Coche c1 = new Coche();
    V16 v1 = new V16();
    System.out.println(m1.acelerar(100));
    System.out.println(m1.frenar(50));
    System.out.println(c1.acelerar(130));
    System.out.println(c1.frenar(80));
    System.out.println(v1.acelerar(120));
    System.out.println(v1.frenar(90));
  }
}
