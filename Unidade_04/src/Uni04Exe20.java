import java.util.Scanner;

public class Uni04Exe20 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double notaProva1 = input.nextDouble();
        double notaProva2 = input.nextDouble();
        double notaProva3 = input.nextDouble();
        double notaExercicios = input.nextDouble();

        double notaMedia = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

        if (notaMedia >= 9.0) {
            System.out.println("A");
        }
        if (notaMedia >= 7.5 && notaMedia < 9.0) {
            System.out.println("B");
        }
        if (notaMedia >= 6.0 && notaMedia < 7.5) {
            System.out.println("C");
        }
        if (notaMedia >= 4.0 && notaMedia < 6.0) {
            System.out.println("D");
        }
        if (notaMedia < 4.0) {
            System.out.println("E");
        }

        input.close();
    }
}