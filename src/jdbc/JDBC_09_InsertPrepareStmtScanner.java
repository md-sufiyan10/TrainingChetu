package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_09_InsertPrepareStmtScanner {
    static void main() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jdbc_db";
        String user="root";
        String password="sufi";
        String query="INSERT INTO employee (id,name,job_title,salary)VALUES(?,?,?,?)";

        Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Connection established Successfully....");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Employee Id:");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name:");
        String name=scanner.nextLine();
        System.out.print("Enter Employee JobTitle:");
        String jobTitle=scanner.nextLine();
        System.out.print("Enter Employee Salary:");
        double salary=scanner.nextDouble();

        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,jobTitle);
        ps.setDouble(4,salary);
       int rowsAffected= ps.executeUpdate();
       if(rowsAffected>0)
           System.out.println("Inserted successfully."+rowsAffected+" Row(s) affected.");
       else System.out.println("No Rows affected.");
       scanner.close();
        con.close();
        ps.close();
        System.out.println("Connection Closed Successfully.....");
    }
}
