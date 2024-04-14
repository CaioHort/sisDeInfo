import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Quantas garrafas de 350ml serão compradas?");
        int garafa350 = input.nextInt();

        System.out.println("Quantas garrafas de 600ml serão compradas?");
        int garafa600 = input.nextInt();

        System.out.println("Quantas garrafas de 2l serão compradas?");
        int garafa2000 = input.nextInt();

        int litragemFinal = (garafa350 * 350) + (garafa600 * 600) + (garafa2000 * 2000);

        System.out.println("A litragem final sera de: " + litragemFinal);

        input.close();
    }
}
