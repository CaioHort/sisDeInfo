
import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);


        System.out.println("Quantas garrafas de 350ml serão compradas?");
        int Garafa350 = input.nextInt();

        System.out.println("Quantas garrafas de 600ml serão compradas?");
        int Garafa600 = input.nextInt();

        System.out.println("Quantas garrafas de 2l serão compradas?");
        int Garafa2000 = input.nextInt();

        int LitragemFinal = (Garafa350 * 350) + (Garafa600 * 600) + (Garafa2000 * 2000);

        System.out.println("A litragem final sera de: " + LitragemFinal);

        input.close();
    }
}
