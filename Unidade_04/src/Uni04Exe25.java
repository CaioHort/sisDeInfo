import java.util.Scanner;

public class Uni04Exe25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escreva dois números: ");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        System.out.println("Faça uma escolha: ");
        System.out.println("1 - Soma 2 - Diferença 3 - Produto 4 - Divisão");
        int escolha = input.nextInt();

        switch (escolha) {

            case 1:

                System.out.println(numero1 + numero2);

                break;

            case 2:

                System.out.println(numero1 - numero2);

                break;

            case 3:

                System.out.println(numero1 * numero2);

                break;

            case 4:

            if (numero2 == 0) {
                System.out.println("Opção inválida");
                System.out.println("O denominador não pode ser zero");
                
            } else {
                System.out.println(numero1 / numero2);

            }

                break;
        
            default:
            System.out.println("Opção inválida");

                break;

        }

        input.close();
    }

}
