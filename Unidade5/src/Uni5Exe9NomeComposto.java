import java.util.Scanner;


public class Uni5Exe9NomeComposto {
    /*
     * Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um
     * algoritmo que:
     * 
     * escreva os nomes dos alunos que tem 18 anos;
     * escreva a quantidade de alunos que tem idade acima de 20 anos.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);//.useDelimiter("-");
        System.out.print("Digite a quantidade de alunos da turma: ");

        int qtdAlunos = Integer.parseInt(teclado.nextLine());

        String nomes18Anos = "";
        int qtdAcima20 = 0;
        for (int nrAluno = 0; nrAluno < qtdAlunos; nrAluno++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a idade do aluno: ");
            int idade = Integer.parseInt(teclado.nextLine());

            if (idade == 18) {
                nomes18Anos += nome + "  ";
            } else if (idade > 20) {
                qtdAcima20++;
            }
        }

        System.out.println("Alunos com 18 anos: " + nomes18Anos);
        System.out.println(qtdAcima20 + " alunos com mais de 20 anos");
        teclado.close();
    }
}
