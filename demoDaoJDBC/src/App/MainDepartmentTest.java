package demoDaoJDBC.src.App;

import demoDaoJDBC.src.model.dao.DaoFactory;
import demoDaoJDBC.src.model.dao.DepartmentDao;
import demoDaoJDBC.src.model.entities.Department;

public class MainDepartmentTest {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        
        System.out.println("\n ---> TEST 1: insert() <--- ");
        Department dep = new Department(null, "Sports and Adventure");
        departmentDao.insert(dep);
        System.out.println("Inserted!");
        
    }
}
