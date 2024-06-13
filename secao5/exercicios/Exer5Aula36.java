package secao5.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exer5Aula36 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codItem, qtdItem;
        double valorTotal = 0;

        codItem = sc.nextInt();
        qtdItem = sc.nextInt();

        if(codItem == 1){
            valorTotal = qtdItem * 4;
        }else if(codItem == 2){
            valorTotal = qtdItem * 4.5;
        }else if(codItem == 3){
            valorTotal = qtdItem * 5;
        }else if(codItem == 4){
            valorTotal = qtdItem * 2;
        }else if(codItem == 5){
            valorTotal = qtdItem * 1.5;
        }

        System.out.printf("Total: %.2f%n", valorTotal);

        sc.close();
    }
}
