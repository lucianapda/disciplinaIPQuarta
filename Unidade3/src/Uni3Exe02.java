/* ===> ATENÇÃO: antes "entender" o problema.

- conhecimento: calcular percentual (%)
valorSapato = 100,00
desconto: 0.1 (10%)
valorDeconto = valorSapato * 0.1 (10%)
valorSapatoDesconto = valorSapato - valorDeconto

// [ ] Entradas
msg: Informe o preço do par do sapato: 
var: precoSapato
ler: precoSapato

// [ ] Processos 
 .. 12% de desconto
var: valorDeconto
proc. valorDeconto = valorSapato x 0.12

var: valorSapatoDesconto
proc. valorSapatoDesconto = valorSapato - valorDeconto

// [ ] Saídas
msg: O valor do desconto é de R$ .. valorDeconto
msg: O preço do par de sapatos com desconto é R$ .. valorSapatoDesconto

*/

import java.util.Scanner;

public class Uni3Exe02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Informe o preço do par do sapato: ");
    double valorSapato = teclado.nextDouble();

    // Processo
    double valorDeconto = valorSapato * 0.12;
    double valorSapatoDesconto = valorSapato - valorDeconto;

    // Saída
    System.out.println("O valor do desconto é de R$ " + valorDeconto);
    System.out.println("O preço do par de sapatos com desconto é R$ " + valorSapatoDesconto);

    teclado.close();
  }
}

/* Valores de Teste _
(E) valorSapato = 123,00 
(E) valorDeconto (12%) = 14,76 
(P) ==> Entender o problema
(S) valorSapatoDesconto = 108,24 (é possível ser gerada manualmente)
 
(E) valorSapato = 123,45 
(E) valorDeconto (12%) = 14,814 
(P) ==> Entender o problema
(S) valorSapatoDesconto = 108,636 (é possível ser gerada manualmente)
 */
