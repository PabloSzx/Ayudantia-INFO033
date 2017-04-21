public class Villanos extends Humanos{
  String colorBigote;
  String colorSombrero;
  String aspecto;
  int ebriedad;
  int numeroDeDamiselas;
  Humanos damisela;

  public Villanos() {
    aspecto = "Malo";
    ebriedad = 0;
    numeroDeDamiselas = 0;
  }
  public Villanos(String inputAspecto, int inputEbriedad, int inputNumeroDeDamiselas) {
    aspecto = inputAspecto;
    ebriedad = inputEbriedad;
    numeroDeDamiselas = inputNumeroDeDamiselas;
  }

  public void setColorBigote(String input) {
    colorBigote = input;
  }
  public String getColorBigote() {
    return colorBigote;
  }
  public void setColorSombrero(String input) {
    colorSombrero = input;
  }
  public String getColorSombrero() {
    return colorSombrero;
  }
  public void setAspecto(String input) {
    aspecto = input;
  }
  public String getAspecto() {
    return aspecto;
  }
  public void setEbriedad(int input) {
    ebriedad = input;
  }
  public void tomarWhiskey() {
    ebriedad++;
  }
  public int queTanEbrioEstoy() {
    return ebriedad;
  }
  // public String queTanEbrioEstoy() {
  //   switch (ebriedad) {
  //     case 0:
  //       return "Estas completamente sobrio";
  //     case 1:
  //       return "Solo son unas copitas";
  //     case 2:
  //       return "Podrías estar mas ebrio";
  //     default:
  //       return "Estas muy ebrio!";
  //   }
  // }
  public void setNumeroDeDamiselas(int input) {
    numeroDeDamiselas = input;
  }
  public int getNumeroDeDamiselas() {
    return numeroDeDamiselas;
  }
  public void secuestrarDamisela(int input) {
    numeroDeDamiselas++;
  }


}
