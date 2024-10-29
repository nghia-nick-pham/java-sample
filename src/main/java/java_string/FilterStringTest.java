package java_string;

import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterStringTest {

    public static String filterString(String str) {
//        String s = Normalizer.normalize(str, Normalizer.Form.NFKC);

        // Replaces all noncharacter code points with Unicode U+FFFD
//        s = s.replaceAll("[\\p{Cn}]", "\uFFFD");
        String s = str;

        // Validate input
        Pattern pattern = Pattern.compile("<script>");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            throw new IllegalArgumentException("Invalid input");
        }
        return s;
    }

    public static void main(String[] args) {
        String maliciousInput = "<scr" + "\uFDEF" + "ipt>";
        String s = filterString(maliciousInput);
        System.out.println(s);
    }
}
