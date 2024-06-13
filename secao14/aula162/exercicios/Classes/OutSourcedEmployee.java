package secao14.aula162.exercicios.Classes;

public class OutSourcedEmployee extends Employee {

    private double additonalCharge;

    public OutSourcedEmployee(){

    }

    public OutSourcedEmployee(String name, Integer hours, double valuePerHour, double additonalCharge) {
        super(name, hours, valuePerHour);
        this.additonalCharge = additonalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additonalCharge * 1.1;
    }
}
