import java.util.Scanner;

public class Uni04Exe22 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual curso deseja escolher: ");
        System.out.println("1 Ciência da Computação");
        System.out.println("2 Licenciatura da Computação");
        System.out.println("3 Sistemas de Informação");

        int escolha = input.nextInt();

        switch (escolha) {

            case 1:

                System.out.println("Escolha 1 Ciência da Computação:");
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:

                System.out.println("Escolha 2 Licenciatura da Computação");
                System.out.println("Licenciado em Computação");
                break;
            case 3:

                System.out.println("Escolha 3 Sistemas de Informação");
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        }

        input.close();
    }
}