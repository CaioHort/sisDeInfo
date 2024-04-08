
import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        double Nota1 = input.nextDouble();
        System.out.println("Informe a segunda nota");
        double Nota2 = input.nextDouble();
        System.out.println("Informe a terceira nota");
        double Nota3 = input.nextDouble();

        double NotaFinal = (Nota1 * 0.5) + (Nota2 * 0.3) + (Nota3 * 0.2);

        System.out.println("Nota final:" + NotaFinal);

        input.close();
    }
}
