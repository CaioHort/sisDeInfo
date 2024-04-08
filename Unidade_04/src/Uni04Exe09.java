import java.util.Scanner;

public class Uni04Exe09 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Escreva dois numeros inteiros.");

        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Esses numeros são multiplos!");
        } else {
            System.out.println("Esses numeros não são multiplos!");
        }

        input.close();
    }
}