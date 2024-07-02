package secao20.src.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import secao20.src.db.DB;
import secao20.src.db.DbIntegrityException;

public class ExDeleteApp {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                "DELETE FROM department "
                + "WHERE "
                + "id = ?"
                );

            st.setInt(1, 8);

            int rowsAffected = st.executeUpdate();
            System.out.println("Rows Affected: " + rowsAffected);
        }
        catch(SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
