package secao14.aula166.Classes;

public class PessoaFisica extends Pessoa {
    private Double gastosComSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double calcularImposto() {
        Double total = 0.0;
        if(super.getRendaAnual() < 20000.00){
            total = (super.getRendaAnual() * 0.15) - (this.gastosComSaude * 0.5);
        } else {
            total = (super.getRendaAnual() * 0.25) - (this.gastosComSaude * 0.5);
        }
        return total;
    }

}
