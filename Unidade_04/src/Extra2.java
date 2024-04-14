import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite as Horas:");
        int horas = input.nextInt();
        System.out.println("Digite os Minutos:");
        int minutos = input.nextInt();
        System.out.println("Digite os Segundos:");
        int segundos = input.nextInt();

        int segundosTotais = 86400 - ((horas * 3600) + (minutos * 60) + segundos);

        System.out.print("Para o termino do dia irão se passar ");
        System.out.print(segundosTotais);
        System.out.println(" segundos.");

        input.close();
    }
}