import java.util.Scanner;

public class Uni3Exe06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe o peso do prato (kg): ");
    int pratoMontado = teclado.nextInt();
    
    // Processo
    int pratoComida = (pratoMontado * 1000) - 750 /* em gramas */;
    
    // Saída
    double valorPagar = 25.00; // menos de 1 kg
    valorPagar = valorPagar + (valorPagar * (pratoComida / 1000));
    System.out.print(" Valor a pagar:  " + valorPagar);
    
    teclado.close();
  }
}

/* ___ valores de Teste ____
Entrada        Saída
1 kg           25,00
2 kg           50,00
*/
