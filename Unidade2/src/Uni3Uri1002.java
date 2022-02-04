/*    
A fórmula para calcular a área de uma circunferência é 
definida como A = π x R². Considerando este problema 
que π = 3,1415. Calcule a área usando a fórmula fornecida 
na descrição do problema.

Entrada
pi = 3.1415

Processo
area = pi * (raio * raio)

Saída
area

*/

public class URI_1002 {
  public static void main(String[] args) {
    // Entrada
    double pi = 3.1415;
    double raio = 5;

    // Processo
    double area = pi * (raio * raio);

    //Saída
    System.out.println(area);
  }
  
}
