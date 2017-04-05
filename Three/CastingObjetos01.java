class CastingObjetos01 {
  public static void main(String[] args) {
    Object nuevo = "Esta es una frase del objeto nuevo";
    String nuevito = (String)nuevo;
    System.out.println("Casting explícito! \"nuevito\" ha recibido informacion de un objeto superior");
    System.out.println("nuevito = ".concat(nuevito));
    String nuevito2 = "Frase del objeto String nuevito2";
    Object nuevo2 = nuevito2;
    System.out.println("Casting implicito! \"nuevo2\" ha recibido informacion de un objeto hijo");
    System.out.println("nuevo2 = " + nuevo2);
  }
}
