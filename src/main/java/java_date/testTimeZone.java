package java_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by NghiaPV on 6/27/2018.
 */
public class testTimeZone {

    public static void main(String[] args) {

        try {
            test2();
        }catch( ParseException  e){
            e.printStackTrace();
        }
    }

    static void test1(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
//        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(sdf.format(new Date()));

    }

    static void test2() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date =  sdf.parse("205-1010");
        System.out.println(date);
    }
}
