package secao20.src.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import secao20.src.db.DB;
import secao20.src.db.DbException;

public class DemoTransacaoApp {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE departmentId = 1");

            // Codigo para lançar execeção de teste
            // int x = 2;
			// if (x < 2) {
			// 	throw new SQLException("Fake error");
			// }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE departmentId = 8");

            conn.commit();

            System.out.println("Rows1 Affected: " + rows1);
            System.out.println("Rows2 Affected: " + rows2);
        }   
        catch(SQLException e){
            try {
                conn.rollback();
                throw new DbException("Rolled back! Caused by: " + e.getMessage());
            } catch (SQLException e1) {
                e1.printStackTrace();
                throw new DbException("Error: " + e.getMessage());
            }
        }
    }
}
