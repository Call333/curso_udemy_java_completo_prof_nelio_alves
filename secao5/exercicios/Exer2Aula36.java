package secao5.exercicios;
import java.util.Scanner;

public class Exer2Aula36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resp = sc.nextInt();

        if(resp % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
