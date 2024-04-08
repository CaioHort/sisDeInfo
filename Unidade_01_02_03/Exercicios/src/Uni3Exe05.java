
import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int NumeroFrangos = input.nextInt();

        double ValorPorFrango1 = NumeroFrangos * 4.0;
        double ValorPorFrango2 = ValorPorFrango1 * 7.0;

        System.out.println(ValorPorFrango2);

        input.close();
    }
}
