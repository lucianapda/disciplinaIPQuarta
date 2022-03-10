import java.util.Scanner;

public class Uni3Exe11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Informe a temperatura em °C: ");
    double temperaturaC = teclado.nextDouble();

    // Processo
    double temperaturaF = (9.0/5.0) * temperaturaC + 32;    // °F = (9/5) °C + 32

    //Saída
    System.out.println("A temperatura em °F: " + temperaturaF);

    teclado.close();
  }
}
