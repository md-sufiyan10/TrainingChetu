package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_03_DeleteData {
    static void main() throws SQLException {
        // 1:load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found"+e.getMessage());

        }
        // 2: connect to the database
        String url="jdbc:mysql://localhost:3306/jdbc_db";
        String user="root";
        String password="sufi";
        String query="DELETE FROM employee WHERE id=4";

        Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established.....");
        // 3: Create a statement
        Statement stmt=con.createStatement();
        int rowsAffected=stmt.executeUpdate(query);
        if(rowsAffected>0){
            System.out.println("Deleted Successfully."+rowsAffected+" Row(s) Affected.");
        }else{
            System.out.println("No Rows Affected.");
        }
        con.close();
        stmt.close();
        System.out.println("Connection Closed Successfully.....");
    }
}
