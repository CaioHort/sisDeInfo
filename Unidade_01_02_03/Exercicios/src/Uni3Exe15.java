import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Número inteiro: ");
        int numero = input.nextInt();

        int centenas = numero / 100;
        int dezenas = numero / 10 - (centenas * 10);
        int unidades = numero / 1 - (centenas * 100) - (dezenas * 10);

        centenas = numero / 100;
        int restoCentenas = numero - (centenas * 100);
        dezenas = restoCentenas / 10;
        int restoDezenas = restoCentenas - (dezenas * 10);
        unidades = restoDezenas;

        System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s)");

        input.close();
    }
}