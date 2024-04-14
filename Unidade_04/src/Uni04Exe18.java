import java.util.Scanner;

public class Uni04Exe18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o dia do vencimento: ");
        int dia = input.nextInt();

        System.out.print("Informe qual foi o dia do pagamento: ");
        int pagamento = input.nextInt();

        System.out.print("Informe o valor da prestação: ");
        double prestacao = input.nextDouble();

        double valorTotal;
        int atraso = pagamento - dia;

        if (pagamento <= dia) {
            double desconto = prestacao * 0.10;
            valorTotal = prestacao - desconto;
            System.out.println("O pagamento é no dia");
            System.out.printf("Desconto de R$ %.2f\n ", desconto);

        } else if (pagamento <= dia + 5) {
            valorTotal = prestacao;
            System.out.println("Pagamento realizado até 5 dias após o vencimento");

        } else {
            double multa = prestacao * 0.02 * atraso;
            valorTotal = prestacao + multa;
            System.out.println("Pagamento realizado 5 dias após o vencimento");
            System.out.printf("Multa de %.2f", multa);

        }

        System.out.println("O valor a ser pago pelo cliente será: " + valorTotal);

        input.close();
    }

}
