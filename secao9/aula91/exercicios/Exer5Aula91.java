package secao9.aula91.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer5Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            double j = sc.nextDouble();
            numeros[i] = j;
        }

        double maiorValor = numeros[0];
        int o = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                o = i;
            }
        }

        System.out.println("");
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + o);

        sc.close();
    }
}
