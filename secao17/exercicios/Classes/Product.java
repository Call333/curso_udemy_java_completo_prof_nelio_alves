package secao17.exercicios.Classes;

public class Product {
    private String nome;
    private Double value;
    private int quantity;

    public Product(){

    }

    public Product(String nome, Double value, int quantity){
        this.nome = nome;
        this.value = value;
        this.quantity = quantity;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return 
        getNome() + "," + String.format("%.2f", getValue()) + "," + getQuantity();
    }

    public Double valorTotal(){
        return getValue() * getQuantity();
    }
}
