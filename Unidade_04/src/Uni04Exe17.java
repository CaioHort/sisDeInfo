import java.util.Scanner;

public class Uni04Exe17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o rendimento anual: R$ ");
        double salarioAnualBruto = input.nextInt();

        System.out.print("Informe o número de dependentes do contribuinte: ");
        int dependentesTotais = input.nextInt();

        double impostoTotal;
        double rendaLiquida = (salarioAnualBruto * 0.02) / dependentesTotais;

        if (rendaLiquida < 2000) {
            impostoTotal = 0;

        } else if (rendaLiquida > 2000 && rendaLiquida < 5000) {
            impostoTotal = rendaLiquida * 0.05;
            
        } else if (rendaLiquida > 5000 && rendaLiquida < 10000) {
            impostoTotal = rendaLiquida * 0.10;

        } else {
            impostoTotal = rendaLiquida * 0.15;
        }

        System.out.println("O valor de imposto a ser pago será: " + impostoTotal);

        input.close();
        
    }

}
