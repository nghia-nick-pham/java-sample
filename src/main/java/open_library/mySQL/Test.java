package open_library.mySQL;

import java.sql.*;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM dept");
        ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println("Total columns: " + rsmd.getColumnCount());

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.println(
                    "Column " + i + " [name: " + rsmd.getColumnName(i) + " - type: " + rsmd.getColumnTypeName(i) + "]");
        }
        System.out.println("--------------------");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
        con.close();

    }
}
