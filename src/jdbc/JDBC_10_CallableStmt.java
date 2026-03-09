package jdbc;

import java.sql.*;

/*
*  Delimiter &&
*  create or replace procedure add_numbers(IN a int , IN b int , OUT result int)
*  Begin
*   set result=a+b;
*   End &&
*
*  calls add_numbers(10,20, @res)
*  select @res;
*   */



public class JDBC_10_CallableStmt {
    static void main() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "sufi");

        CallableStatement cst=conn.prepareCall("{call add_numbers(?,?,?)}");
        cst.setInt(1,10);
        cst.setInt(2,20);
        cst.registerOutParameter(3, Types.INTEGER);
        cst.execute();
        int result=cst.getInt(3);
        System.out.println("Result : " +result);
        conn.close();

    }
}
