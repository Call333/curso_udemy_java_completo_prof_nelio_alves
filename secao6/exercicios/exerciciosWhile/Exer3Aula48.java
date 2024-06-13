package secao6.exercicios.exerciciosWhile;
import java.util.Scanner;

public class Exer3Aula48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resp, alcool = 0, gasolina = 0, diesel = 0;

        resp = sc.nextInt();
        while(resp != 4){
            if(resp == 1){
                alcool += 1;
            } else if(resp == 2){
                gasolina += 1;
            } else if(resp == 3){
                diesel += 1;
            }
            resp = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
