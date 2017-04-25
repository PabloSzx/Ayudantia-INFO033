public class Estudiante2 extends Persona2 {
  private String escuela;
  private int semestre;
  //Setters y Getters
  public Estudiante2(String request) {
    super(request); //Llama al constructor de Persona2
  }
  public String getEscuela() {
    return escuela;
  }
  public void setEscuela(String escuela) {
    this.escuela = escuela;
  }
  public int getSemestre() {
    return semestre;
  }
  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }
}
