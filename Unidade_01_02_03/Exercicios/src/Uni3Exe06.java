import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double valorQuiloGrama = 25.00;

        System.out.println("Coloque o prato na balança.");

        double pesagem = input.nextDouble();

        double valorPesagem = (valorQuiloGrama * pesagem) / 1000;

        System.out.print("Valor total a pagar é R$ ");
        System.out.print(deci.format(valorPesagem));

        input.close();
    }
}
