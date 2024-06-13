package secao8.aulas73;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double cotDolar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double qtdDolar = sc.nextDouble();

        double total = CurrencyConverter.calcularConversao(cotDolar, qtdDolar);

        System.out.printf("Amount to be paid in reais = %.2f", total);

        sc.close();
    }
}
