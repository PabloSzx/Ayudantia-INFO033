import java.util.Scanner;

public class ArregloReales implements Estadisticas{
  double[] arreglo;

  public double minimo() {
    double min = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
      if (arreglo[i] < min) {
        min = arreglo[i];
      }
    }

    return min;
  }

  public double maximo() {
    double max = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
      if (arreglo[i] < max) {
        max = arreglo[i];
      }
    }

    return max;
  }

  public double sumatoria() {
    double sum = 0;
    for (int i = 0; i < arreglo.length; i++) {
      sum+=arreglo[i];
    }
    return sum;
  }

  public void imprimir() {
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(Double.toString(arreglo[i]).concat(" - "));
    }
  }

  public ArregloReales(int length) {
    arreglo = new double[length];
    Scanner keyboard = new Scanner(System.in);
    for (int i = 0; i < length; i++) {
      arreglo[i] = Integer.parseInt(keyboard.nextLine());
    }
  }


}
