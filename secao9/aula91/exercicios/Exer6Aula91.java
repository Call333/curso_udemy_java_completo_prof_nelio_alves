package secao9.aula91.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer6Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            int j = sc.nextInt();
            vetorA[i] = j;
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            int j = sc.nextInt();
            vetorB[i] = j;
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetorB.length; i++) {
            int soma = vetorA[i] + vetorB[i];
            vetorC[i] = soma;
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorC[i]);
        }

        sc.close();
    }
}
