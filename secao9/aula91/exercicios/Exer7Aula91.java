package secao9.aula91.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer7Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        double soma = 0.0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            double j = sc.nextDouble();
            numeros[i] = j;
            soma += numeros[i];
        }
        double media = soma / numeros.length;

        System.out.println();
        System.out.println("MEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < numeros.length; i++) {
            if(media > numeros[i]){
                System.out.printf("%.1f%n", numeros[i]);
            }
        }

        sc.close();
    }
}
