import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe13 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.000");

        double Horas = input.nextDouble();
        double KilometrosPorHora = input.nextDouble();

        double LitragemTotal = (KilometrosPorHora / 12) * Horas;

        System.out.println(deci.format(LitragemTotal));

        input.close();
    }

}