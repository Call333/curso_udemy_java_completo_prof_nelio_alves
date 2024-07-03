package demoDaoJDBC.src.App;

import java.util.Date;
import java.util.List;

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

        System.out.println(" ---> TEST 1: findById() <--- ");

        SellerDao sellerDao = DaoFactory.createSellerDao(); 
        Seller seller = sellerDao.findById(5);
        System.out.println(seller);

        System.out.println("\n ---> TEST 2: findByDepartment() <--- ");
        Department obj = new Department(1, null);
        List<Seller> listSellers = sellerDao.findByDepartment(obj);
        for (Seller slr : listSellers) {
            System.out.println(slr);
        }

    }
}
