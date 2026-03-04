package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_02_Insert {
    public static void main(String[] args) {
        // 1: load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found"+e.getMessage());
        }
        // 2: connect to the database
        String url="jdbc:mysql://localhost:3306/jdbc_db";
        String user="root";
        String password="sufi";
        String query="INSERT INTO employee (id, name, job_title, salary) VALUES(5, 'Karan Mehta', 'Project Manager', 75000.00)";

        try {
            Connection con= DriverManager.getConnection(url,user,password);
            System.out.println("Connection Established.....");
            Statement stmt=con.createStatement();
        int rowsAffected=    stmt.executeUpdate(query);
        if(rowsAffected>0){
            System.out.println(" Inserted Successfully."+rowsAffected+" Row(s) Affected.");
        }
            stmt.close();
            con.close();
            System.out.println("Connection Closed Successfully.....");

        } catch (SQLException e) {
            System.out.println("Connection failed"+e.getMessage());
        }
    }
}
