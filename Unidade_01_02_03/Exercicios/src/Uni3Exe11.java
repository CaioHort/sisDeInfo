
import java.io.IOException;
import java.util.Scanner;

/*°F = (9/5) °C + 32 */

public class Uni3Exe11 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double Celsius = input.nextDouble();

        double Farenheit = ((9 / 5) * Celsius) + 32;

        System.out.println(Farenheit);


        input.close();
    }
}
