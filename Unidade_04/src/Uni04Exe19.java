import java.util.Scanner;

public class Uni04Exe19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de X: ");
        float x = input.nextFloat();

        System.out.println("Informe o valor de Y: ");
        float y = input.nextFloat();

        int quadrante;

        if (x == 0 && y == 0) {
            quadrante = 0;
            
        } else if (x > 0 && y > 0) {
            quadrante = 1;
            
        } else if (x > 0 && y < 0) {
            quadrante = 2;
            
        } else if (x < 0 && y < 0) {
            quadrante = 3;
            
        } else{
            quadrante = 4;
            
        }

        System.out.printf("O ponto com as coordenadas X = %.1f / Y = %.1f está no quadrante %d", x, y, quadrante);

        input.close();
    }

}
