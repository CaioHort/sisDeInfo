
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double ValorQuiloGrama = 25.00;


        System.out.println("Coloque o prato na balança.");

        double Pesagem = input.nextDouble();

        double ValorPesagem = (ValorQuiloGrama * Pesagem) / 1000;

        System.out.print("Valor total a pagar é R$ ");
        System.out.print(deci.format(ValorPesagem));

        input.close();
    }
}
