
    import java.io.IOException;
    import java.text.DecimalFormat;
    import java.util.Scanner;



    /*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer
    no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula*/

    public class Uni2Exe12 {
    
        public static void main(String[] args) throws IOException {
    
            Scanner input = new Scanner(System.in);
            DecimalFormat deci = new DecimalFormat("0.0000");

            //p1
            double PosicaoAx = input.nextDouble(); //x1
            double PosicaoAy = input.nextDouble(); //y1
            //p2
            double PosicaoBx = input.nextDouble(); //x2
            double PosicaoBy = input.nextDouble(); //y2

            double DisataciaFinal = Math.sqrt(Math.pow((PosicaoBx) - (PosicaoAx), 2) + Math.pow((PosicaoBy) - (PosicaoAy), 2));

            System.out.println(deci.format(DisataciaFinal));

            input.close();
        }
    
    }