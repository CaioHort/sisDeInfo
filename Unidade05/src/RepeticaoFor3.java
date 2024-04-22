import java.util.Scanner;

public class RepeticaoFor3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numero...");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            System.out.printf("%d x %d = %d%n",
            numero1, i, (numero1 * i));
        }

        input.close();
    }
}