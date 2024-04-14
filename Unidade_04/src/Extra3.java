import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o total de Segundos:");

        int segundosTotais = input.nextInt();

        int horas = segundosTotais / 3600;
        segundosTotais -= horas * 3600;
        int minutos = segundosTotais / 60;
        segundosTotais -= minutos * 60;
        int segundos = segundosTotais;

        System.out.print(horas + " : ");
        System.out.print(minutos + " : ");
        System.out.print(segundos);

        input.close();

    }
}