import java.util.Scanner;

/*Uni6Exe02.java - Descreva um algoritmo que leia 12 valores reais 
e os coloque em um vetor de 12 posições do tipo real. Imprima quais 
valores desses informados são maiores que a média dos valores. Faça um 
método para ler os valores, outro para calcular a média e outro para 
informar os valores maiores que a média.
 */

public class Unid6Exe2Metodo {


    public Unid6Exe2Metodo() {

        float[] vetor = lerVetor();
        
        float media = calcularMedia(vetor);
        System.out.println("Média = " + media);

        imprimeValorMaioresQueMedia(vetor, media);
    }

    public float[] lerVetor() {
        Scanner s = new Scanner(System.in);
        float[] numeros = new float[5];

        for (int indice = 0; indice < 5; indice++) {
            System.out.print("Digite um valor: ");
            numeros[indice] = s.nextFloat();
        }
        s.close();

        return numeros;
    }

    public float calcularMedia(float[] vetor) {
        float soma = 0f;
        for (int i = 0; i < 5; i++) {
            soma += vetor[i];
        }
        float media = soma / 5;

        return media;
    }

    public void imprimeValorMaioresQueMedia(float[] numeros, float media) {
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        new Unid6Exe2Metodo();
    }
}
