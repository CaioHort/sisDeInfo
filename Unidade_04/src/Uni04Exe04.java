import java.util.Scanner;

public class Uni04Exe04 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro numero é maior");
        } else {
            System.out.println("O segundo numero é maior");
        }

        input.close();
    }
}