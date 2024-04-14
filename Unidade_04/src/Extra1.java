import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite as Horas:");
        int horas = input.nextInt();
        System.out.println("Digite os Minutos:");
        int minutos = input.nextInt();
        System.out.println("Digite os Segundos:");
        int segundos = input.nextInt();

        int segundosTotais = (horas * 3600) + (minutos * 60) + segundos;

        System.out.print("Se passaram ");
        System.out.print(segundosTotais);
        System.out.println(" segundos desde o inicio do dia.");
        
        input.close();
    }
}