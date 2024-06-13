package secao9.aula100;

import java.util.List;

public class Empregado {
    private Integer id;
    private String nome;
    private Double salario;
    
    public Empregado(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Empregado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

    public static Integer posicao(List<Empregado> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
