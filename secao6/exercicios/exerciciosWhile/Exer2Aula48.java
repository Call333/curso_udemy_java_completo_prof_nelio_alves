package secao6.exercicios.exerciciosWhile;
import java.util.Scanner;

public class Exer2Aula48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
 
        do {
            x = sc.nextInt();
            y = sc.nextInt();
            if(x >= 1 && y >= 1){
                System.out.println("primeiro");
            } else if (x >= 1 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y >= 1) {
                System.out.println("segundo");
            }
        } while (x != 0 && y != 0);
        

        sc.close();

    }
}
