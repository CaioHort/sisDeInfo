import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double altura = input.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("O volume total da lata sera de: %.4f%n", volume);

        input.close();
    }
}
