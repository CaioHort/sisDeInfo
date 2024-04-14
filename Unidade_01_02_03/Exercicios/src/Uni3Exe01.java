import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double altura = input.nextDouble();
        double largura = input.nextDouble();

        double area = altura * largura;

        System.out.println(area);

        input.close();
    }
}
