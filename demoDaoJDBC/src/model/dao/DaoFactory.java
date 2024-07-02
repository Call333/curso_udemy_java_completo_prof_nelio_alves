package demoDaoJDBC.src.model.dao;

import demoDaoJDBC.src.model.Impl.SellerDaoJDBC;
import secao20.src.db.DB;

public class DaoFactory {
    
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

}
