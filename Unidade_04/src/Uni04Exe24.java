import java.util.Scanner;

public class Uni04Exe24 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe três numeros:");

        int[] numeros = new int[3];

        numeros[0] = input.nextInt();
        numeros[1] = input.nextInt();
        numeros[2] = input.nextInt();
        
        /*opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio */

        System.out.println("opção 1, escreva os 3 valores em ordem crescente");
        System.out.println("opção 2, escreva os 3 valores em ordem decrescente");
        System.out.println("opção 3, escreva os 3 valores de forma que o maior valor fique no meio");

        byte ordem = input.nextByte();
        int a = 10;

        input.close();

        switch (ordem) {

            case 1:
                do (a => 10) {

            
            
            
            /*if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
                    System.out.println(primeiroNumero);
                }
                if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
                    System.out.println(segundoNumero);
                }
                if (terceiroNumero > segundoNumero && terceiroNumero > primeiroNumero) {
                    System.out.println(terceiroNumero);
                } */
                
                break;
            case 2:

                break;
            case 3:

                break;
            } while (a)
        }
    }
}