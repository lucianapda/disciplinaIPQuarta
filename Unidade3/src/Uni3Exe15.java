import java.util.Scanner;

public class Uni3Exe15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Número inteiro (XYK): ");
    int numero = teclado.nextInt();

    // Processo
    int centenas = numero / 100;
    int dezenas  = numero / 10   - (centenas * 10);
    int unidades = numero / 1    - (centenas * 100) - (dezenas * 10);

    // Saída
    System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s)");

    teclado.close();
  }
}

/*
(E) 384  
(S) 3 centena(s) 8 dezena(s) 4 unidade(s)  
*/