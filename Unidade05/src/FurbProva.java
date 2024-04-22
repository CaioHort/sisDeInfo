import java.util.Scanner;

public class FurbProva {
    public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);

    System.out.println("Insira a letra do bloco da FURB...");  
    String letraFurb = input.nextLine().toUpperCase();
    char letraFurbChar = letraFurb.charAt(0);

    input.close();

    if (letraFurbChar == 'T'){
        System.out.println("Bloco da FURB TV");
        
    } else if (letraFurbChar == 'S'){
        System.out.println("Bloco da Computação");
       
    } else if (letraFurbChar == 'M'){
        System.out.println("Bloco da Moda");
        
    } else {
        System.out.println("Entrada Incorreta");
    }


    }
}
