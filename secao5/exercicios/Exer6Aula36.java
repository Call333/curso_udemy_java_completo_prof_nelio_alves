package secao5.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exer6Aula36 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double entrada = sc.nextDouble();

        if(0.00 < entrada && entrada <= 25.00){
            System.out.println("Intervalo [0,25]");
        } else if(25.00 < entrada && entrada <= 50.00){
            System.out.println("Intervalo (25,50]");
        } else if(50.00 < entrada && entrada <= 75.00){
            System.out.println("Intervalo (50,75]");
        } else if(75.00 < entrada && entrada <= 100.00){
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
