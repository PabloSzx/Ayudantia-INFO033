class Basico01 {
  public static void main(String[] args) {
    String S1 = new String("Soy una instancia de la clase String");
    char A = S1.charAt(5);
    String S2 = new String("Soy otra instancia de la clase String");
    boolean R = S1.equalsIgnoreCase(S2);
    Integer I1 = new Integer(20);
    // Se usara un método estático para imprimir los resultados
    System.out.println("El char en la posicion 5 de S1 es : " + A);
    System.out.println("S1 y S2 son identicos, Eso es: " + R);
    System.out.println("Valor de la instancia de la clase Integer: " + I1);
  }
}
