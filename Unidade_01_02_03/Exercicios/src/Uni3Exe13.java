import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preçoAzulejo = 12.50;
        double metroQuadradoAzulejo = 9 * preçoAzulejo;

        System.out.print("Informe o comprimento em metros: ");
        int comprimento = input.nextInt();

        System.out.print("Informe a altura em metros: ");
        int altura = input.nextInt();

        double areaParede = comprimento * altura;
        double quantidadeAzulejos = Math.ceil(areaParede * metroQuadradoAzulejo);
        double valorTotal = quantidadeAzulejos * preçoAzulejo;

        System.out.printf("O valor gasto foi: R$%.2f", valorTotal);

        input.close();

    }

}