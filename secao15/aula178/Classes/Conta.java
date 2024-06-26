package secao15.aula178.Classes;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double saqueLimite;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo, Double saqueLimite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.saqueLimite = saqueLimite;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void withdraw(double amount) {
		validateWithdraw(amount);
		this.saldo -= amount;
	}
	
	private void validateWithdraw(double amount) {
		if (amount > getSaqueLimite()) {
			throw new ExecptionDeConta("Erro de saque: A quantia excede o limite de saque");
		} 
		if (amount > getSaldo()) {
			throw new ExecptionDeConta("Erro de saque: Saldo insuficiente");
		}
	}

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaqueLimite() {
        return saqueLimite;
    }

    public void setSaqueLimite(Double saqueLimite) {
        this.saqueLimite = saqueLimite;
    }

}
