import java.util.Scanner;

public class Uni3Exe05 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe a qtd. de frangos:  ");
    int frangoQtd = teclado.nextInt();

    // Processo
    double frangoCustoIndividual = 4.00 /* chip */ + (3.50 * 2) /* alimento */;
    double frangoCustoTotal = frangoQtd * frangoCustoIndividual;

    // Saída
    System.out.println(" Gasto total: " + frangoCustoTotal);

    teclado.close();
  }
}
