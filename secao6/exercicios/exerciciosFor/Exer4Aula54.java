package secao6.exercicios.exerciciosFor;
import java.util.Scanner;

public class Exer4Aula54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double p1, p2, divisao;

        for(int i = 0; i < n; i++){
            p1 = sc.nextInt();
            p2 = sc.nextInt();
            
            if(p2 == 0){
                System.out.println("divisao impossivel");
            }else{
                divisao = p1 / p2;
                System.out.println(divisao);
            }
        }

        sc.close();
    }
}
