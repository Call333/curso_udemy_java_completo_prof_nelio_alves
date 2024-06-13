package secao8.aulasetenta.exercicios.dois;

public class Employee {
    String nome;
    Double glossSalary;
    double tax;

    public double netSalary(){
        return glossSalary - tax;
    }

    public void increaseSalary(double percentage){
        glossSalary = glossSalary * (1 + percentage / 100);
    }
}