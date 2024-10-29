package connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@STIR.codixfr.private:23730:STIR";
            Connection con = DriverManager.getConnection(url, "imxdb", "manager");
            System.out.println("Connected to database");

//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            Date now = new java.sql.Date(simpleDateFormat.parse("12/02/2001").getTime());

            con.setAutoCommit(false);
//            String command = "{call msgq.edite(pName => ?, pRefdoss => ?, pDtJour => to_char(SYSDATE,'dd/mm/yyyy'), pCreateur => 'STEJ'))}";
            String command = "{call msgq.edite(pName => ?, pRefdoss => ?, pDtJour => to_char(SYSDATE,'dd/mm/yyyy'), pCreateur => 'STEJ')}";
            CallableStatement cstmt = con.prepareCall (command);

//            cstmt.registerOutParameter(2, Types.DECIMAL);
//
            cstmt.setString(1, "LE_NGHIA_03");
            cstmt.setString(2, "1901280003");
            cstmt.execute();
//            Double str = cstmt.getDouble(2);
            con.commit();
//
            cstmt.close();
            con.close();
//
//            System.out.println("Retorno: "+str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
