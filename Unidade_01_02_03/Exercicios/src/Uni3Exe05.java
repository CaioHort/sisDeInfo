import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numeroFrangos = input.nextInt();

        double valorPorFrango1 = numeroFrangos * 4.0;
        double valorPorFrango2 = valorPorFrango1 * 7.0;

        System.out.println(valorPorFrango2);

        input.close();
    }
}
