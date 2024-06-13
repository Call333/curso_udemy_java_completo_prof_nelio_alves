package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exer5Aula29 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca, numPecas, codPeca2, numPecas2;
        double valorUnt, valorUnt2, valorAPagar;

        codPeca = sc.nextInt();
        numPecas = sc.nextInt();
        valorUnt = sc.nextDouble();

        codPeca2 = sc.nextInt();
        numPecas2 = sc.nextInt();
        valorUnt2 = sc.nextDouble();

        valorAPagar = (numPecas * valorUnt + numPecas2 * valorUnt2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar );

        sc.close();
    }
}
