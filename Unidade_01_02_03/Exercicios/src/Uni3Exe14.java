import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a distância percorrida durante a viagem em km: ");
        double distanciaTotal = input.nextDouble();

        System.out.print("Informe o tempo gasto durante a viagem (em horas): ");
        double tempo = input.nextDouble();

        double velocidadeMedia = distanciaTotal / tempo;
        double combustivel = distanciaTotal / 12;

        System.out.printf("Velocidade média: %.1fkm/h\n Combustível gasto: %.1fL", velocidadeMedia, combustivel);

        input.close();

    }

}