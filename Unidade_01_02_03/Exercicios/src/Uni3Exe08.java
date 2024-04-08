
import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos dolares serão trocados:");
        double Dolares = input.nextDouble();

        System.out.println("Qual a cotação do dolar: ");
        double CotacaoDolarParaReal = input.nextDouble();

        double Reais = Dolares * CotacaoDolarParaReal;

        System.out.printf("O atendente deve devolver R$ %.2f%n", Reais);

        input.close();
    }
}
