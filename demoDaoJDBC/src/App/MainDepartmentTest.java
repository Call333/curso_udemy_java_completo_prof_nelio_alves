package demoDaoJDBC.src.App;

import java.util.List;

import demoDaoJDBC.src.model.dao.DaoFactory;
import demoDaoJDBC.src.model.dao.DepartmentDao;
import demoDaoJDBC.src.model.entities.Department;

public class MainDepartmentTest {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        
        System.out.println("\n ---> TEST 1: insert() <--- ");
        Department dep = new Department(null, "Sports and Adventure");
        // departmentDao.insert(dep);
        System.out.println("Inserted!");

        System.out.println("\n ---> TEST 2: update() <--- ");
        dep.setId(14);
        dep.setName("Games");
        departmentDao.update(dep);
        System.out.println("Updated!");

        System.out.println("\n ---> TEST 3: deleteById() <--- ");
        departmentDao.deleteById(15);
        System.out.println("Deleted!");

        System.out.println("\n ---> TEST 4: findById() <--- ");
        Department d = departmentDao.findById(12);
        System.out.println(d);
        System.out.println("finded!");

        System.out.println("\n ---> TEST 5: findById() <--- ");
        List<Department> departments = departmentDao.findAll();
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}
