package secao9.aula91.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer8Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        int somaPares = 0;
        int qtdIndicePares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            int j = sc.nextInt();
            numeros[i] = j;
            if(numeros[i] % 2 == 0){
                somaPares += numeros[i];
                qtdIndicePares += 1;
            }
        }

        if(somaPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else{
            double mediaPares = somaPares / qtdIndicePares;
            System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
        }

        sc.close();
    }
}
