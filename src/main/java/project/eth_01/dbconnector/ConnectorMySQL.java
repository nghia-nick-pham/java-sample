package project.eth_01.dbconnector;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorMySQL {

    private static String MYSQL_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/eth_trans_db";
    private static String USER = "root";
    private static String PWD = "";



    public static void connect(Connection con) throws Exception{
        Class.forName(MYSQL_JDBC_DRIVER);
        con = DriverManager.getConnection(MYSQL_JDBC_DRIVER, USER, PWD);
    }

    public static Connection getConnection() throws Exception{
        Class.forName(MYSQL_JDBC_DRIVER);
        return DriverManager.getConnection(URL, USER, PWD);
    }
}
