package secao9.aula91.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer4Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            int j = sc.nextInt();
            numeros[i] = j;
        }

        int qtdPares = 0;
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
                qtdPares += 1;
            }
        }

        System.out.println();
        System.out.print("QUANTIDADE DE PARES: " + qtdPares);

        sc.close();
    }
}