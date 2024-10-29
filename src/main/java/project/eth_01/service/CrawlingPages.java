package project.eth_01.service;

import project.eth_01.crawler.Crawler;
import project.eth_01.dbconnector.ConnectorMySQL;
import project.eth_01.model.Transaction;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class CrawlingPages {

    public static void doMain(List<Transaction> listTrans) throws Exception{

        Map<String, Transaction> mapResult = new HashMap<>();

//        mapResult = Crawler.CrawlData(100, 20);

//        String sqlInsert = "insert into eth_trans ( txn_hash, method, block, age, address_from, address_to, name_to, value, unit, txn_free) value (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        String sqlInsert = "insert into eth_trans ( txn_hash, method, address_from) values (?, ?, ?) on duplicate key update method = method;";
//        String sqlInsert = "insert into eth_trans ( txn_hash, method, address_from) value (?, ?, ?);";

        //insert DB
        try (Connection conn = ConnectorMySQL.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlInsert)) {
             conn.setAutoCommit(false);

             int i = 0;
             for (Iterator<Transaction> iterator = listTrans.iterator(); iterator.hasNext();){
                Transaction tran = iterator.next();
                pstmt.setString(1, tran.getTxnHash());
                pstmt.setLong(2, 1);
//                pstmt.setString(3, tran.getBlock());s
//                pstmt.setDate(4, (Date) tran.getAge());
//                pstmt.setString(5, tran.getAddressFrom());
                pstmt.setString(3, tran.getAddressFrom());
//                pstmt.setString(6, tran.getAddressTo());
//                pstmt.setString(7, tran.getNameTo());
//                pstmt.setBigDecimal(8, tran.getValue());
//                pstmt.setString(9, tran.getUnit());
//                pstmt.setBigDecimal(10, tran.getTxnFee());
                pstmt.addBatch();
                i++;

//                 if (i % 1000 == 0 || i == listTrans.size()) {


//                 }

             }
//            int[] updateCounts = pstmt.executeBatch(); // Execute every 1000 items.
            pstmt.executeBatch(); // Execute every 1000 items.
//            System.out.println(Arrays.toString(updateCounts));
            conn.commit();
            conn.setAutoCommit(true);

        } catch (BatchUpdateException batchUpdateException) {
            printBatchUpdateException(batchUpdateException);
        } catch (SQLException ex) {
            printSQLException(ex);
        }


    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    public static void printBatchUpdateException(BatchUpdateException b) {

        System.err.println("----BatchUpdateException----");
        System.err.println("SQLState:  " + b.getSQLState());
        System.err.println("Message:  " + b.getMessage());
        System.err.println("Vendor:  " + b.getErrorCode());
        System.err.print("Update counts:  ");
        int[] updateCounts = b.getUpdateCounts();

        for (int i = 0; i < updateCounts.length; i++) {
            System.err.print(updateCounts[i] + "   ");
        }
    }
}
