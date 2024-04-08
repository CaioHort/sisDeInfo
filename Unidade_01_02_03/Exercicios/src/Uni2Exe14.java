
import java.io.IOException;
import java.util.Scanner;

public class Uni2Exe14 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int DinheiroTotal = input.nextInt();
        System.out.println(DinheiroTotal);

        int Nota100 = DinheiroTotal / 100;
        DinheiroTotal -= Nota100 * 100;
        int Nota50 = DinheiroTotal / 50;
        DinheiroTotal -= Nota50 * 50;
        int Nota20 = DinheiroTotal / 20;
        DinheiroTotal -= Nota20 * 20;
        int Nota10 = DinheiroTotal / 10;
        DinheiroTotal -= Nota10 * 10;
        int Nota5 = DinheiroTotal / 5;
        DinheiroTotal -= Nota5 * 5;
        int Nota2 = DinheiroTotal / 2;
        DinheiroTotal -= Nota2 * 2;
        int Nota1 = DinheiroTotal;

        System.out.println(Nota100 + " nota(s) de R$ 100,00");
        System.out.println(Nota50 + " nota(s) de R$ 50,00");
        System.out.println(Nota20 + " nota(s) de R$ 20,00");
        System.out.println(Nota10 + " nota(s) de R$ 10,00");
        System.out.println(Nota5 + " nota(s) de R$ 5,00");
        System.out.println(Nota2 + " nota(s) de R$ 2,00");
        System.out.println(Nota1 + " nota(s) de R$ 1,00");

        input.close();
    }
}