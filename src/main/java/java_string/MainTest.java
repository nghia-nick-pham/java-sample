package java_string;

import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by NghiaPV on 3/14/2018.
 */
public class MainTest {
    private enum DataType {
        LONG, DOUBLE, INTEGER, STRING, DATE, INT, BIGDECIMAL, BOOLEAN;
    }


    public static void main(String[] args) {
//        DataType dt = DataType.valueOf("LONG");
//        switch (dt){
//            case LONG:
//                System.out.println("LONG");
//        }

//        Object[] arrObj = new Object[]{new BigDecimal("1"), new Date(), null};
//        System.out.println(arrObj[2].getClass().getSimpleName());
//        String str1 = "abc@gmail.com";
//        String[] arrStr = str1.split(",");
//        System.out.println(arrStr);
//        try {
//            testFunction(null);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//            String str = "1.the man city.  \\br2.the woman in park\\br3.they came togeher.\\br4.And happy";
//            str = str.replaceAll("\\.\\s*\\\\br", "\\\\<breakline>");
//            str = str.replaceAll("\\\\br", " ");
//        System.out.println(str);


//            str.re
//            String newStr = str.replace( /B(?=(\d{3})+(?!\d)), ","");

//        String demotStr = ",";
//        String[] paraNames = demotStr.split(",");
//        System.out.println("abc" + paraNames[0].toString() + "def");

        String begin = "[XAMP [G [XM40[XN110[XXدرهم «";
        int a = 0;
        String end = "» DH";
        System.out.printf(parse(begin,a,end));
    }




     static Date testFunction(Date d) throws Exception{
        if (d == null) {
            throw new IllegalArgumentException("Required Parameter missing");
        }
        return new Date();
    }

//        String Str = new String("FULL NAME: HANOI EDUCATION DEVELOPEMENT AND INVESTMENT JOINT STOCK COMPANY(HN)  ");
//        System.out.println("Return Value :" );
////        System.out.println(Str.split("[\\(//)]").length);
//        for (String retval: Str.split("EDUCATION DEVELOPEMENT AND INVESTMENT JOINT STOCK COMPANY\\(HN\\)")) {
//            System.out.println(retval);
//        }
//    }

//    public static void Main(String[] args) {
//        String replaceText = "ACCOUNT NUMBER";
//        String strAllRunAfterReplace = "ACCOUNT NUMBER: {AccountNumber}                             COCACOLA";
//        int a = strAllRunAfterReplace.split(Pattern.quote(replaceText),0).length;
//        System.out.println(a);
//
//        for (String retval: strAllRunAfterReplace.split(Pattern.quote(replaceText),0)) {
//            System.out.println(retval);
//        }
//    }

//    public static void Main(String[] args) {
//        String sampleText = "HOLDING         STATUS          SETTLEMENT DATE";
//
//        for (String retval: sampleText.split("\\s?")) {
//            System.out.println(retval);
//        }

    static String parse (String begin, int a, String end){
        String result = begin.concat(String.valueOf(a)).concat(end);
        return result;
    }
}
