public class Coche implements Vehiculo {
  int velocidad = 0;
  public String frenar (int cantidad) {
    velocidad = velocidad - cantidad;
    String msg = "El coche ha frenado... Ahora va a ".concat(Integer.toString(velocidad)).concat(" [Kms/Hora]");
    return msg;
  }
  public String acelerar(int cantidad) {
    String msg = "";
    velocidad = velocidad + cantidad;
    if (velocidad > Vel_Maxima) {
      msg = "Exceso de velocidad!! ";
    }
    msg = msg.concat("El coche ha acelerado y va a ").concat(Integer.toString(velocidad)).concat(" [Kms/Hora]");
    return msg;
  }
}
