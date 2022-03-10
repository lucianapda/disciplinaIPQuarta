/* ===> ATENÇÃO: antes "entender" o problema.

// Afirmações (é verdade)
  terrenos retangulares

// [ ] Entradas
msg: Entre c/ base:
var: base
ler: base

msg: Entre c/ altura:
var: altura
ler: altura

// [ ] Processo
var: area
proc. area = base x altura

// [ ] Saídas
msg: Área: .. area

*/

import java.util.Scanner;

public class Uni3Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Entre c/ base: ");
    double base = teclado.nextDouble();  
    System.out.println("Entre c/ altura: ");
    double altura = teclado.nextDouble();

    // Processo
    double area = base * altura;

    // Saída
    System.out.println("Área: " + area);

    teclado.close();
  }
}

/* Valores de Teste _
(E) base = 3
(E) altura = 4
(P) ==> Entender o problema
(S) area = 12 (é possível ser gerada manualmente)
*/
