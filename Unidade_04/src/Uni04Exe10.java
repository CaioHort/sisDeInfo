import java.util.Scanner;

public class Uni04Exe10 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a idade dos tres irmaos em ordem: Marquinhos, Zezinho então Luluzinha.");

        int idadeMarquinhos = input.nextInt();
        int idadeZezinho = input.nextInt();
        int idadeLuluzinha = input.nextInt();

        if (idadeMarquinhos > idadeLuluzinha && idadeMarquinhos > idadeZezinho) {
            System.out.println("Marquinhos é o mais velho.");
        }
        if (idadeZezinho > idadeLuluzinha && idadeZezinho > idadeMarquinhos) {
            System.out.println("Zezinho é o mais velho.");
        }
        if (idadeLuluzinha > idadeMarquinhos && idadeLuluzinha > idadeZezinho) {
            System.out.println("Luluzinha é a mais velha.");
        }

        input.close();
    }
}