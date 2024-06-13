package secao14.aula163.Classes;

public class ImportedProduct extends Product {
    private Double customsFee;
    
    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public String priceTag() {
        return super.getName() + " $ " + super.getPrice() + " (Customs fee: $ " + String.format("%.2f", this.customsFee) + ")";
    }

    public Double totalPrice() {
        return super.getPrice() + this.customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
