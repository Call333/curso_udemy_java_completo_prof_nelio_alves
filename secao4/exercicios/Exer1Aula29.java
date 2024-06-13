package exercicios;
import java.util.Scanner;

public class Exer1Aula29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, resultado;
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        resultado = n1 + n2;

        System.out.println("SOMA = " + resultado);

        sc.close();
    }
}