import java.util.Scanner;

public class Uni04Exe12 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe lado 1...:");
        int lado1 = input.nextInt();
        System.out.print("Informe lado 2...:");
        int lado2 = input.nextInt();
        System.out.print("Informe lado 3...:");
        int lado3 = input.nextInt();
        
        if (lado1 < lado2 + lado3) && 
        (lado2 < lado2 + lado3) &&
        (lado3 < lado1 + lado2) {
                if ((lado1 == lado2) && (lado1 == lado3)) {
                    System.out.println("Triangulo equilatero");
                } else if ((lado1 == lado2) ||
                (lado 2 == lado3) ||
                (lado3 == lado1)) {
                    System.out.println("Triangulo isóseles");
                } else {
                    System.out.println("Triangulo escaleno");
                }
        } else {
            System.out.println("Não forma um triangulo");
        }

        
        input.close();
    }
}