package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnectionProduct {

    static Statement st;
    static Connection con;
    ResultSet rs;
    PreparedStatement pst;
  
 
    
    private static Connection instance;
    
    
    
    public static Connection getInstance(){
        if(instance == null){
            instance = getCon();
        }
        return instance;
    }
    
    
    
    
    
    private DBconnectionProduct() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project_final", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    private static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project_final", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return con;
    }

   
}