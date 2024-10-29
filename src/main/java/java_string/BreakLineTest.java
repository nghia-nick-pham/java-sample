package java_string;

import java.util.regex.Pattern;

/**
 * Created by NghiaPV on 3/29/2018.
 */
public class BreakLineTest {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("");
//        sb.append("   aaa \n");
//        sb.append("     bbb          \n");
//        sb.append("ccc  \n");
//        sb.append("\n");
//        sb.append("ddd\r\n");
//        sb.append("\r\n");
//        sb.append("eee\n");
//
//        String text = sb.toString();
//        System.out.println("---Original---");
//        System.out.println(text);
//
//        System.out.println("---Split---");
//        int count = 1;
//        String[] lines = text.split("\\r?\\n");
//        for (String line : lines) {
//            System.out.println("line " + count++ + " : " + line);
//        }

//        String abc = "The meeting between US President Donald Trump and the Entertainment Software Association (ESA) trade group comes less than a month after a teenaged gunman bearing a semi-automatic weapon shot dead 17 people at his former Florida high school.\\n Mr Donald Trump annouce that.\\nAnd ESA reject that.";
//        String[] lines = abc.split(Pattern.quote("\\n"));
//        System.out.println(lines);

        String def = "The meeting between US President Donald Trump and the Entertainment Software Association (ESA) trade group comes less than a month after a teenaged gunman bearing a semi-automatic weapon shot dead 17 people at his former Florida high school.\n Mr Donald Trump annouce that.\nAnd ESA reject that.";
        System.out.println(def.contains("\n"));
    }
}
