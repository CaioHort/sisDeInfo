import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double valorInicial = input.nextDouble();

        double valorDescontado = valorInicial * 0.12;
        double valorFinal = valorDescontado - valorInicial;

        System.out.println(" O valor do desconto é de R$ " + valorDescontado);
        System.out.println(" O preço do par de sapatos com desconto é R$ " + valorFinal);

        input.close();
    }
}
