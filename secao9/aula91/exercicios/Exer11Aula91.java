package secao9.aula91.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exer11Aula91 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        double[] altura = new double[n];
        char[] genero = new char[n];
        
        int qtdHomens = 0;
        int qtdMulheres = 0;

        

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double h = sc.nextDouble();
            altura[i] = h;
            System.out.printf("Genero da %da pessoa: ", i + 1);
            char g = sc.next().charAt(0);
            genero[i] = g;
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];

        double somaAlturaMulheres = 0.0;

        for (int i = 0; i < genero.length; i++) {
            if(genero[i] == 'F'){
                somaAlturaMulheres += altura[i];
                qtdMulheres += 1;
            } else {
                qtdHomens += 1;
            }  
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }else if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }


        double mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas da mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.println("Numero de homens = " + qtdHomens);

        sc.close();
    }
}
