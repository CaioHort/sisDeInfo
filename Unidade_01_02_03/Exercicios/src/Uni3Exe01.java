
import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double Altura = input.nextDouble();
        double Largura = input.nextDouble();
    
        double Area = Altura * Largura;

        System.out.println(Area);

        input.close();
    }
}
