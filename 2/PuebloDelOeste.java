public class PuebloDelOeste{
  private int establos;
  private int cantinas;
  private int comisarios;
  private int alborotadores;
  private String localizacion;
  private int tiempo;
  public PuebloDelOeste() {
      establos = 3;
      localizacion = "Oeste de los EEUU";
      tiempo = 1850;
  }
  public PuebloDelOeste(int inputEstablos, String inputLocalizacion, int inputTiempo) {
    establos = inputEstablos;
    localizacion = inputLocalizacion;
    tiempo = inputTiempo;
  }
  public void setCantinas(int n) {
    cantinas = n;
  }
  public int getCantinas() {
    return cantinas;
  }
  public void setComisarios(int n) {
    comisarios = n;
  }
  public int getComisarios() {
    return comisarios;
  }
  public void setAlborotadores(int n) {
    alborotadores = n;
  }
  public int getAlborotadores() {
    return alborotadores;
  }
  public int getEstablos() {
    return establos;
  }
  public String getLocalizacion() {
    return localizacion;
  }
  public int getTiempo() {
    return tiempo;
  }
}
