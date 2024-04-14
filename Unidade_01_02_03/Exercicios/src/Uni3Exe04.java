import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        double nota1 = input.nextDouble();
        System.out.println("Informe a segunda nota");
        double nota2 = input.nextDouble();
        System.out.println("Informe a terceira nota");
        double nota3 = input.nextDouble();

        double notaFinal = (nota1 * 0.5) + (nota2 * 0.3) + (nota3 * 0.2);

        System.out.println("Nota final:" + notaFinal);

        input.close();
    }
}
