package project1.db;
import java.sql.*;
import java.util.Properties;

public class MySQLConnectExample {
    public static void main(String[] args) {
        Connection conn1 = null;

        try {
            String url1 = "jdbc:mysql://localhost:3306";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
            	 System.out.println("Connected to the database test1");
            }
               

        
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        } catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
