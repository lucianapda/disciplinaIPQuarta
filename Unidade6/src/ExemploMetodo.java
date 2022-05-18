import java.util.Scanner;

public class ExemploMetodo {
    
    //Declaração de atributo
    private Scanner s;

    //construtor da classe
    public ExemploMetodo() {
        s = new Scanner(System.in);

        //área principal do programa:
        somarSemRetorno();

        int diferenca = subtrairComRetorno();
        System.out.println("Diferenca entre 2 numeros: " + diferenca);


        int m = multiplicarComRetornoEParametro(8, 10);
        System.out.println("Multiplicacao = " + m);

        System.out.print("Numero 1:");
        int num1 = s.nextInt();
        System.out.print("Numero 2:");
        int num2 = s.nextInt();
        System.out.println(multiplicarComRetornoEParametro(num1, num2));

        s.close();
    }


    //método sem retorno
    public void somarSemRetorno() {
        System.out.print("Digite o numero 1:");
        int n1 = s.nextInt();
        System.out.print("Digite o numero 2: ");
        int n2 = s.nextInt();

        int soma = n1 + n2;

        System.out.println("Soma = " + soma);
    }

    //Com retorno
    public int subtrairComRetorno() {
        System.out.print("Digite o numero 1:");
        int n1 = s.nextInt();
        System.out.print("Digite o numero 2: ");
        int n2 = s.nextInt();

        int subtracao = n1 - n2;

        return subtracao;
    }

    //Com retorno e com parâmetro
    public int multiplicarComRetornoEParametro(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
       new ExemploMetodo(); 
    }


}
