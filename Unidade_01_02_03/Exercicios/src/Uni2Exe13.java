
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer
no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula*/

public class Uni2Exe13 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.000");

        double Horas = input.nextDouble();
        double KilometrosPorHora = input.nextDouble();

        double LitragemTotal = (KilometrosPorHora / 12) * Horas;

        System.out.println(deci.format(LitragemTotal));

        input.close();
    }

}