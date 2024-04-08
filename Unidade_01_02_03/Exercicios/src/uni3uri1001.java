import java.text.DecimalFormat;
import java.util.Scanner;

public class uni3uri1001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00000");

        double A = input.nextDouble();
        double B = input.nextDouble();

        double x = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n", x);
        System.out.println(deci.format(A));

        input.close();
    }
}
