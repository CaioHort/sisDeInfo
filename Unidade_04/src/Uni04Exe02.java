import java.util.Scanner;

public class Uni04Exe02 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este numero é par");
        } else {
            System.out.println("Este numero é impar");
        }

        input.close();
    }
}