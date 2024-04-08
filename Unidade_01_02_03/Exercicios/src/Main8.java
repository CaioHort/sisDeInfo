
import java.io.IOException;
import java.util.Scanner;

/*Leia 4 valores inteiros A, B, C e D.
A seguir, se B for maior do que C e se D for maior do que A,
e a soma de C com D for maior que a soma de A e B e se C e D,
ambos, forem positivos e se a variável A for par escrever a mensagem
"Valores aceitos", senão escrever "Valores nao aceitos". */

public class Main8 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (a == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

        input.close();
    }
}