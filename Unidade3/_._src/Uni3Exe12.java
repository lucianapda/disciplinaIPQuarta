import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.println("Informe o nome: ");
    String funcNome = teclado.next();
    System.out.println("Informe a qtd. horas trabalhadas: ");
    int funcHorasTrabMensal = teclado.nextInt();
    System.out.println("Informe o n. dependentes: ");
    int funcDependentesNumero = teclado.nextInt();
    
    // Processo - Empresa
    // Benefício
    double funcHorasTrabMensalValor = funcHorasTrabMensal * 10.00; // R$ 10,00 por hora
    double funcDependentesValor = funcDependentesNumero * 60.00; // R$ 60,00 por dependente
    double funcSalarioBruto = funcHorasTrabMensalValor + funcDependentesValor;

    // Desontos
    double descontoINSS = funcSalarioBruto * 0.085; // 8,5% INSS
    double descontoIRPF = funcSalarioBruto * 0.05; // 5,0% IRPF
    double funcSalarioLiquido = funcSalarioBruto - (descontoINSS + descontoIRPF);

    // Saída
    System.out.println("Nome funcionário: " + funcNome);
    System.out.println("Salário Bruto: " + df_2.format(funcSalarioBruto));
    System.out.println("Salário Liquído: " + df_2.format(funcSalarioLiquido));
    teclado.close();
  }
}
