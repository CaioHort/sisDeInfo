import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double cateto1 = input.nextDouble();
        double cateto2 = input.nextDouble();

        double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);

        System.out.println(hipotenusa);

        input.close();
    }
}
