package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_08_UpdatePrepareStmt {
    static void main() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jdbc_db";
        String user="root";
        String password="sufi";

        String query="UPDATE employee SET job_title=? WHERE id=?";

        Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Connection established.");
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1, "Salesforce Engineer");
        stmt.setInt(2, 2);
        int affectedRows=stmt.executeUpdate();
        if(affectedRows>0)
            System.out.println("Updated successfully."+affectedRows+" Row(s) affected.");
        else
            System.out.println("No Rows affected.");
        con.close();
        stmt.close();
        System.out.println("Connection Closed Successfully.....");
    }
}
