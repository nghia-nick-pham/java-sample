package java_number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by NghiaPV on 4/8/2018.
 */
public class MainTest
{
    public static void main(String[] args) {
//        Double doubA = 100.01;
//        if(doubA % 1 > 0)
//            System.out.println("true");
        try {
            DecimalFormat decimalFormat = new DecimalFormat("0.0000000000");
            Number str = decimalFormat.parse("4.71322222222222222222222222222222222222E02");
//            Double doub = Double.parseDouble(str);
//        BigDecimal bigd = BigDecimal.valueOf(doub);
            System.out.println(str);
//        System.out.println(bigd);
        }catch (Exception e){
            e.printStackTrace();
        }


//        float accountBalance = 10000.00f;
//        System.out.println("Operations using float:");
//        System.out.println("1000 operations for 1.99");
////        for(int i = 0; i<1000; i++){
//            accountBalance -= 1.99f;
////        }
//        System.out.println(String.format("Account balance after float operations: %f", accountBalance));
//        BigDecimal accountBalanceTwo = new BigDecimal("10000.00");
//        System.out.println("Operations using BigDecimal:");
//        System.out.println("1000 operations for 1.99");
//        BigDecimal operation = new BigDecimal("1.99");
////        for(int i = 0; i<1000; i++) {
//            accountBalanceTwo = accountBalanceTwo.subtract(operation);
////        }
//        System.out.println(String.format("Account balance after BigDecimal operations: %f", accountBalanceTwo));
    }
}
