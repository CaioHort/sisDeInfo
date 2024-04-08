import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo deseja utilizar o sistema? [s/n]");
        String infor = input.nextLine();

        if (infor.equals("n")) {
            System.out.println("Obrigado!");
            System.exit(0);

        } else if (!infor.equals("s")) {
            System.out.println("Opção invalida");
            System.exit(0);

        } else {
            do {
                System.out.println(" Gostaria de cadastrar aluno e nota? ");
                System.out.println(" =================== ");
                System.out.println(" 1-Sim ");
                System.out.println(" 2-Não ");

                int escolha = input.nextInt();
                input.nextLine();

                switch (escolha) {

                    case 1:

                        System.out.println("Digite o nome do aluno:");

                        char NomeAluno = input.next().charAt(0);

                        System.out.println("Digite as 3 notas semestrais do aluno:");

                        double Nota1 = input.nextDouble();
                        double Nota2 = input.nextDouble();
                        double Nota3 = input.nextDouble();

                        double NotaMedia = (Nota1 + Nota2 + Nota3) / 3;

                        System.out.println(NomeAluno);
                        System.out.printf("MEDIA: %.1f%n", NotaMedia);

                        break;

                    case 2:

                        System.out.println("Obrigado!");
                        System.exit(0);
                        break;
                }

            } while (infor.equals("s"));
        }

        input.close();
    }
}