package project.eth_01.common;

public class Constant {
    //mysql
    private static String MYSQL_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/eth_trans_db";
    private static String USER = "root";
    private static String PWD = "";

    //crawler
    public static final String url = "https://etherscan.io/txs";
    public static final String paramPS = "?ps=";
    public static final String paramP = "?p=";
    public static final String STR_VALUE_PS_MAX = "100";


    //process
    public static final String STR_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

}
