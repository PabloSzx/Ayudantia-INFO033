import java.util.Scanner;
public class DemoEscuela2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // Se crean los objetos Persona, Estudiante,
    // Profesor y Estudiante_Intercambio
    Persona2 p1 = new Persona2("Ingrese nombre del director: ");
    Estudiante2 s1 = new Estudiante2("Ingrese nombre del estudiante: ");

    System.out.print("Ingrese escuela del estudiante: ");
    s1.setEscuela(teclado.nextLine());

    Estudiante_Intercambio2 exs1 = new Estudiante_Intercambio2("Ingrese nombre del Estudiante de intercambio: ");

    System.out.print("Ingrese escuela del estudiante de intercambio: ");
    exs1.setEscuela(teclado.nextLine());
    System.out.print("Ingrese pais del estudiante de intercambio: ");
    exs1.setPais(teclado.nextLine());
    Profesor2 pr1 = new Profesor2("Ingrese nombre del profesor: ");

    System.out.print("Ingrese materia del profesor: ");
    pr1.setMateria(teclado.nextLine());

    //Despliegue de información

    System.out.println("Resumen de personas");
    System.out.println("Director: ".concat(p1.getNombre()));
    System.out.println("Estudiante: ".concat(s1.getNombre()));
    System.out.println("Estudiante_Intercambio: ".concat(exs1.getNombre()));
    System.out.println("Profesor: ".concat(pr1.getNombre()));
  }
}
