import java.util.Scanner;

public class RepeticaoFor4 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numero...");
        int numero1 = input.nextInt();
        System.out.println("informe o inicio....");
        int inicio = input.nextInt();
        System.out.println("informe o fim.....");
        int fim = input.nextInt();

        for (int i = inicio; i <= fim; i++) {
            System.out.printf("%d x %d = %d%n",
            numero1, i, (numero1 * i));
        }

        input.close();
    }
}