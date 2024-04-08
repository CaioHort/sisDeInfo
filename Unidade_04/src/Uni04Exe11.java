import java.util.Scanner;

public class Uni04Exe11 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int idadeIrmao1 = input.nextInt();
        int idadeIrmao2 = input.nextInt();
        int idadeIrmao3 = input.nextInt();

        if (idadeIrmao1 == idadeIrmao2 && idadeIrmao1 == idadeIrmao3) {
            System.out.println("TRIGÊMEOS");
        }
        if (idadeIrmao1 == idadeIrmao2 && idadeIrmao3 != idadeIrmao1 ||
         idadeIrmao2 == idadeIrmao3)

        input.close();
    }
}