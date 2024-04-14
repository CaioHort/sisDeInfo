import java.util.Scanner;

public class Uni04Exe16 {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a idade do homem 1: ");
        int homem1 = input.nextInt();
        System.out.print("Informe a idade do homem 2: ");
        int homem2 = input.nextInt();

        System.out.print("Informe a idade da mulher 1: ");
        int mulher1= input.nextInt();
        System.out.print("Informe a idade da mulher 2: ");
        int mulher2 = input.nextInt();

        int somaTotal;
        int produtoTotal;

        if (homem1 > homem2 && mulher1 < mulher2) {
            somaTotal = homem1 + mulher1;
            produtoTotal = homem2 * mulher2;
            System.out.printf("A soma das idades será %d e o produto %d", somaTotal, produtoTotal);
            
        } else if (homem1 > homem2 && mulher1 > mulher2) {
            somaTotal = homem1 + mulher2;
            produtoTotal = homem2 * mulher1;
            System.out.printf("A soma das idades será %d e o produto %d", somaTotal, produtoTotal);
    
        } else if (homem1 < homem2 && mulher1 < mulher2) {
            somaTotal = homem2 + mulher1;
            produtoTotal = homem1 * mulher2;
            System.out.printf("A soma das idades será %d e o produto %d", somaTotal, produtoTotal); 
         } else {
            somaTotal = homem2 + mulher2;
            produtoTotal = homem1 * mulher1;
            System.out.printf("A soma das idades será %d e o produto %d", somaTotal, produtoTotal);
        }    

        input.close();

    }
}