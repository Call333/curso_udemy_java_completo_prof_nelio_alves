package secao8.aulasetenta.exercicios.um;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo r01 = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        r01.height = sc.nextDouble();
        r01.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", r01.area());
        System.out.printf("PERIMETER = %.2f%n", r01.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", r01.diagonal());

        sc.close();
    }   
}
