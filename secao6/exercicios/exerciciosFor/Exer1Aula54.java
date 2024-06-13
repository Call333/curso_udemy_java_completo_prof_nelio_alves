package secao6.exercicios.exerciciosFor;
import java.util.Scanner;

public class Exer1Aula54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(1 <= x || x <= 1000){
            for(int i = 1; i < x; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
