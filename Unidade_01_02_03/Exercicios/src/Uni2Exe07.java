
import java.io.IOException;
import java.util.Scanner;

public class Uni2Exe07 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double salarionormal, extra;

        salarionormal = input.nextDouble();
        extra = input.nextDouble();

        double salario = salarionormal + (extra * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", salario);

        input.close();
    }
}