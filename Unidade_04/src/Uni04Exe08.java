import java.util.Scanner;

public class Uni04Exe08 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        char letra = input.nextLine().charAt(0);

        if (letra == 'a' || letra == 'e' ||
                letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra + " é vogal");
        } else {
            System.out.println("não pe volgal");
        }

        input.close();
    }
}