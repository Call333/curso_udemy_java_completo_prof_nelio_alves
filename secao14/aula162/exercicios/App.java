package secao14.aula162.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14.aula162.exercicios.Classes.Employee;
import secao14.aula162.exercicios.Classes.OutSourcedEmployee;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int qtdEmp= sc.nextInt();
        sc.nextLine();

        List<Employee> empregados = new ArrayList<>();

        for (int i = 0; i < qtdEmp; i++) {
            System.out.printf("Employee #%d data: %n", (i + 1));
            System.out.print("Outsourced (y/n)? ");
            char respOutsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Hours: ");
            int horas = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextInt();
            if(respOutsourced == 'y'){
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();
                empregados.add(new OutSourcedEmployee(nome, horas, valuePerHour, addCharge));
            } else {
                empregados.add(new Employee(nome, horas, valuePerHour));
            }
        }  

        System.out.println("PAYMENTS: ");
        for (Employee employee : empregados) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", 
            employee.payment()));
        }

        sc.close();
    }
}
