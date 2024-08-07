package secao20.src.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
            st.setDouble(1, 200);
            st.setInt(2, 1);
    
            int rowsAffected = st.executeUpdate();
    
            System.out.println("Rows Affected: " + rowsAffected);
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
