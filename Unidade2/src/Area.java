import java.util.Scanner;
import java.lang.Math;

public class Area {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float raio = entrada.nextFloat();
        raio = (float) Math.pow(raio, 2);
        float PI = 3.1415f;
        float area = PI * raio * raio;

        System.out.println("Área " + area);
    }
}
