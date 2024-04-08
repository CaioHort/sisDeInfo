import java.util.Scanner;

public class Uni04Exe01 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double horas = input.nextInt();
        double valorDaHora = input.nextInt();
        double valorDaHoraExtra = valorDaHora * 1.5;
        

        if (horas <= 160) {
            double valorFinal = horas * valorDaHora * 4;
            System.out.println("O valor a ser pago deve ser de RS " + valorFinal);
        }
        if (horas > 160) {
            double valorFinal = ((160 * valorDaHora) + ((horas - 160) * valorDaHoraExtra)) * 4;
            System.out.println("O valor a ser pago deve ser de RS " + valorFinal);
        }

        input.close();
    }
}