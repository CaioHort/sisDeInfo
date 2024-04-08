
import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double ValorInicial = input.nextDouble();

        double ValorDescontado = ValorInicial * 0.12;
        double ValorFinal = ValorDescontado - ValorInicial;

        System.out.println(" O valor do desconto é de R$ " + ValorDescontado);
        System.out.println(" O preço do par de sapatos com desconto é R$ " + ValorFinal);

        input.close();
    }
}
