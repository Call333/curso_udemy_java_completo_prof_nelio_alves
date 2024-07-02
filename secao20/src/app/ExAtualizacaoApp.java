package secao20.src.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import secao20.src.db.DB;

public class ExAtualizacaoApp {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
    
        try {
            conn = DB.getConnection();
            
            st = conn.prepareStatement(
                "UPDATE seller "
                + "SET BaseSalary = BaseSalary + ? "
                + "WHERE (departmentId = ?)", 
                Statement.RETURN_GENERATED_KEYS
                );
    
            st.setDouble(1, 170);
            st.setInt(2, 1);
    
            int rowsAffected = st.executeUpdate();
    
            if(rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! Id Affected = " + id);
                }
                DB.closeResultSet(rs);
            }else{
                System.out.println("No rows affected!");
            }
    
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }

}
