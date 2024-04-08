
import java.io.IOException;
import java.util.Scanner;

/*Leia 4 valores inteiros A, B, C e D.
A seguir, se B for maior do que C e se D for maior do que A,
e a soma de C com D for maior que a soma de A e B e se C e D,
ambos, forem positivos e se a variável A for par escrever a mensagem
"Valores aceitos", senão escrever "Valores nao aceitos". */

public class Uni2Exe05 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double numero = input.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        input.close();
    }
}