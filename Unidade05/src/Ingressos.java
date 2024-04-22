import java.util.Scanner;

public class Ingressos {
    public static void main(String[] args) throws Exception {

     Scanner input = new Scanner(System.in);

    System.out.println("Escreva o valor de 3 ingressos...");
    double ingresso1 = input.nextDouble();
    double ingresso2 = input.nextDouble();
    double ingresso3 = input.nextDouble();

    System.out.println("Menu de escolhas:");
    System.out.println("1 - Valor do ingresso mais baixo");
    System.out.println("2 - Valor do ingresso mais alto");
    System.out.println("3 - Valores impressos em ordem decrecente (mais alto para o mais baixo)");
    System.out.println("4 - Média dos valores pagos");

    int escolha = input.nextInt();

    switch (escolha) {
        case 1:

        if (ingresso1 < ingresso2 && ingresso1 < ingresso3) {
            System.out.println(ingresso1);

        } else if (ingresso2 < ingresso1 && ingresso2 < ingresso3) {
            System.out.println(ingresso2);

        } else if (ingresso3 < ingresso1 && ingresso3 < ingresso2) {
            System.out.println(ingresso3);

        }
            
            break;

        case 2:

        if (ingresso1 > ingresso2 && ingresso1 > ingresso3) {
            System.out.println(ingresso1);

        } else if (ingresso2 > ingresso1 && ingresso2 > ingresso3) {
            System.out.println(ingresso2);

        } else if (ingresso3 > ingresso1 && ingresso3 > ingresso2) {
            System.out.println(ingresso3);

        }
            
            break;

        case 3:

        if (ingresso1 > ingresso2 && ingresso1 > ingresso3) {
            System.out.println(ingresso1);
        }
        if (ingresso2 > ingresso1 && ingresso2 > ingresso3) {
            System.out.println(ingresso2);
        }
        if (ingresso3 > ingresso2 && ingresso3 > ingresso1) {
            System.out.println(ingresso3);
        }
        if (ingresso1 > ingresso2 && ingresso1 < ingresso3){
            System.out.println(ingresso1);
        }
        if (ingresso2 > ingresso1 && ingresso2 < ingresso3) {
            System.out.println(ingresso2);
        }
        if (ingresso3 > ingresso2 && ingresso3 < ingresso1) {
            System.out.println(ingresso3);
        }
        if (ingresso1 < ingresso2 && ingresso1 < ingresso3){
            System.out.println(ingresso1);
        }
        if (ingresso2 < ingresso1 && ingresso2 < ingresso3) {
            System.out.println(ingresso2);
        }
        if (ingresso3 < ingresso2 && ingresso3 < ingresso1) {
            System.out.println(ingresso3);

        }

            break;

         case 4:

         double mediaValores = (ingresso1 + ingresso2 + ingresso3) / 3;
         System.out.println(mediaValores);
            
            break; 
  
    }

    input.close();

    }
}
