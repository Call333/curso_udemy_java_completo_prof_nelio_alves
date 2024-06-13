package secao9.aula91.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exer10Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int a = sc.nextInt();
        String[] alunos = new String[a];
        double[] notas1 = new double[a];
        double[] notas2 = new double[a];

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i + 1);
            sc.nextLine();
            String n = sc.nextLine();
            double g1 = sc.nextDouble();
            double g2 = sc.nextDouble();

            alunos[i] = n;
            notas1[i] = g1;
            notas2[i] = g2;
        }
        
        System.out.println();
        System.out.println("Alunos aprovados: ");
        double media;
        for (int i = 0; i < alunos.length; i++) {
            media = (notas1[i] + notas2[i]) / 2;
            if(media >= 6.0){
                System.out.println(alunos[i]);
            }
        }
        
        sc.close();
        
    }
}
