//o raio de um circulo é sempre a metade o seu diametro.

import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
		
		double raio, area, raioEle;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		raioEle = Math.pow(raio, 2);
		
		area = pi * raioEle;
		
		System.out.printf("A= %.4f%n", area);
		
		sc.close();

    }
}
