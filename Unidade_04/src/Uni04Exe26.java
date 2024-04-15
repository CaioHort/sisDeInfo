import java.util.Scanner;

public class Uni04Exe26 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escolha uma opção de cáluclo de área(q=quadrado; t=triângulo; r=retãngulo; c=circuclo...)");
        String letra = teclado.nextLine().toUpperCase();
        char ope = letra.charAt(0);

        if (ope == 'Q'){
            System.out.print("Lado...");
            float lado = teclado.nextFloat();
            float resu = lado * lado;
            System.out.printf("Resultado é %.2f", resu);
        } else if (ope == 'T'){
            System.out.print("Base...");
            float lado = teclado.nextFloat();
            System.out.print("Altura...");
            float alt = teclado.nextFloat();
            float resu = lado * alt / 2;
            System.out.printf("Resultado é %.2f", resu);
        } else if (ope == 'R'){
            System.out.print("Base...");
            float lado = teclado.nextFloat();
            System.out.print("Altura...");
            float alt = teclado.nextFloat();
            float resu = lado * alt;
            System.out.printf("Resultado é %.2f", resu);
        } else if (ope == 'C') {
            System.out.print("Raio...");
            double raio = teclado.nextDouble();
            double resu = Math.PI * Math.pow(raio, 2);
            System.out.printf("Resultado é %.2f", resu);
        } else {
            System.out.println("Operação Inválida");
        }

        teclado.close();
    }

}