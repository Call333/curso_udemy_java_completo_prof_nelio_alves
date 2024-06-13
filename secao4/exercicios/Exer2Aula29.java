package exercicios;
import java.util.Scanner;

public class Exer2Aula29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r, pi, area;

        pi = 3.14159;
        r = sc.nextDouble();

        area = pi * r*r;

        System.out.printf("A=%.4f%n", area);
        
        sc.close();

    }

}
