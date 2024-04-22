import java.util.Scanner;

public class RepeticaoFor2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numero...");
        int numero = input.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n",
            numero, i, (numero * i));
            
        }

        input.close();
    }
}