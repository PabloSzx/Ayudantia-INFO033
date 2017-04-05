public class Balacera{
  public static void main(String[] args) {
    // PuebloDelOeste sweatyPost = new PuebloDelOeste();
    // Constructor Pueblo del oeste => int inputEstablos, String inputLocalizacion, int inputTiempo
    PuebloDelOeste sweatyPost = new PuebloDelOeste(2, "Valdivia", 1820);
    // sweatyPost.cantinas = 2;
    sweatyPost.setCantinas(2);
    // sweatyPost.comisarios = 1;
    sweatyPost.setComisarios(1);
    // sweatyPost.alborotadores = 5;
    sweatyPost.setAlborotadores(3);

    Humanos[] ciudadanosDeSweatyPost = new Humanos[10];
    for (int i = 0; i < 10; i++) {
      ciudadanosDeSweatyPost[i] = new Humanos();
    }
    System.out.println("En sweatyPost viven 10 personas");
    ciudadanosDeSweatyPost[0].setNombre("Juanito Perez");
    ciudadanosDeSweatyPost[0].setSexo("Hombre");
    System.out.println("El fundador del pueblo se llama: ".concat(ciudadanosDeSweatyPost[0].getNombre()));
    ciudadanosDeSweatyPost[0].setNombreCaballo("Spirit");
    System.out.println("Su caballo se llama: ".concat(ciudadanosDeSweatyPost[0].getNombreCaballo()));
    ciudadanosDeSweatyPost[1].setNombre("Maria");
    ciudadanosDeSweatyPost[1].setSexo("Mujer");
    System.out.println("Su esposa se llama: ".concat(ciudadanosDeSweatyPost[1].getNombre()));

    System.out.println("Pero no sería un pueblo del viejo oeste si no hubieran villanos");
    Villanos[] villanosDeSweatyPost = new Villanos[sweatyPost.getAlborotadores()];
    for (int i = 0; i < sweatyPost.getAlborotadores(); i++) {
      // Constructor Villanos => String inputAspecto, int inputEbriedad, int inputNumeroDeDamiselas
      villanosDeSweatyPost[i] = new Villanos("Malo", 0, 0);
    }
    villanosDeSweatyPost[1].setNombre("James");

    System.out.println("El primer villano se llama: ".concat(villanosDeSweatyPost[1].getNombre()));

  }
}
