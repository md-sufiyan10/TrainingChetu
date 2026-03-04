package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_07_DeletePrepareStm {
    static void main() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jdbc_db";
        String user="root";
        String password="sufi";
        String query="DELETE FROM employee WHERE id=?";

        try(Connection con= DriverManager.getConnection(url,user,password)){
            System.out.println("Connection established.");
            PreparedStatement stmt=con.prepareStatement(query);
            stmt.setInt(1, 4);
            int affectedRows=stmt.executeUpdate();
            if(affectedRows>0)
                System.out.println("Deleted successfully." + affectedRows + " Row(s) affected.");
            else
                System.out.println("No Rows affected.");
         con.close();
         stmt.close();
        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection closed.");
    }
}
