package secao15.aula174.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservaHotel {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer numeroDoQuarto;
    private Date dataEntrada;
    private Date dataSaida;

    public ReservaHotel() {

    }

    public ReservaHotel(Integer numeroDoQuarto, Date dataEntrada, Date dataSaida) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }  

    public Integer duracao(){
        Integer duracao = dataEntrada.getDay();
        return duracao;
    }

    public void atualizarDatas(Date entrada, Date saida){

    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(Integer numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

}
