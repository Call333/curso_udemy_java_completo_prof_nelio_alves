package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer4Aula29 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int empregado, hora;
        double valorHora, salario;

        empregado = sc.nextInt();
        hora = sc.nextInt();
        valorHora = sc.nextDouble();

        salario =  hora * valorHora;
        
        System.out.println("NUMBER = " + empregado);
        System.out.println("SALARY = U$ " + salario);

        sc.close();

    }
}
