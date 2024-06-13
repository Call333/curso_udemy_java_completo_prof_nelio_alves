package secao6.exercicios.exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class Exer3Aula54 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double a1 = 0, a2 = 0, a3 = 0, mediaPonderada;

        for (int i = 0; i < n; i++) {
            a1 = sc.nextDouble();
            a2 = sc.nextDouble();
            a3 = sc.nextDouble();
            
            mediaPonderada = (a1 * 2 + a2 * 3 + a3 * 5) / (2 + 3 + 5);

            System.out.printf("%.1f%n", mediaPonderada);
        }
        
        sc.close();
    }
}
