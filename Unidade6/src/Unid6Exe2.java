import java.util.Scanner;

/*Uni6Exe02.java - Descreva um algoritmo que leia 12 valores reais 
e os coloque em um vetor de 12 posições do tipo real. Imprima quais 
valores desses informados são maiores que a média dos valores. Faça um 
método para ler os valores, outro para calcular a média e outro para 
informar os valores maiores que a média.
 */

public class Unid6Exe2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float[] numeros = new float[12];
        float soma = 0;
        float media = 0;

        for (int indice = 0; indice < 12; indice++) {
            System.out.print("Digite um valor: ");
            numeros[indice] = s.nextFloat();
            soma += numeros[indice];
        }

        media = soma / 12;

        System.out.println("Média = " + media);
        for (int i = 0; i < 12; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }

        s.close();
    }
}
