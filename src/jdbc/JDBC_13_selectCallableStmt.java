package jdbc;

import java.sql.*;

public class JDBC_13_selectCallableStmt {
    static void main() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String user = "root";
        String password = "sufi";
        Connection conn = DriverManager.getConnection(url, user, password);

        CallableStatement cs = conn.prepareCall("{call get_Students()}");
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
//           int id=rs.getInt(1);
//           String name=rs.getString(2);
//           int marks=rs.getInt(3);
//
//            System.out.println("-------------------");
//            System.out.println("id:"+id);
//            System.out.println("name:"+name);
//            System.out.println("marks:"+marks);

            System.out.println(
                    rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

        }
        conn.close();
        cs.close();
        rs.close();

    }
}
