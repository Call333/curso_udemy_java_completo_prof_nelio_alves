package secao9.aula91.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer9Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int p = sc.nextInt();
        String[] nomes = new String[p];
        int[] idades = new int[p];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Dados da %d pessoa: %n", i+1);
            String n = sc.next();
            int y = sc.nextInt();

            nomes[i] = n;
            idades[i] = y;
        }

        int idadePessoaMaisVelha = idades[0];
        String nomePessoaMaisVelha = nomes[0];
        for (int i = 0; i < idades.length; i++) {
            if(idades[i] > idadePessoaMaisVelha){
                nomePessoaMaisVelha = nomes[i];
                idadePessoaMaisVelha = idades[i];
            }
        }   

        System.out.println("PESSOA MAIS VELHA: " + nomePessoaMaisVelha);

        sc.close();
    }
}
