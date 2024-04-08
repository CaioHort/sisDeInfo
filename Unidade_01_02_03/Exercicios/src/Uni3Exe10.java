

import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double Cateto1 = input.nextDouble();
        double Cateto2 = input.nextDouble();

        double Hipotenusa = Math.pow(Cateto1, 2) + Math.pow(Cateto2, 2);

        System.out.println(Hipotenusa);

        input.close();
    }
}
