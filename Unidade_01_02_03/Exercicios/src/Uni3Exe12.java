import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nomeFuncionario = input.nextLine();

        System.out.print("Informe o número de horas trabalhadas mensalariomente: ");
        int horasTrabalhadas = input.nextInt();

        System.out.print("Informe seu número de dependentes: ");
        int dependentes = input.nextInt();

        double salarioHora = 10.00;

        double salarioBruto = salarioHora * horasTrabalhadas + (60.00 * dependentes);

        double inss = salarioBruto * 0.085;
        double ir = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - inss - ir;

        System.out.println("\nRELATÓRIO FINAL:");
        System.out.printf("nomeFuncionario: %s\n", nomeFuncionario);
        System.out.printf("salário Bruto: R$%.2f\n", salarioBruto);
        System.out.printf("salário Líquido: R$%.2f", salarioLiquido);

        input.close();

    }

}