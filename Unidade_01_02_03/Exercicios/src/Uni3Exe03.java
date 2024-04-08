
import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double ValorGasolina = input.nextDouble();
        double GasolinaComprada = input.nextDouble();
        double ValorAPagar = ValorGasolina * GasolinaComprada;

        System.out.println("Valor total:" + ValorAPagar);

        input.close();
    }
}
