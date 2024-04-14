import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double valorGasolina = input.nextDouble();
        double gasolinaComprada = input.nextDouble();
        double valorAPagar = valorGasolina * gasolinaComprada;

        System.out.println("Valor total:" + valorAPagar);

        input.close();
    }
}
