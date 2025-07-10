package util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/customermanager";
    public static final String USER = "root";
    public static final String PASS = "123456@";

    public static Connection openConnection() {
        Connection conn = null;
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
        }catch (ClassNotFoundException | SQLException ex){
            throw new RuntimeException();
        }
        return conn;
    }
    public static void closeConnection(Connection conn, CallableStatement cstmt) {
        if(conn != null){
            try{
                conn.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if(cstmt != null){
            try{
                cstmt.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
