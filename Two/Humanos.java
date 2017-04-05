public class Humanos{
  private int piernas;
  private int brazos;
  private int ojos;
  private int nariz;
  private int boca;
  private String nombre;
  private String sexo;
  private String nombreCaballo;
  private String preferenciaWhiskey;

  public Humanos(){
    piernas = 2;
    brazos = 2;
    ojos = 2;
    nariz = 1;
    boca = 1;
  }

  public void setNombre(String input) {
    nombre = input;
  }
  public String getNombre() {
    return nombre;
  }
  public void setSexo(String input) {
    sexo = input;
  }
  public String getSexo() {
    return sexo;
  }
  public void setNombreCaballo(String input) {
    nombreCaballo = input;
  }
  public String getNombreCaballo() {
    return nombreCaballo;
  }
  public void setPreferenciaWhiskey(String input) {
    preferenciaWhiskey = input;
  }
  public String getPreferenciaWhiskey() {
    return preferenciaWhiskey;
  }


}
