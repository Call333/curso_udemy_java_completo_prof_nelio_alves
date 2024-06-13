package secao9.aula91.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer2Aula91 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int n = sc.nextInt();
        double[] numeros = new double[n];
        
        for(int i = 0; i < n; i++){
            double j = sc.nextInt();
            numeros[i] = j;
            soma += numeros[i];
        }

        double media = soma/numeros.length;

        System.out.print("VALORES = ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(" " + numeros[i]);
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);
        sc.close();

    }
}
