class Basico02 {
  public static void main(String[] args) {
    // Se probarán métodos con pasos de parámetros por valor y por referencia
    int i = 10;
    System.out.println("El valor de i, antes de invocar test(i) será: "+ i);
    test1(i);
    System.out.println("El valor de i, despues de invocar test(i) será: "+ i);
    int edades[] = {12, 12, 13};
    test2(edades);
    System.out.print("\nLos valores de edades[], despues de invocado el método test2 son: {");
    for (int k = 0; k < edades.length - 1; k++) {
      System.out.print(edades[k]+ ", ");
    }
    System.out.print(edades[edades.length - 1]+"}\n");
  }
  public static void test1(int j) {
    System.out.println("El valor de j, al inicio del método es: "+j);
    j = 25;
    System.out.println("El valor de j, al final del método es: "+j);
  }
  public static void test2(int edad[]) {
    int largo = edad.length;
    System.out.print("\nLos valores de edad[], al inicio del método test2 son: {");
    for (int k = 0; k < largo - 1; k++) {
      System.out.print(edad[k]+ ", ");
    }
    System.out.print(edad[largo - 1]+ "}");
    for (int k = 0; k < largo ; k++) {
      edad[k] = edad[k] + 5;
    }
    System.out.print("\nLos valores de edad[], al final del método test2 son: {");
    for (int k = 0; k < largo - 1; k++) {
      System.out.print(edad[k]+ ", ");
    }
    System.out.print(edad[largo - 1]+ "}");
  }
}
