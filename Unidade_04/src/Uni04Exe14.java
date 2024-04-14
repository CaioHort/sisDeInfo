import java.util.Scanner;

public class Uni04Exe14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia = input.nextInt();

        System.out.println("Informe o mês: ");
        int mes = input.nextInt();

        System.out.println("Informe o ano: ");
        int ano = input.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {

        } else {
            System.out.println("Data Inválida");

        }

        input.close();
    }

}
