package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_04_UpdateQuery {
    static void main() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jdbc_db";
        String user="root";
        String password="sufi";
        String query="UPDATE employee SET job_title='Devos Engineer' WHERE id=2";

        Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established.....");

        Statement stmt=con.createStatement();
        int rowsAffected=stmt.executeUpdate(query);
        if(rowsAffected>0){
            System.out.println("Updated Successfully."+rowsAffected+" Row(s) Affected.");
        }else{
            System.out.println("No Rows Affected.");
        }
        con.close();
        stmt.close();
        System.out.println("Connection Closed Successfully.....");
    }
}
