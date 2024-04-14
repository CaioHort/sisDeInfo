import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni04Exe15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.000");

        System.out.print("Informe o salário do funcionário R$ ");
        double salario = input.nextDouble();

        System.out.print("Informe a quantos meses o funcionário foi admitido: ");
        int meses = input.nextInt();

        double reajuste;

        if (meses <= 12) {
            reajuste = 0.05;

        } else {
            reajuste = 0.07;

        }

        double valorTotal = (salario * reajuste);

        System.out.println(deci.format("O valorTotal de reajuste que o funcionário receberá no seu salário será de: ")  + valorTotal);

        input.close();

    }

}
