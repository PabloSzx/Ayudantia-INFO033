public class Profesor2 extends Persona2 {
  private String materia;
  //Setters y Getters
  public Profesor2(String request) {
    super(request);
  }
  public String getMateria() {
    return materia;
  }
  public void setMateria(String materia) {
    this.materia = materia;
  }
}
