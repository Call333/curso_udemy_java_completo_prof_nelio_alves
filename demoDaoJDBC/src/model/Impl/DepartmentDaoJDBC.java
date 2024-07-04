package demoDaoJDBC.src.model.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import demoDaoJDBC.src.db.DbException;
import demoDaoJDBC.src.model.dao.DepartmentDao;
import demoDaoJDBC.src.model.entities.Department;
import secao20.src.db.DB;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn = null;

    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO department (Name)"
                    + "Values (?)",
                    Statement.RETURN_GENERATED_KEYS
                    );

            st.setString(1, obj.getName());

            if(st.executeUpdate() > 0){
                ResultSet rs = st.getGeneratedKeys();
                
                if(rs.next()){
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void update(Department obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Department findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Department> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
