
import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double Raio = input.nextDouble();
        double Altura = input.nextDouble();

        double Volume = Math.PI * Math.pow(Raio, 2) * Altura;

        System.out.printf("O volume total da lata sera de: %.4f%n", Volume);

        input.close();
    }
}
