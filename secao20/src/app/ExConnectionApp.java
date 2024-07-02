package secao20.src.app;

import java.sql.Connection;

import secao20.src.db.DB;

public class ExConnectionApp {
    public static void main(String[] args) {
        
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
