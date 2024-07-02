package demoDaoJDBC.src.App;

import demoDaoJDBC.src.model.entities.Department;

public class App {
    public static void main(String[] args) {
        Department obj = new Department(1, "Eletronics");
        System.out.println(obj);
    }
}
