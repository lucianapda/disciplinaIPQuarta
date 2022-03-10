/* ===> ATENÇÃO: antes "entender" o problema.

// precisamos ... casas decimais

// [ ] Entrada
msg: Informe o preço litro da gasolina
var: precoLitroGasolina
ler: precoLitroGasolina

msg: Informe o preço pago
var: precoPago
ler: precoPago

// [ ] Processo
var: qtdLitro
proc. qtdLitro = precoPago / precoLitroGasolina

// [ ] Saídas
msg: Quantidade de litro .. qtdLitro

*/

import java.util.Scanner;

public class Uni3Exe03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe o preço litro da gasolina: ");
    double precoLitroGasolina = teclado.nextDouble();
    System.out.print("Informe o preço pago: ");
    double precoPago = teclado.nextDouble();

    // Processo
    double qtdLitro = precoPago / precoLitroGasolina;

    // Saída
    System.out.println("Quantidade de litros: " + qtdLitro);

    teclado.close();
  }
}

/* Valores de Teste _
(E) precoLitroGasolina = 12,45
(E) precoPago = 49,80
(P) ==> Entender o problema
(S) qtdLitro = 4 (é possível ser gerada manualmente)
*/
