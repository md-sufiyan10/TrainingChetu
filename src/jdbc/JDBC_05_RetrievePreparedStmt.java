package jdbc;

import java.sql.*;

public class JDBC_05_RetrievePreparedStmt {
    static void main() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jdbc_db";
        String user="root";
        String password="sufi";
        String query="SELECT * FROM employee ";

        Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established.....");
        PreparedStatement stmt=con.prepareStatement(query);
//        stmt.setString(1, "Amit Verma");
        ResultSet rs=stmt.executeQuery();
        while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String job_tiltle=rs.getString("job_title");
            double salary=rs.getDouble("salary");
            System.out.println("========================");
            System.out.println("ID: "+id);
            System.out.println("Name: "+name);
            System.out.println("JobTitle: "+job_tiltle);
            System.out.println("Salary: "+salary);
        }
        con.close();
        stmt.close();
        rs.close();
        System.out.println("Connection Closed Successfully.....");
    }
}
