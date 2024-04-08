
import java.io.IOException;
import java.util.Scanner;

public class Uni2Exe10 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int TempoDecorrido = input.nextInt();
        int Horas = TempoDecorrido / 3600;
        TempoDecorrido -= Horas * 3600;
        int Minutos = TempoDecorrido / 60;
        TempoDecorrido -= Minutos * 60;
        int Segundos = TempoDecorrido;

        System.out.println(Horas + ":" + Minutos + ":" + Segundos);

        input.close();
    }
}