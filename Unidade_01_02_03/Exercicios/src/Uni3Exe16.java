import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor da compra R$ ");
        double valorDeCompra = input.nextDouble();

        System.out.print("Informe o valor pago R$ ");
        double valorDeCedula = input.nextDouble();

        double valorDeTroco = valorDeCedula - valorDeCompra;

        double notas100 = valorDeTroco / 100;
        valorDeTroco %= 100;

        double notas10 = valorDeTroco / 10;
        valorDeTroco %= 10;

        double notas1 = valorDeTroco;

        System.out.print("Numero de notas para troco: ");
        System.out.printf(" Nota(s) de 100: %.0f\n Nota(s) de 10: %.0f\n Nota(s) de 1: %.0f",
                notas100, notas10, notas1);

        input.close();

    }

}