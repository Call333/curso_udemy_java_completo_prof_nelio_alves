package secao9.aula91.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer3Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        double somaAlturas = 0.0;

        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa: %n", i+1 );
            System.out.printf("Nome: ");
            nome[i] = sc.next();
            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
            System.out.printf("Altura: ");
            altura[i] = sc.nextDouble();
            somaAlturas += altura[i];
        }
        
        double mediaAlturas = somaAlturas / altura.length;
        double qtdPessoasComMenos16 = 0;
        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                qtdPessoasComMenos16 += 1;
            }
        }

        double porcentagem = qtdPessoasComMenos16 / idade.length * 100;
        String porcentFormatada = String.format("%.1f", porcentagem);

        System.out.printf("Altura média: %.2f%n", mediaAlturas);
        System.out.print("Pessoas com menos de 16 anos: " + porcentFormatada + "%\n");

        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }

}
