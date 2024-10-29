package project.eth_01.service;

import project.eth_01.common.ExceptionUtil;
import project.eth_01.dbconnector.ConnectorMySQL;
import project.eth_01.model.Transaction;

import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CrawlingFull {

    public static void doMain(List<Transaction> listTrans) throws Exception{

        Map<String, Transaction> mapResult = new HashMap<>();

//        mapResult = Crawler.CrawlData(100, 20);

        String sqlInsert = "insert into eth_trans ( txn_hash, method, block, age, address_from, address_to, name_to, value, unit, txn_free) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) on duplicate key update method = method;";
//        String sqlInsert = "insert into eth_trans ( txn_hash, method, address_from) values (?, ?, ?) on duplicate key update method = method;";
//        String sqlInsert = "insert into eth_trans ( txn_hash, method, address_from) value (?, ?, ?);";

        //insert DB
        try (Connection conn = ConnectorMySQL.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlInsert)) {
            conn.setAutoCommit(false);

//            int i = 0;
            for (Iterator<Transaction> iterator = listTrans.iterator(); iterator.hasNext();){
                Transaction tran = iterator.next();
                pstmt.setString(1, tran.getTxnHash());
                pstmt.setString(2, tran.getMethod());
                pstmt.setString(3, tran.getBlock());
                pstmt.setTimestamp(4,  new Timestamp(tran.getAge().getTime()));
                pstmt.setString(5, tran.getAddressFrom());
                pstmt.setString(6, tran.getAddressTo());
                pstmt.setString(7, "n/a");
                pstmt.setBigDecimal(8, tran.getValue());
                pstmt.setString(9, "Ether");
                pstmt.setBigDecimal(10, tran.getTxnFee());
                pstmt.addBatch();
//                i++;

//                 if (i % 1000 == 0 || i == listTrans.size()) {


//                 }

            }
//            int[] updateCounts = pstmt.executeBatch(); // Execute every 1000 items.
            pstmt.executeBatch(); // Execute every 1000 items.
//            System.out.println(Arrays.toString(updateCounts));
            conn.commit();
            conn.setAutoCommit(true);

        } catch (BatchUpdateException batchUpdateException) {
            ExceptionUtil.printBatchUpdateException(batchUpdateException);
        } catch (SQLException ex) {
            ExceptionUtil.printSQLException(ex);
        }


    }
}
