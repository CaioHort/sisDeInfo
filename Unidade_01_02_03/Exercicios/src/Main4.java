
import java.io.IOException;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int DiasTotais = input.nextInt();
        int Anos = DiasTotais / 365;
        DiasTotais -= Anos * 365;
        int Meses = DiasTotais / 30;
        DiasTotais -= Meses * 30;
        int Dias = DiasTotais;

        System.out.println(Anos + " ano(s)");
        System.out.println(Meses +" mes(es)");
        System.out.println(Dias +" dia(s)");

        input.close();
    }
}