public class Estudiante_Intercambio2 extends Estudiante2 {
  private String pais;
  //Setters y Getters
  public Estudiante_Intercambio2(String request) {
    super(request);
  }
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }
}
