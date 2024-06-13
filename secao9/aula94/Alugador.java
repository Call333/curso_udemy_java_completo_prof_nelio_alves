package secao9.aula94;

public class Alugador {
    private String nome;
    private String email;
    private int quarto;

    public Alugador(String nome, String email, int quarto){
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public Alugador(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getquarto() {
        return quarto;
    }

    public void setquarto(int quarto) {
        this.quarto = quarto;
    }

    public String toString(){
        return nome + ", " + email;
    }
}
