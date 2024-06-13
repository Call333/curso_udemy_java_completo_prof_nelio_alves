package secao5.exercicios;
import java.util.Scanner;

public class Exer1Aula36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resp = sc.nextInt();

        if(resp > 0){
            System.out.println("NÃO NEGATIVO");
        }else if (!(resp > 0)) {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}