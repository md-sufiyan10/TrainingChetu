package jdbc;

import java.sql.*;

public class JDBC_01_Retrieve {
    static void main() throws ClassNotFoundException, SQLException {
        // 1: load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jdbc_db";
        String user="root";
        String password="sufi";
        String query="select * from employee";

        //2 : Establish the connection
        Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established.....");
        //3: Create a statement
        Statement stmt=con.createStatement();

        // 4: Execute the query
         ResultSet rs= stmt.executeQuery(query);
         while(rs.next()){

             int id=rs.getInt("id");
             String name=rs.getString("name");
             String job_tiltle=rs.getString("job_title");
             double salary=rs.getDouble("salary");
             System.out.println("========================");
             System.out.println("ID:"+id);
             System.out.println("Name:"+name);
             System.out.println("Job Title:"+job_tiltle);
             System.out.println("Salary:"+salary);
         }

        // 5: Close the connection
         con.close();
         stmt.close();
         rs.close();
        System.out.println("Connection Closed Successfully.....");
    }
}
