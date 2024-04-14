
import java.io.IOException;
import java.util.Scanner;

public class Uni2Exe10 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int tempoDecorrido = input.nextInt();
        int horas = tempoDecorrido / 3600;
        tempoDecorrido -= horas * 3600;
        int minutos = tempoDecorrido / 60;
        tempoDecorrido -= minutos * 60;
        int segundos = tempoDecorrido;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        input.close();
    }
}