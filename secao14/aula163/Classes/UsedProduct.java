package secao14.aula163.Classes;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product{

    SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String priceTag(){
        return super.getName() + " (used) $ " + super.getPrice() + " (Manufacture date: " + sdf01.format(manufactureDate) + ")";
    }

    public Date getManufactureDatemanufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDatemanufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
