import java.util.Scanner;

public class Uni04Exe21 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double massa = input.nextDouble();
        double altura = input.nextDouble();

        double imc = massa / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9 ) {
            System.out.println("Saudável");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade Grau III (mórbida)");
        }

        input.close();
    }
}