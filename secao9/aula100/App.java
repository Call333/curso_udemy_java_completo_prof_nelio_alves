package secao9.aula100;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> empregados = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d:%n", (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            Double salario = sc.nextDouble();
            empregados.add(new Empregado(id, nome, salario));
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int resp = sc.nextInt();

        Empregado emp = empregados.stream().filter(e -> e.getId() == resp).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.setSalario(emp.getSalario() + (percentage / 100 * emp.getSalario()));
        }

        System.out.println();
        System.out.println("List of Employees:");
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
        sc.close();
    }
}
