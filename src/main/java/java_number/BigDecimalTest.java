package java_number;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by NghiaPV on 5/8/2018.
 */
public class BigDecimalTest {

    public static void main(String[] args) {
//        BigDecimal numAny = BigDecimal.valueOf(370352.5600000002);
//        BigDecimal numDot2 = BigDecimal.valueOf(0.2);
//        BigDecimal numDot4 = BigDecimal.valueOf(0.4);
//        BigDecimal numDot5 = BigDecimal.valueOf(0.5);
//        BigDecimal num30 = BigDecimal.valueOf(30);
//        BigDecimal bigDecBef = numDot5.divide(num30, 4,  RoundingMode.HALF_UP);
//        BigDecimal bigDecAft = numDot4.divide(num30, 4,  RoundingMode.HALF_DOWN);
//        BigDecimal bigDecComm = numDot2.divide(num30,4, RoundingMode.HALF_UP);
//
////        BigDecimal numOne = BigDecimal.ONE ;
////        numOne.add(new BigDecimal(30));
//////        BigDecimal num1 = BigDecimal.valueOf(12000) ;
//////        BigDecimal num2 = BigDecimal.valueOf(3) ;
//////        BigDecimal num3 = num1.divide(numOne, 12, BigDecimal.ROUND_HALF_UP);
////        System.out.println(numOne);
//
//        BigDecimal stockQuantity = new BigDecimal(869712);
////        BigDecimal numDefRound = numDef.setScale(0, RoundingMode.DOWN);
//        stockQuantity = stockQuantity.multiply(bigDecAft);
//
//        numAny = numAny.setScale(0, RoundingMode.HALF_UP);
//        numDot4 = numDot4.setScale(0, RoundingMode.HALF_UP);
//        numDot5 = numDot5.setScale(0, RoundingMode.HALF_UP);
////        BigDecimal stockQuantityRound = stockQuantity.set
//        System.out.println(numAny);
//        System.out.println(numDot4);
//        System.out.println(numDot5);

        BigDecimal numDot6 = BigDecimal.valueOf(490000);
        BigDecimal numDot7 = BigDecimal.valueOf(500000);
        System.out.println(numDot6.compareTo(numDot7));
    }
}
