import java.util.Scanner;
public class DemoEscuela {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // Se crean los objetos Persona, Estudiante,
    // Profesor y Estudiante_Intercambio
    Persona p1 = new Persona();
    System.out.print("Ingrese nombre del director: ");
    p1.setNombre(teclado.nextLine());
    Estudiante s1 = new Estudiante();
    System.out.print("Ingrese nombre del estudiante: ");
    s1.setNombre(teclado.nextLine());
    System.out.print("Ingrese escuela del estudiante: ");
    s1.setEscuela(teclado.nextLine());
    Estudiante_Intercambio exs1 = new Estudiante_Intercambio();
    System.out.print("Ingrese nombre del Estudiante de intercambio: ");
    exs1.setNombre(teclado.nextLine());

    System.out.print("Ingrese escuela del estudiante de intercambio: ");
    exs1.setEscuela(teclado.nextLine());
    System.out.print("Ingrese pais del estudiante de intercambio: ");
    exs1.setPais(teclado.nextLine());
    Profesor pr1 = new Profesor();
    System.out.print("Ingrese nombre del profesor: ");
    pr1.setNombre(teclado.nextLine());
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
