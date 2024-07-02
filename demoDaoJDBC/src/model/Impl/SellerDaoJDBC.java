package demoDaoJDBC.src.model.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import demoDaoJDBC.src.db.DbException;
import demoDaoJDBC.src.model.dao.SellerDao;
import demoDaoJDBC.src.model.entities.Department;
import demoDaoJDBC.src.model.entities.Seller;
import secao20.src.db.DB;

public class SellerDaoJDBC implements SellerDao{

    private Connection conn;

    public SellerDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Seller obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Integer obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            st = conn.prepareStatement(
                "SELECT seller.*,department.Name as DepName "
                + "FROM seller INNER JOIN department "
                + "ON seller.DepartmentId = department.Id "
                + "WHERE seller.Id = ?"
                );

            st.setInt(1, id);

            rs = st.executeQuery();
            while(rs.next()){

                Department department = initeDepartment(rs);

                Seller seller = initeSeller(rs, department);1

                return seller;
            }
            return null;
        }
        catch(SQLException e){
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }   

    @Override
    public List<Seller> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
    public Department initeDepartment(ResultSet rs) throws SQLException{
        Department dep = new Department();
        dep.setId(rs.getInt("DepartmentId"));
        dep.setName(rs.getString("DepName"));
        return dep;
    }

    public Seller initeSeller(ResultSet rs, Department dep) throws SQLException {
        Seller slr = new Seller();
        slr.setId(rs.getInt("Id"));
        slr.setName(rs.getString("Name"));
        slr.setEmail(rs.getString("Email"));
        slr.setBirthDate(rs.getDate("BirthDate"));
        slr.setBaseSalary(rs.getDouble("BaseSalary"));
        slr.setDepartment(dep);
        return slr;
    }

}
