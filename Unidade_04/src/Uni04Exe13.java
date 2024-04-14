import java.util.Scanner;

public class Uni04Exe13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor das 3 cartas: ");
        int carta1 = input.nextInt();
        int carta2 = input.nextInt();
        int carta3 = input.nextInt();

        int quantidadeCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            quantidadeCartasBoas += 1;
        } else {

        }

        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            quantidadeCartasBoas = quantidadeCartasBoas + 1;
        } else {

        }

        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            quantidadeCartasBoas++;
        } else {

        }

        if (quantidadeCartasBoas == 1) {
            System.out.println("TRUCO");

        } else if (quantidadeCartasBoas == 2) {
            System.out.println("SEIS");

        } else if (quantidadeCartasBoas == 3) {
            System.out.println("NOVE");

        } else {

        }

        input.close();

        // PROFESSOR//
        // // Entrada
        // System.out.println("Informa as 3 cartas: ");
        // int carta1 = teclado.nextInt();
        // int carta2 = teclado.nextInt();
        // int carta3 = teclado.nextInt();

        // // Processo
        // // AS TRÊS cartas forem AS, 2 ou 3
        // boolean nove = carta1 == 1 && carta2 == 1 && carta3 == 1 ||
        // carta1 == 2 && carta2 == 2 && carta3 == 2 ||
        // carta1 == 3 && carta2 == 3 && carta3 == 3;

        // // APENAS DUAS das três cartas for AS, 2 ou 3
        // boolean seis = carta1 == 1 && carta2 == 1 || carta1 == 1 && carta3 == 1 ||
        // carta2 == 1 && carta3 == 1 ||
        // carta1 == 2 && carta2 == 2 || carta1 == 2 && carta3 == 2 || carta2 == 2 &&
        // carta3 == 2 ||
        // carta1 == 3 && carta2 == 3 || carta1 == 3 && carta3 == 3 || carta2 == 3 &&
        // carta3 == 3;

        // // APENAS UMA das três cartas for AS, 2 ou 3
        // boolean truco = carta1 == 1 || carta2 == 1 || carta3 == 1 ||
        // carta1 == 2 || carta2 == 2 || carta3 == 2 ||
        // carta1 == 3 || carta2 == 3 || carta3 == 3;

        // // Saida
        // if (nove) {
        // System.out.println("NOVE");
        // } else {
        // if (seis) {
        // System.out.println("SEIS");
        // } else {
        // if (truco) {
        // System.out.println("TRUCO");
        // }
        // }
        // }

    }

}
