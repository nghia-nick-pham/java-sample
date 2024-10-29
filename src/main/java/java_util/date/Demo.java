package java_util.date;

import org.apache.commons.lang.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by NghiaPV on 6/30/2017.
 */
public class Demo {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(DateUtils.truncate(now, Calendar.DATE));
        System.out.println(DateUtils.addMilliseconds(DateUtils.ceiling(now, Calendar.DATE), -1));
    }
}
