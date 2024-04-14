import java.util.Scanner;

/*°F = (9/5) °C + 32 */

public class Uni3Exe11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();

        double farenheit = 9.0 / 5 * celsius + 32;

        System.out.println(farenheit);

        input.close();
    }
}
