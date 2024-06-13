package secao6.exercicios.exerciciosFor;
import java.util.Scanner;

public class Exer5Aula54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
        sc.close();
    }
}
