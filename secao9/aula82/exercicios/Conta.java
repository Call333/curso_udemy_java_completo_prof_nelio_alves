package secao9.aula82.exercicios;

public class Conta {
    private int numeroDaConta;
    private String titular;
    private double saldo;

    public Conta(int numeroDaConta, String titular, double depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public Conta(int numeroDaConta, String titular){
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor + 5;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
