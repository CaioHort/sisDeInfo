import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos dolares serão trocados:");
        double dolares = input.nextDouble();

        System.out.println("Qual a cotação do dolar: ");
        double cotacaoDolarParaReal = input.nextDouble();

        double reais = dolares * cotacaoDolarParaReal;

        System.out.printf("O atendente deve devolver R$ %.2f%n", reais);

        input.close();
    }
}
