package jdbc;

import java.sql.*;

/* DROP PROCEDURE IF EXISTS square_number;

DELIMITER $$

CREATE PROCEDURE square_number(IN a INT, OUT b INT)
BEGIN
    SET b = a * a;
END $$

DELIMITER ;

CALL square_number(5,@r);

SELECT @r;
  */
public class JDBC_11_CallableStmt {
     static void main() throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "JDBC:mysql://localhost:3306/jdbc_db";
         String user = "root";
         String password = "sufi";

         Connection conn = DriverManager.getConnection(url, user, password);

         CallableStatement callStmt = conn.prepareCall("{ call square_number(?,?)}");
         callStmt.setInt(1, 5);
         callStmt.registerOutParameter(2, Types.INTEGER);
         callStmt.execute();
         int square = callStmt.getInt(2);

         System.out.println("Square is:"  + square);
         callStmt.close();
         conn.close();

     }
}
