/*
// Entrada
double pi = 3.14159;
ler -> double raio;

// Processo
double area = pi * raio * raio; // usar Math

// Saída
escrever "A=" + raio  // 4 casas após o ponto decimal 
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1002 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_4 = new DecimalFormat("0.0000");

    // Entrada
    double pi = 3.14159; // já informado no enunciado
    double raio = teclado.nextDouble();

    // Processo
    //double area = pi * raio * raio;
    double area = pi * Math.pow(raio, 2); // usar Math

    // Saída
    System.out.println("A=" + df_4.format(area));
    teclado.close();
  }
}
