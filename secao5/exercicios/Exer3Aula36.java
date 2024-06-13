package secao5.exercicios;
import java.util.Scanner;

public class Exer3Aula36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) {
            if (a % b == 0){
                System.out.println("Sao Multiplos");
            }else if (a % b != 0) {
                System.out.println("Nao sao Multiplos");
            }
        } else if(b > a) {
            if (b % a == 0){
                System.out.println("Sao Multiplos");
            }else if (b % a != 0) {
                System.out.println("Nao sao Multiplos");
            }
        }

        sc.close();
    }
}
