package secao8.aulasetenta.exercicios.dois;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee e01 = new Employee();

        e01.nome = sc.nextLine();
        e01.glossSalary = sc.nextDouble();
        e01.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", e01.nome, e01.glossSalary);

        System.out.println("Whick percentage to increase salary? ");
        e01.increaseSalary(sc.nextDouble());

        System.out.printf("Update data: %s, $ %.2f", e01.nome, e01.netSalary());
        sc.close();
    }
}
