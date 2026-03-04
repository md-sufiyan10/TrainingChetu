package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_06_InsertPreparedStmt {
    static void main() throws ClassNotFoundException {
     Class.forName("com.mysql.cj.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/jdbc_db";
     String user="root";
     String password="sufi";

     try (Connection con = DriverManager.getConnection(url, user, password)) {
         System.out.println("Connection established.");
         String sql = "INSERT INTO employee (id,name, job_title,salary) VALUES (?, ?,?,?)";
         PreparedStatement stmt = con.prepareStatement(sql);
         stmt.setInt(1, 4);
         stmt.setString(2, "Bhai");
         stmt.setString(3, " Engineer");
         stmt.setDouble(4, 5000);
        int affectedRows= stmt.executeUpdate();
        if (affectedRows > 0) {
            System.out.println("Inserted successfully.");
        } else {
            System.out.println("Failed to insert.");
        }
         con.close();
        stmt.close();
     } catch (SQLException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         throw new RuntimeException(e);
     }

     System.out.println("Connection closed.");
    }
}
