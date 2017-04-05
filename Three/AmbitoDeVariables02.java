class AmbitoDeVariables02 {
  //Declaración de una variable de clase (estática)
  static String varEstatica01 = "Variable estatica";
  //Declaracion de una variable de instancia
  String varInstancia01 = "Variable de instancia";
  public static void main(String[] args) {
    //Declaracion de una variable local
    String varLocal01 = "Variable local";
    System.out.println("Mi variable local: ".concat(varLocal01));
    System.out.println("Mi variable estatica: ".concat(varEstatica01));
    AmbitoDeVariables02 objeto = new AmbitoDeVariables02();
    objeto.salida();
  }

  void salida() {
    System.out.println("Mi variable de instancia: ".concat(varInstancia01));
  }
}
