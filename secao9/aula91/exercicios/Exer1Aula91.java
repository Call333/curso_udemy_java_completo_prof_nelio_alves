package secao9.aula91.exercicios;

import java.util.Scanner;

public class Exer1Aula91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int j = sc.nextInt();
            numeros[i] = j;
        }
        System.out.println("Numeros negativos: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
