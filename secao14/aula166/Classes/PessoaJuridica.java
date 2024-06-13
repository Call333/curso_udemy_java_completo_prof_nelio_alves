package secao14.aula166.Classes;

public class PessoaJuridica extends Pessoa {
    private Integer numerosDeFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
        super(nome, rendaAnual);
        this.numerosDeFuncionarios = nFuncionarios;
    }

    public Integer getNumerosDeFuncionarios() {
        return numerosDeFuncionarios;
    }

    public void setNumerosDeFuncionarios(Integer numerosDeFuncionarios) {
        this.numerosDeFuncionarios = numerosDeFuncionarios;
    }

    @Override
    public Double calcularImposto() {
        Double total = 0.0;
        if(numerosDeFuncionarios > 10){
            total = super.getRendaAnual() * 0.14;
        }else{
            total = super.getRendaAnual() * 0.16;
        }
        return total;
    }

}
