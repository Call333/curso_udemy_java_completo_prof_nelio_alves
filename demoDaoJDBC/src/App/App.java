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
        Department obj = new Department(4, null);
        List<Seller> listSellers = sellerDao.findByDepartment(obj);
        for (Seller slr : listSellers) {
            System.out.println(slr);
        }

        System.out.println("\n ---> TEST 3: findAll() <--- ");
        List<Seller> listSellers2 = sellerDao.findAll();
        for (Seller slr : listSellers2) {
            System.out.println(slr);
        }

        // System.out.println("\n ---> TEST 4: Seller Insert <--- ");
        // Seller newSeller = new Seller(null, "Ycaro", "yro@gmail.com", new Date(), 2300.0, new Department(4, null));
        // sellerDao.insert(newSeller);
        // System.out.println("Inserted! New Id = " + newSeller.getId());

        System.out.println("\n ---> TEST 5: update() <--- ");

        Seller seller4 = sellerDao.findById(15);
        seller4.setName("Jack");
        seller4.setEmail("jack@gmail.com");
        sellerDao.update(seller4);

        System.out.println("Upadated! Id Affected: " + seller4.getId());

        System.out.println("\n ---> TEST 6: deleteById() <--- ");
        sellerDao.deleteById(17);
        System.out.println("Deleted!");
    }
}
