import java.util.Scanner;

public class Uni04Exe04 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero:");
        double numero = input.nextInt();

        String numeroPorExtenco = String.valueOf(numero);

        if (numeroPorExtenco.contains(".")) {
            System.out.println("Foram digitados numeros apos a virgula.");
        } else {
            System.out.println("Foram digitados numeros apos a virgula.");
        }

        input.close();
    }
}