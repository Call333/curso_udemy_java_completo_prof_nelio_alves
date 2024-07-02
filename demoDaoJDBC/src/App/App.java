package demoDaoJDBC.src.App;

import java.util.Date;

import demoDaoJDBC.src.model.dao.DaoFactory;
import demoDaoJDBC.src.model.dao.SellerDao;
import demoDaoJDBC.src.model.entities.Department;
import demoDaoJDBC.src.model.entities.Seller;

public class App {
    public static void main(String[] args) {
        // Department obj = new Department(1, "Eletronics");
        // System.out.println(obj);

        // Seller slr = new Seller(1, "Rose Marie", "roma@gmail.com", new Date(), 3000.00, obj);
        // System.out.println(slr);

        SellerDao sellerDao = DaoFactory.createSellerDao(); 
        Seller seller = sellerDao.findById(7);
        System.out.println(seller);
    }
}
