import java.util.Scanner;

public class ExemploIF {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int Numero = input.nextInt();

        if (Numero % 2 == 0) {
            System.out.println("Esse numero é par");
        }
        if (Numero - 1000 >= 1) {
            System.out.println("Esse numero é maior do que mil");
        }

        System.out.println("Cheguei ao fim");

        input.close();
    }
}