import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double Nota100 = sc.nextDouble();

		System.out.println(Nota100 + "%.f%n nota(s) de R$ 100,00");

		sc.close();
	}
}