import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) throws Exception {
        
        //criação do vetor
        int[] notas = new int[3];

        //atribuição de valor
        notas[0] = 7;
        notas[1] = 8;
        notas[2] = 9;

        //leitura
        System.out.println(notas[0] + " - " + notas[1] + " - "+notas[2]);

        //alteração
        notas[0] = 9;

        System.out.println(notas[0] + " - " + notas[1] + " - "+notas[2]);

        Scanner leitor = new Scanner(System.in);
        for (int indice = 0; indice < 3; indice++) {
            System.out.print("Digite a nota " + (indice + 1) + ": ");
            notas[indice] = leitor.nextInt();
        }
        System.out.println(notas[0] + " - " + notas[1] + " - "+notas[2]);


        String[] nomes;
        
        System.out.print("Quantas pessoas serão cadastradas? ");
        int qtd = leitor.nextInt();

        nomes = new String[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o nome para a posição " + i + ": ");
            nomes[i] = leitor.next();
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome [" + i + "]: " + nomes[i]);
        }

        leitor.close();

    }
}
