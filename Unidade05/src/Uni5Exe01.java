import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numero...");
        int numero1 = input.nextInt();

        for (int i = 1; i <= 20; i++) {
            if (numero1 % 2 == 0) {
                System.out.println(numero1 + " é par");
                numero1++;
            } else if (numero1 % 2 != 0) { 
                System.out.println(numero1 + " é impar");
                numero1++;
            }

        }

        input.close();
    }
}