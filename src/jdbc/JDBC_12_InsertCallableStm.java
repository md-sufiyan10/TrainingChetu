package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_12_InsertCallableStm {
    static void main() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String user = "root";
        String password = "sufi";
        Connection conn = DriverManager.getConnection(url, user, password);

        CallableStatement cs = conn.prepareCall("{call insert_student(?,?,?)}");
        cs.setInt(1,121);
        cs.setString(2,"Mohd Sufiyan");
        cs.setInt(3,90);

        cs.execute();

        System.out.println(" Student Insert Successful");
        conn.close();
        cs.close();

    }
}
