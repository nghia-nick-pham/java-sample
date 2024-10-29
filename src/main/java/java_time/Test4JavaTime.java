package java_time;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * Created by NghiaPV on 8/28/2018.
 */
public class Test4JavaTime {

    public static void main(String[] args) {
        ZoneId australia = ZoneId.of("Asia/Ho_Chi_Minh");
        String str = "2018-08-28 23:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
        ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(localtDateAndTime, australia );

        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);

        ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(ZoneOffset.UTC);

        System.out.println("Current date and time in UTC : " + utcDate);

        String[] availableIDs = TimeZone.getAvailableIDs();
//
//        for(String id : availableIDs) {
//            System.out.println("id = " + id);
//        }

        // Z = UTC+0
        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);

        // Japan = UTC+9
        ZonedDateTime jpTime = instant.atZone(ZoneOffset.UTC);

        System.out.println("ZonedDateTime : " + jpTime);

        System.out.println("OffSet : " + jpTime.getOffset());


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        sdf.setTimeZone(timeZone);
    }
}
