public class V16 extends Coche {
  int velocidad = 0;
  String Nissan = "El V16 blanco";
  public String frenar (int cantidad) {
    velocidad = velocidad - cantidad;
    String msg = Nissan.concat(" ha frenado... Ahora va a ").concat(Integer.toString(velocidad)).concat(" [Kms/Hora]");
    return msg;
  }
  public String acelerar(int cantidad) {
      String msg = "";
      velocidad = velocidad + cantidad;
      if (velocidad > Vel_Maxima) {
        msg = "Exceso de velocidad!! ";
      }
      msg = msg.concat(Nissan).concat(" ha acelerado y va a ").concat(Integer.toString(velocidad)).concat(" [Kms/Hora]");
      return msg;
    }
  }
