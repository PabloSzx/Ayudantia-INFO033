class ConversionObjetosAPrimitivos {
  public static void main(String[] args) {
    //Crearemos una instancia de la clase Integer
    Integer cuenta = new Integer(4000);
    //Convertiremos el objeto cuenta, de clase Integer, a un entero positivo
    int nuevaCuenta = cuenta.intValue();
    System.out.println("int nuevaCuenta = " + nuevaCuenta);
    //Ahora usaremos la clase Wrapper Integer para convertir un String en entero
    String numeroCadena = "3500";
    int numero = Integer.parseInt(numeroCadena);
    System.out.println("int numero = " + numero);
    //Finalmente, de tipo int a objeto Integer
    Integer miNumero = new Integer(numero);
    System.out.println("Integer miNumero = " + miNumero);
  }
}
