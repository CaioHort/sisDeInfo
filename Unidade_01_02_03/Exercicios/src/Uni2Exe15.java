

import java.io.IOException;
import java.util.Scanner;

public class Uni2Exe15 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double DinheiroTotal = input.nextDouble();

        int Notas = (int) DinheiroTotal;
        int Moedas = (int) ((DinheiroTotal - Notas) * 100);

        int Nota100 = Notas / 100;
        Notas -= Nota100 * 100;
        int Nota50 = Notas / 50;
        Notas -= Nota50 * 50;
        int Nota20 = Notas / 20;
        Notas -= Nota20 * 20;
        int Nota10 = Notas / 10;
        Notas -= Nota10 * 10;
        int Nota5 = Notas / 5;
        Notas -= Nota5 * 5;
        int Nota2 = Notas / 2;
        Notas -= Nota2 * 2;
        int Moeda1 = Notas;
        Notas -= Moeda1 * 1;
        int Moeda50 = Moedas / 50;
        Moedas -= Moeda50;
        int Moeda25 = Moedas / 25;
        Moedas -= Moeda25 * 25;
        int Moeda10 = Moedas / 10;
        Moedas -= Moeda10 * 10;
        int Moeda5 = Moedas / 5;
        Moedas -= Moeda5 * 5;
        int Moeda01 = Moedas;

        System.out.println("NOTAS:");
        System.out.println(Nota100 + " nota(s) de R$ 100.00");
        System.out.println(Nota50 + " nota(s) de R$ 50.00");
        System.out.println(Nota20 + " nota(s) de R$ 20.00");
        System.out.println(Nota10 + " nota(s) de R$ 10.00");
        System.out.println(Nota5 + " nota(s) de R$ 5.00");
        System.out.println(Nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(Moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(Moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(Moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(Moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(Moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(Moeda01 + " moeda(s) de R$ 0.01");

        input.close();
    }
}